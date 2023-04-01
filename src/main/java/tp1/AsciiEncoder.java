package tp1;


import static java.lang.Math.pow;

public class AsciiEncoder implements AsciiEncoder_I{
    @Override
    public String encode(String binary) {
        if (binary.length()%8 != 0){
            return "Not valid";
        }
        StringBuilder result = new StringBuilder();
        for (int i =0; i<binary.length(); i+=8){
            int decimal = binaryToNumber(binary.substring(i,i+8));
            result.append((char) decimal);
        }
        return result.toString();
    }

    @Override
    public String decode(String ascii) {
        StringBuilder binaryString = new StringBuilder();
        for (int i = 0; i < ascii.length(); i++) {
            binaryString.append(numberToBinary(ascii.charAt(i)));
            binaryString.append(" ");
        }
        return binaryString.toString();
    }
    private int binaryToNumber(String binary){
        int result = 0;
        for (int i =7; i>=0; i--){
            if (binary.charAt(i) == 49){
                result+= pow(2,7-i);
            }
        }
        return result;
    }
    private String numberToBinary(int number){
        int quotient=number;
        int remainder=0;
        StringBuilder result = new StringBuilder();
        result.append("");
        while(quotient>1){
            remainder = quotient%2;
            result.append(remainder);
            quotient=quotient/2;
        }
        result.append(quotient);
        result.reverse();
        String binaryString = completeWithZeros(result.toString());
        return binaryString;

    }
    private String completeWithZeros(String binary){
        int length = binary.length();
        StringBuilder result = new StringBuilder(binary);
        result.reverse();
        for (int i = 0; i < 8-length; i++) {
            result.append("0");
        }
        result.reverse();
        return result.toString();
    }
}
