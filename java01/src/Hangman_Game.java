import java.util.ArrayList;
import java.util.Scanner;

public class Hangman_Game {

    public static void main(String[] args) {

        // Java Hangman Game

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to Java Hangman Game\n");

        String word = "pizza";

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
