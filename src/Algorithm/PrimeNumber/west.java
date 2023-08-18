package Algorithm.PrimeNumber;

public class west {
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
}
