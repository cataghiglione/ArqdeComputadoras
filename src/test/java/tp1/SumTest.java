package tp1;

public class SumTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        String a1 = "10";
        String b1 = "01";
        System.out.print(calculator.sum(a1, b1));

        System.out.println();

        String a2 = "101101";
        String b2 = "011011";
        System.out.print(calculator.sum(a2, b2));

        System.out.println();

        String a3 = "1010";
        String b3 = "11011";
        System.out.print(calculator.sum(a3, b3));

        System.out.println();

        String a4 = "1111";
        String b4 = "1111";
        System.out.print(calculator.sum(a4, b4));

        System.out.println();

        String a5 = "01101";
        String b5 = "1";
        System.out.print(calculator.sum(a5, b5));

    }

}
