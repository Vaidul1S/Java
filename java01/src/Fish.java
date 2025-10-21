public class Fish extends Animal implements Predator, Prey{

    @Override
    void moves() {
        System.out.println("This animal is swimming");
    }

    @Override
    void speak(){
        System.out.println("The Fish goes bubbles.");
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
