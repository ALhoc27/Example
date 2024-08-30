package other;

public class LambdasAsArgumentsDemo {
    static String stringOp (StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String str = "LambdasAsArgumentsDemo stringOp";

        String outStr = stringOp(trAv -> trAv.toLowerCase(), str);

        String outStr2 = stringOp(trAv -> {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
            }
            return result;
        }, str);

    System.out.println(outStr);
    System.out.println(outStr2);
    }
}
