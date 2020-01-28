import org.junit.jupiter.api.Test;

public class HomePractice {
    @Test
    public void numbers() {
        int a = 500;
        int b = 5;
        System.out.println(a + b);

        int division = a / b;
        System.out.println(division);

        double multiply = a * b;
        System.out.println(multiply);

        int subtraction = b - a;
        System.out.println(subtraction);

        boolean difference = division < multiply;
        System.out.println(difference);

        String animal = "cat";
        String name = "Hodor";
        String phrase = "meow";
        int age = 2;
        System.out.println(animal + " " + name + " " + age + " " + phrase);
    }
}
