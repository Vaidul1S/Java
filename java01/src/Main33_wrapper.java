public class Main33_wrapper {

    public static void main(String[] args) {

        // Wrapper classes - allow primitive values to be used as objects.
        // Char, int, double, boolean are wrappers

        // Integer a = new Integer(123);
        // Double b = new Double(3.14);
        // Character c = new Character("€");
        // Boolean d = new Boolean(true);

        // Autoboxing

        Integer a = 123;
        Double b = 3.14;
        Character c ='€';
        Boolean d = true;

        // Unboxing

        int x = a;
        double y = b;
        char z = c;
        boolean g = d;

        String a1 = Integer.toString(123);
        String b1 = Double.toString(2.73);
        String c1 = Character.toString('@');
        String d1 = Boolean.toString(false);
        String e1 = ".com";

        String j = a1+b1+c1+d1+e1;
        System.out.println(j);

        int a2 = Integer.parseInt("123");
        double b2 = Double.parseDouble("2.73");
        char c2 = "Pizza".charAt(0);
        boolean d2 = Boolean.parseBoolean("false");

        char letter = 'g';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));


    }


}
