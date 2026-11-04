public class Streamer extends Person{

    double viewers;

    Streamer(String name, int age, double height, double viewers){
        super(name, age, height);
        this.viewers = viewers;
    }

    void showViewers(){
        System.out.println(this.name + " average viewership is " + viewers);
    }
}
