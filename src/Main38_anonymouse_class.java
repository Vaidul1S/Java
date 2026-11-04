public class Main38_anonymouse_class {

    public static void main(String[] args) {

        // anonymouse class - a class than does NOT have a name. Can NOT be reused.
        // add custom behavior without having to create a new class
        // often used for one time uses (TimeTask, Runnable, callbacks)

        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("Brian Griffin says: 'I'm a writer'.");
            }
        };

        dog1.speak();
        dog2.speak();


    }


}
