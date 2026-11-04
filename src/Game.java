public class Game {

    String name;
    String publisher;

    Game(String name, String publisher){
        this.name = name;
        this.publisher = publisher;
    }

    void release(){
        System.out.printf("%s just released %s game.\n", this.publisher, this.name);
    }
}
