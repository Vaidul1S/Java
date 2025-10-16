public class Person {
    String name;
    int age;
    double height;
    boolean isCelebrity;

    // constructor
    Person(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
        this.isCelebrity = true;
    }

    void sing(){
        System.out.println(name + " is singing.");
    }
}
