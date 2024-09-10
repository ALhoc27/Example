package other;

public class MyStringOps {
    String strReverse(String str) {
        String strReverseResult = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            strReverseResult += str.charAt(i);
        }
        return strReverseResult;
    }
}
class MethodRefDemo {
    static String stringOp(StringFunc sf, String str) {
        return sf.func(str);
    }

    public static void main(String[] args) {
        System.out.println(stringOp(new MyStringOps()::strReverse, "Hello World"));
    }
}
