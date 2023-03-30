package tp1;

public class ToBinaryTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        String hex1 = "A9";
        System.out.println(calculator.fromHex(hex1));

        String hex2 = "3AB2";
        System.out.println(calculator.fromHex(hex2));

        String hex3 = "1f772";
        System.out.println(calculator.fromHex(hex3));
    }
}
