import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman_Game {

    public static void main(String[] args) {

        // Java Hangman Game

        String filePath = "src\\words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null){
                words.add(line.trim());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found.");
        }
        catch (IOException e){
            System.out.println("Shit just hit a fan.");
        }

        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to Java Hangman Game\n");

        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        while (wrongGuesses < 6){
            System.out.print("Word: ");

            for (char c : wordState){
                System.out.print(c + " ");
            }
            System.out.println();
            System.out.println(getHangmanArt(wrongGuesses));

            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if(word.indexOf(guess) >= 0){
                System.out.println("Correct guess!\n");
                for (int i = 0; i < word.length(); i++) {
                    if(word.charAt(i) == guess){
                        wordState.set(i, guess);

                    }
                }

                if(!wordState.contains('_')){
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("You win!");
                    System.out.println("The word was: " + word);
                    break;
                }
            }
            else {
                System.out.printf("There is no '%c' letter in a word.\n", guess);
                wrongGuesses++;
            }
        }

        if(wrongGuesses >= 6){
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("Game over!");
            System.out.println("The word was " + word);
        }



        scanner.close();


    }

    static String getHangmanArt(int wronguesses){
        return switch (wronguesses){
            case 0 -> """
                    
                    
                    
                    """;
            case 1 -> """
                     o
                    
                    
                    """;
            case 2 -> """
                     o
                     |
                    
                    """;
            case 3 -> """
                     o
                    /|
                    
                    """;
            case 4 -> """
                     o
                    /|\\
                    
                    """;
            case 5 -> """
                     o
                    /|\\
                    /
                    """;
            case 6 -> """
                     o
                    /|\\
                    / \\
                    """;
            default -> "";
        };
    }



}
