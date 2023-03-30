package tp1;

import java.util.HashMap;
import java.util.Map;

public class Calculator implements Calculator_I {

    Map<String, String> fromBinaryToHex = new HashMap<>();
    Map<String, String> fromHexToBinary = new HashMap<>();

    public Calculator() {
        fromBinaryToHex = createMapBinaryToHex();
        fromHexToBinary = createMapHexToBinary();
    }

    @Override
    public String sum(String a, String b) {
        if (a.length() == b.length()) {
            return sumHelper(a, b);
        } else if (a.length() > b.length()) {
            String newB = fill(a, b);
            return sumHelper(a, newB);
        } else {
            String newA = fill(b, a);
            return sumHelper(newA, b);
        }
    }

    private String fill(String longerString, String shorterString) {
        String zeros = "";
        for (int i = 0; i < (longerString.length() - shorterString.length()); i++) {
            zeros += "0";
        }
        return zeros + shorterString;
    }


    @Override
    public String sub(String a, String b) {
        if (a.length() > b.length()) {
            b = fill(a, b);
        } else {
            a = fill(b, a);
        }
        String tempResult = sum(a, oppositeB(b));
        return tempResult.substring(1);
    }


    @Override
    public String mult(String a, String b) {
        return null;
    }

    @Override
    public String div(String a, String b) {
        return null;
    }

    @Override
    public String toHex(String binary) {
        StringBuilder finalResult = new StringBuilder();
        StringBuilder fourDigitsResult = new StringBuilder();
        if (binary.length() % 4 != 0) {
            while (binary.length() % 4 != 0) {
                binary = "0" + binary;
            }
        }
        for (int i = 0; i < binary.length() - 1; i += 4) {
            for (int j = i; j < i + 4; j++) {
                fourDigitsResult.append(binary.charAt(j));
            }
            finalResult.append(fromBinaryToHex.get(fourDigitsResult.toString()));
            fourDigitsResult = new StringBuilder();
        }
        if (finalResult.charAt(0) == '0'){
            finalResult = new StringBuilder(finalResult.substring(1));
        }
        return finalResult.toString();
    }

    @Override
    public String fromHex(String hex) {
        return null;
    }

    private String sumHelper(String a, String b) {
        boolean carry = false;
        StringBuilder result = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == b.charAt(i)) {
                if (carry) {
                    result.append("1");
                    carry = false;
                } else result.append("0");
                if (a.charAt(i) == '1') {
                    carry = true;
                }
            } else {
                if (carry) {
                    result.append("0");
                } else result.append("1");
            }
        }
        if (carry) {
            result.append("1");
        }
        result.reverse();
        return result.toString();
    }

    private String oppositeB(String b) {
        StringBuilder newB = new StringBuilder();
        for (int i = 0; i < b.length(); i++) {
            newB.append(opposite(b.charAt(i)));
        }
        return sum(newB.toString(), "1");
    }

    private String opposite(char c) {
        return (c == '0') ? "1" : "0";
    }

    private Map<String, String> createMapBinaryToHex() {
        fromBinaryToHex.put("0000", "0");
        fromBinaryToHex.put("0001", "1");
        fromBinaryToHex.put("0010", "2");
        fromBinaryToHex.put("0011", "3");
        fromBinaryToHex.put("0100", "4");
        fromBinaryToHex.put("0101", "5");
        fromBinaryToHex.put("0110", "6");
        fromBinaryToHex.put("0111", "7");
        fromBinaryToHex.put("1000", "8");
        fromBinaryToHex.put("1001", "9");
        fromBinaryToHex.put("1010", "A");
        fromBinaryToHex.put("1011", "B");
        fromBinaryToHex.put("1100", "C");
        fromBinaryToHex.put("1101", "D");
        fromBinaryToHex.put("1110", "E");
        fromBinaryToHex.put("1111", "F");
        return fromBinaryToHex;
    }

    private Map<String, String> createMapHexToBinary() {
        fromHexToBinary.put("0", "0000");
        fromHexToBinary.put("1", "0001");
        fromHexToBinary.put("2", "0010");
        fromHexToBinary.put("3", "0011");
        fromHexToBinary.put("4", "0100");
        fromHexToBinary.put("5", "0101");
        fromHexToBinary.put("6", "0110");
        fromHexToBinary.put("7", "0111");
        fromHexToBinary.put("8", "1000");
        fromHexToBinary.put("9", "1001");
        fromHexToBinary.put("A", "1010");
        fromHexToBinary.put("B", "1011");
        fromHexToBinary.put("C", "1100");
        fromHexToBinary.put("D", "1101");
        fromHexToBinary.put("E", "1110");
        fromHexToBinary.put("F", "1111");
        return fromHexToBinary;
    }
}
