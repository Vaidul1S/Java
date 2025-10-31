public class Main25_inheritance {

    public static void main(String[] args) {

        // parent -> child, kaip C# class child extends parent

        Dog gucci = new Dog();
        Cat puga = new Cat();

        gucci.eat();
        puga.eat();

        gucci.speak();
        puga.speak();

        // super - Refers to the parent class, used in method and constructor overriding

        Person person1 = new Person("Cinna", 29, 156);
        person1.sing();

        Streamer streamer = new Streamer("Emi", 27, 159, 40000);
        streamer.showViewers();


    }



}
