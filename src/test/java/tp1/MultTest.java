package tp1;

public class MultTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        String a1 = "0001";
        String b1 = "0001";
        System.out.println(calculator.mult(a1, b1));

        String a2 = "0110";
        String b2 = "1000";
        System.out.println(calculator.mult(a2, b2));

        String a3 = "111";
        String b3 = "1001";
        System.out.println(calculator.mult(a3, b3));

        String a4 = "10100";
        String b4 = "11110";
        System.out.println(calculator.mult(a4, b4));
    }
}
