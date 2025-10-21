public class Fish extends Animal implements Predator, Prey{

    @Override
    void moves() {
        System.out.println("This animal is swimming");
    }

    @Override
    public void flee(){
        System.out.println("The Fish is running away.");
    };

    @Override
    public void hunt(){
        System.out.println("The Fish is hunting.");
    };
}
