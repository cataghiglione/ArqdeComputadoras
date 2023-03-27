package tp1;

public class SubtractTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        String a1 = "1011011";
        String b1 = "0101110";
        System.out.println(calculator.sub(a1, b1));

        String a2 = "100";
        String b2 = "1";
        System.out.println(calculator.sub(a2, b2));

        String a3 = "10";
        String b3 = "1";
        System.out.println(calculator.sub(a3, b3));

        String a4 = "11011011";
        String b4 = "00010111";
        System.out.println(calculator.sub(a4, b4));
    }
}
