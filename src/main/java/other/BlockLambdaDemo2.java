package other;

import org.w3c.dom.ls.LSOutput;

public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        SomeFunc<String> stringFunc = (str) -> {
            String result = "";

            for (int i = str.length()-1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println(stringFunc.func("Lambda"));

        SomeFunc<Integer> integerSomeFuncFactorial = n -> {
            int result = 1;
             for (int i=1; i<=n; i++) {
                result *=i;
            }
            return result;
        };
        System.out.println(integerSomeFuncFactorial.func(4));
        printL();
    }
    char ch = 65010;

    static void printL() {
        System.out.println(new BlockLambdaDemo2().ch);
    }
}
