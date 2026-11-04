public abstract class Animal {

    boolean isAlive;

    Animal(){
        isAlive = true;
    }

    void eat(){
        System.out.println("The animal is eating.");
    }

    void moves(){
        System.out.println("The animal is running.");
    }

    abstract void speak();
}
