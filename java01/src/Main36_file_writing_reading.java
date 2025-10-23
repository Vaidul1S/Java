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

        try(FileWriter writer = new FileWriter(filePath);){
            writer.write(textContent);
            System.out.println("File has been written");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e){
            System.out.println("Could not write the file");
        }

        // How to read a file using java

        // BufferedReader + FileReader - for text files line by line
        // FileInputStream - for binary
        // RandomAccessFile - for read/write specific portion of a large file
        // There is more too

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            System.out.println("File found.");
            String line;
            while ((line = reader.readLine()) !=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e){
            System.out.println("Could not locate file.");
        } catch (IOException e){
            System.out.println("Something went wrong.");
        }




        scanner.close();


    }



}
