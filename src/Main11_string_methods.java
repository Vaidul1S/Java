import java.util.Scanner;

public class Main11_string_methods {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String name = "    Gauruotas Sausainis    ";

        name = name.trim();

        int length = name.length();
        System.out.println(length);

        char letter = name.charAt(0);
        System.out.println(letter);

        int index = name.indexOf("S");
        System.out.println(index);

        int lastIndex = name.lastIndexOf("s");
        System.out.println(lastIndex);

        String nameLower = name.toLowerCase();
        System.out.println(nameLower);

        String nameUpper = name.toUpperCase();
        System.out.println(nameUpper);

        name = name.replace("i", "1");
        System.out.println(name);

        System.out.println(name.isEmpty());

        int space = 0;
        if(name.contains(" ")){
            space += 1;
            System.out.printf("Your name contains %d space(s).\n", space);
        }

        String email;
        System.out.print("Enter your email: ");
        email = scanner.nextLine();
        //String subString = email.substring(0, 9));

        if(email.contains("@") && email.contains(".")){
            String subString = email.substring(0, email.indexOf("@"));
            System.out.println("Your username: " + subString);

            String domain = email.substring(email.indexOf("@") + 1);
            System.out.println("Your domain: " + domain);
        } else {
            System.out.println("Invalid email!");
        }



        scanner.close();
    }
}
