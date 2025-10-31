public class Main23_array_of_objects {

    public static void main(String[] args) {

        Game game1 = new Game("Far Cry 9", "Ubisoft");
        Game game2 = new Game("Red Alert 5", "Westwood studios");
        Game game3 = new Game("StarCraft World", "Blizzard North");

        Game[] games1 = {game1, game2, game3};

        for (Game game : games1) {
            game.release();
        }

        Game[] games2 = {new Game("Assassin Creed 8", "Ubisoft"),
                new Game("Assassin Creed 9", "Ubisoft"),
                new Game("Assassin Creed 10", "Ubisoft"),};

        for (Game game : games2) {
            game.release();
        }


    }



}
