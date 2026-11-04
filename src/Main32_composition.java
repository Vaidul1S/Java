public class Main32_composition {

    public static void main(String[] args) {

        // Composition - Represents a part of relationship between objects.
        // Allows complex objects to be constructed from smaller objects.

        Rocket rocket1 = new Rocket("Saturn 5", 1960, "F1");

        System.out.println(rocket1.model);
        System.out.println(rocket1.year);
        System.out.println(rocket1.engine.brand);

        rocket1.start();

        Rocket rocket2 = new Rocket("Falcon 9", 2020, "Raptor 5");

        System.out.println(rocket2.model);
        System.out.println(rocket2.year);
        System.out.println(rocket2.engine.brand);

        rocket2.start();


    }



}
