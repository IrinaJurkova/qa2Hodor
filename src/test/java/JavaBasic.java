import org.junit.jupiter.api.Test;

public class JavaBasic {

    @Test
    public void javaBasicsCheck()  {
//        int a = 10;
//        int b = 5;
        sumDwoDigits( 10, 5);

//        System.out.println("First variable is: " + a + "second is: " +b );
          System.out.println("Sum is: " + sumDwoDigits( 10, 5));

//        int e = 100;
//        int f = 33;
        int sumFF = sumDwoDigits( 100, 33);

        System.out.println("Sum is:" + sumDwoDigits(100, 33 ) );

        System.out.println(100 + 33);
        String c = "10";
        String d = "5";

        System.out.println(c + d);
    }

    private int sumDwoDigits (int a, int b) {
        int sum = a + b;
        System.out.println("Sum is: " + (a + b));
            return sum;
    }
}
