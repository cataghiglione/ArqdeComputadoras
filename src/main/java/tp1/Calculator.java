package tp1;

public class Calculator implements Calculator_I {
    @Override
    public String sum(String a, String b) {
        if (a.length() == b.length()) {
            return sumHelper(a, b);
        }
        else if (a.length() > b.length()) {
            String zeros = "";
            for (int i = 0; i < (a.length() - b.length()); i++) {
                zeros += "0";
            }
            String newB = zeros + b;
            return sumHelper(a, newB);
        } else {
            String zeros = "";
            for (int i = 0; i < (b.length() - a.length()); i++) {
                zeros += "0";
            }
            String newA = zeros + a;
            return sumHelper(newA, b);
        }
    }


    private String sumHelper(String a, String b) {
        boolean carry = false;
        StringBuilder result = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == b.charAt(i)) {
                if (carry) {
                    result.append("1");
                    carry = false;
                }
                else result.append("0");
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

    @Override
    public String sub(String a, String b) {
        return null;
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
        return null;
    }

    @Override
    public String fromHex(String hex) {
        return null;
    }
}
