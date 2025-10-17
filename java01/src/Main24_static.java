import java.util.Scanner;

public class Main24_static {

    public static void main(String[] args) {

        // stattic - Makes a variable or method belong to class
        Scanner scanner = new Scanner(System.in);

        Friend friend1 = new Friend("Peter");
        Friend friend2 = new Friend("Quagmire");
        Friend friend3 = new Friend("Joe");
        Friend friend4 = new Friend("Cleavland");

        System.out.println(Friend.numOfFriends);
        Friend.showFriends();


        Math.round(5.99);           // static method for example

        scanner.close();


    }



}
