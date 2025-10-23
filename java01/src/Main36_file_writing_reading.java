import javax.sound.sampled.*;
import java.io.*;
import java.util.Scanner;

public class Main36_file_writing_reading {

    public static void main(String[] args) {

        // How to write a file using java

        // FileWriter - for small or medium text files
        // BufferWriter - for large text
        // PrintWriter - for structured data like reports or logs
        // FileOutputStream - for binary files like images, audio
        // There is more

        Scanner scanner = new Scanner(System.in);

        String filePath = "src\\text.txt";
        String textContent = "I like pizza.\nBut I eat it rarely.\nI don't want to become fat.";

        try (FileWriter writer = new FileWriter(filePath);) {
            writer.write(textContent);
            System.out.println("File has been written");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Could not write the file");
        }

        // How to read a file using java

        // BufferedReader + FileReader - for text files line by line
        // FileInputStream - for binary
        // RandomAccessFile - for read/write specific portion of a large file
        // There is more too

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("File found.");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file.");
        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }

        // audio file

        String filePathAudio = "src\\sample.wav";
        File file = new File(filePathAudio);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String respone = "";
            while (!respone.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter you choice: ");

                respone = scanner.next().toUpperCase();

                switch (respone){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice!");
                }
            }

            System.out.println("All good.");
        }
        catch (FileNotFoundException e){
            System.out.println("File not found.");
        }
        catch (LineUnavailableException e){
            System.out.println("Unable to access audio resource.");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported.");
        }
        catch (IOException e) {
            System.out.println("Shit just hit a fan.");
        }
        finally {
            System.out.println("Bye bye.");
        }




        scanner.close();


    }



}
