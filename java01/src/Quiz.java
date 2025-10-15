import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to the Quiz Game!\n");

        String[] questions = {"1. What does CPU stand for?",
                              "2. Which of the following is an example of computer memory?",
                              "3. What is the main function of the motherboard?",
                              "4. Which type of storage is non-volatile (keeps data even when powered off)?",
                              "5. What does GPU primarily handle?",
                              "6. Which of these operating systems is open-source?",
                              "7. In computing, what does BIOS do?",
                              "8. What is the oldest coding language?"};

        String[][] options = {{"1. Central Processing Unit", "2. Control Program Unit", "3. Central Power Utility", "4. Computer Processing Unit"},
                {"1. Hard drive", "2. RAM", "3. Power supply", "4. Monitor"},
                {"1. Store data permanently", "2. Connect all computer components together", "3. Display graphics", "4. Control the cooling system"},
                {"1. RAM", "2. Cache", "3. SSD", "4. CPU"},
                {"1. Internet connectivity", "2. Sound output", "3. Graphics and image rendering", "4. Power management"},
                {"1. Windows 11", "2. macOS","3. Linux", "4. Chrome OS"},
                {"1. Controls power supply", "2. Loads the operating system when the computer starts", "3. Manages network connections", "4. Cleans the system cache"},
                {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};

        int[] correctAnswers = {1, 1, 2, 3, 3, 3, 2, 3};
        int score = 0;
        int guess;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for(String option : options[i]){
                System.out.println("\t" + option);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            if (guess == correctAnswers[i]){
                System.out.println("\nCorrect!\n");
                score++;
            } else {
                System.out.println("\nWrong!\n");
            }
        }

        System.out.println("Your final score is: " + score + " out of " + questions.length + ".");

        scanner.close();
    }



}
