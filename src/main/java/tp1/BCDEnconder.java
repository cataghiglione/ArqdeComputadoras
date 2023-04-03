package tp1;

import java.util.HashMap;
import java.util.Map;

public class BCDEnconder implements BCDEncoder_I {

    @Override
    public String encode(int a) {
        Map<Character, String> fromIntToBCD = createMapIntToBCD(new HashMap<>());
        String strA = Integer.toString(a);
        StringBuilder bcdA = new StringBuilder();
        for (int i = 0; i < strA.length(); i++) {
            bcdA.append(fromIntToBCD.get(strA.charAt(i)));
        }
        return bcdA.toString();
    }
    private Map<Character, String> createMapIntToBCD(HashMap<Character, String> fromIntToBCD) {
        fromIntToBCD.put('0', "0000");
        fromIntToBCD.put('1', "0001");
        fromIntToBCD.put('2', "0010");
        fromIntToBCD.put('3', "0011");
        fromIntToBCD.put('4', "0100");
        fromIntToBCD.put('5', "0101");
        fromIntToBCD.put('6', "0110");
        fromIntToBCD.put('7', "0111");
        fromIntToBCD.put('8', "1000");
        fromIntToBCD.put('9', "1001");
        return fromIntToBCD;
    }

    @Override
    public int decode(String a) {
        StringBuilder aBuilder = new StringBuilder(a);
        while (aBuilder.length() % 4 != 0) {
            aBuilder.insert(0, "0");
        }

        Map<String, Character> map = createMapBCDToInt(new HashMap<>());
        StringBuilder intAsStr = new StringBuilder();
        for (int i = 0; i < aBuilder.length(); i+=4) {
            intAsStr.append(map.get(aBuilder.substring(i, i+4)));
        }

        return Integer.parseInt(intAsStr.toString());
    }
    private Map<String, Character> createMapBCDToInt(HashMap<String, Character> fromIntToBCD) {
        fromIntToBCD.put("0000", '0');
        fromIntToBCD.put("0001", '1');
        fromIntToBCD.put("0010", '2');
        fromIntToBCD.put("0011", '3');
        fromIntToBCD.put("0100", '4');
        fromIntToBCD.put("0101", '5');
        fromIntToBCD.put("0110", '6');
        fromIntToBCD.put("0111", '7');
        fromIntToBCD.put("1000", '8');
        fromIntToBCD.put("1001", '9');
        return fromIntToBCD;
    }
}
