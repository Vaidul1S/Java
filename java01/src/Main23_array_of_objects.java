import java.util.Scanner;

public class Main23_array_of_objects {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Game game1 = new Game("Far Cry 53", "Ubisoft");
        Game game2 = new Game("Red Alert 5", "Westwood studios");
        Game game3 = new Game("StarCraft World", "Blizzard North");

        Game[] games = {game1, game2, game3};

        for (int i = 0; i < games.length; i++) {
            games[i].release();
        }


        scanner.close();


    }



}
