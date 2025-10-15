import java.util.Scanner;

public class Main18_array_iteration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {5, 72, 6, 8, 7, 98, 9, 31};
        String[] cars = {"Ford", "Audi", "Mercedes", "Fiat"};
        int target = 2;
        System.out.print("Enter a car to search to: ");
        String target2 = scanner.nextLine();
        boolean isFound = false;
        boolean stringFound = false;

        for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
                System.out.print("\nElement found at index: " + i);
                isFound = true;
                break;
            }
        }

        for(int i = 0; i < cars.length; i++){
            if(cars[i].equals(target2)){
                System.out.print("\nElement found at index: " + i);
                stringFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("\nElement not found in the array of numbers.");
        }

        if(!stringFound){
            System.out.println("Element not found in the array of cars.");
        }

        scanner.close();
    }


}
