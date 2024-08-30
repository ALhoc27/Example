package stringExample;

public class ExampleStr {
    public int stateMan(int rez) {
        int b = 0;
        while (rez / 2 != 1) {
            rez = rez/2;
            b++;
        }
        b = b + 1;
        return b;
    }

    public static void main(String[] args) {
        char ch;

        for(int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(" " + ch + " ");
            ch = (char) ((int) ch & 65503);
            System.out.println(ch + "");
            System.out.print("");
            ch = (char) ((int) ch);
            System.out.print(ch);
        }
        System.out.println("");
        int x = 32;
        int y = 6;
        System.out.println(Integer.toBinaryString(64));
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
        System.out.println("");

        System.out.println(Integer.toBinaryString(2));
        System.out.println(Integer.toBinaryString(4));
        System.out.println(Integer.toBinaryString(8));
        System.out.println(Integer.toBinaryString(7));
        System.out.println(Math.sqrt(32));


        ExampleStr exampleStr = new ExampleStr();
        int ttr = 256;
        System.out.println("_______________");
        int t = exampleStr.stateMan(ttr);
        System.out.println(t);
        System.out.println(Integer.toBinaryString(ttr));
        System.out.println("_______________");
        System.out.println("");
        System.out.println(Integer.parseInt("1", 2));
        System.out.println(Integer.parseInt("11", 2));
        System.out.println(Integer.parseInt("111", 2));
        System.out.println(Integer.parseInt("1111", 2));
        System.out.println(Integer.parseInt("11111", 2));
        System.out.println(Integer.parseInt("111111", 2));
        System.out.println(Integer.parseInt("1111111", 2));
        System.out.println(Integer.parseInt("11111111", 2));
        System.out.println("");
        System.out.println(Integer.parseInt("01", 2));
        System.out.println(Integer.parseInt("10", 2));
        System.out.println(Integer.parseInt("100", 2));
        System.out.println(Integer.parseInt("1000", 2));
        System.out.println(Integer.parseInt("10000", 2));
        System.out.println(Integer.parseInt("100000", 2));
        System.out.println("");
        System.out.println(Integer.parseInt("0011", 2));
        System.out.println(Integer.parseInt("0110", 2));
        System.out.println(Integer.parseInt("1100", 2));
        System.out.println(Integer.parseInt("11000", 2));
        System.out.println(Integer.parseInt("110000", 2));
        System.out.println(Integer.parseInt("1100000", 2));
        System.out.println("");
        System.out.println(Integer.parseInt("0111", 2));
        System.out.println(Integer.parseInt("1110", 2));
        System.out.println(Integer.parseInt("111000", 2));
        System.out.println(Integer.parseInt("1110000", 2));
        System.out.println(Integer.parseInt("11100000", 2));
        System.out.println(Integer.parseInt("111000000", 2));
        System.out.println("_________");
        System.out.println("");
        System.out.println(Integer.parseInt("01", 2));
        System.out.println(Integer.parseInt("10", 2));
        System.out.println(Integer.parseInt("11", 2));
        System.out.println(Integer.parseInt("110", 2));
        System.out.println(Integer.parseInt("111", 2));
        System.out.println(Integer.parseInt("1110", 2));
        System.out.println(Integer.parseInt("1111", 2));
        System.out.println("_________++++++++++");
        System.out.println(Integer.parseInt("00000000", 2));
        System.out.println(Integer.parseInt("00000001", 2));
        System.out.println(Integer.parseInt("00000010", 2));
        System.out.println(Integer.parseInt("00000011", 2));
        System.out.println(Integer.parseInt("00000100", 2));
        System.out.println(Integer.parseInt("00000101", 2));
        System.out.println(Integer.parseInt("00000110", 2));
        System.out.println(Integer.parseInt("01000111", 2));
        System.out.println(Integer.parseInt("10000000", 2));
        System.out.println(Integer.parseInt("10000001", 2));
        System.out.println(Integer.parseInt("10000010", 2));
        System.out.println(Integer.parseInt("10000100", 2));
        System.out.println(Integer.parseInt("10001000", 2));
        System.out.println(Integer.parseInt("10010000", 2));
        System.out.println(Integer.parseInt("11111111", 2));
        System.out.println(Integer.parseInt("00000000", 2));

    }


}
