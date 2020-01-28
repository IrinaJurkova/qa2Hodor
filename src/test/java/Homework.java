import org.junit.jupiter.api.Test;

public class Homework {
    @Test
    public void task1() {
        String name = "Дима";
        int age = 33;

        System.out.println("Привет," + name + ", тебе увы аж " + age);
    }

    @Test
    public void task2() {
        double fuel = 10;
        double distance = 100;
        double formula = fuel / distance * 100;
        System.out.println("Average fuel consumption on 100 km ");
        System.out.println(formula);
    }
    @Test
    public void  task3 () {
        double wheelRadius = 30;
        double lengthOfWheelCm = 2 * 3.14 * wheelRadius;
        double lengthOfWheelM = lengthOfWheelCm / 100;
        double lengthOfWheelKm = lengthOfWheelM / 1000;
        double formula = 1000 / lengthOfWheelKm;
        System.out.println("On 1000 km wheel rotates");
        System.out.println(formula + "  times");
    }
}
