package tp1;

public class ToHexTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        String binary1 = "1101";
        System.out.println(calculator.toHex(binary1));

        String binary2 = "00111011";
        System.out.println(calculator.toHex(binary2));

        String binary3 = "000101001";
        System.out.println(calculator.toHex(binary3));




    }
}
