package CharExample.CharEx;

class PowClass {
    public static int pow(int value, long powValue) {
        return (int) Math.pow(value, powValue);
        }
    public static long pow1(int value, long powValue) {
        long s = 1;
        for (int i = 1; i <= powValue; i++) {
            s = s * value;
        }
        return s;
    }
}