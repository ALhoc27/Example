package Algorithm.Function;

public class PrimeNumber {
    boolean rezultNumber = false;
    public boolean resultProstChisla (int inputnumber) {
        var q = 0;
        for (var i = 1; i <= inputnumber; i++) {
            if ((float)inputnumber % i == 0) {
                q++;
            }
        }
        if (q == 2) {
            rezultNumber = true;
            System.out.println(inputnumber + " - Это простое число");
        } else {
            System.out.println(inputnumber + " - Это НЕ простое число");
        }
        return rezultNumber;
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        for (var i = 1; i <= 100; i++) {
            primeNumber.resultProstChisla(i);
        }
    }
}
