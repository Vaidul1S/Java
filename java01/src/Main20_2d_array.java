public class Main20_2d_array {

    public static void main(String[] args) {

        String[] fruits = {"Apple", "Greatfruit", "Orange", "Lime", "Pear", "Banana"};
        String[] vegetables = {"Potato", "Onion", "Carrot"};
        String[] meats = {"Chicken", "Beef", "Pork", "Lamb"};

        String[][] groceries1 = {fruits, vegetables, meats};
        String[][] groceries2 = {{"Apple", "Greatfruit", "Orange", "Lime", "Pear", "Banana"},
                                {"Potato", "Onion", "Carrot"},
                                {"Chicken", "Beef", "Pork", "Lamb"}};

        groceries2[1][0] = "Celery";

        for(String[] foods : groceries1){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }

        for(String[] foods : groceries2){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }

        char[][] telephone = {{'1', '2', '3'},
                                {'4', '5', '6'},
                                {'7', '8', '9'},
                                {'*', '0', '#'}};

        for(char[] row : telephone){
            for (char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }

        
    }



}
