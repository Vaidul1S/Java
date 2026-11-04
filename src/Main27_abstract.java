public class Main27_abstract {

    public static void main(String[] args) {

        // Abstract

        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3,4);
        Rectangle rectangle = new Rectangle(6,9);

        circle.display();

        System.out.printf("%.1f cm²\n", circle.area());
        System.out.printf("%.1f cm²\n", triangle.area());
        System.out.printf("%.1f cm²\n", rectangle.area());


    }



}
