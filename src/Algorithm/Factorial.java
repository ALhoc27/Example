package Algorithm;

public class Factorial {

    public static int factorial(int fact) {
        System.out.print(fact + " ");
        if (fact == 1) return 1;
        return  fact * factorial(fact - 1);
    }

    public static void main(String[] args) {
        factorial(13);
    }

}
