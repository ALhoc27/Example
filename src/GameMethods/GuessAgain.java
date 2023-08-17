package GameMethods;

import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class GuessAgain {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner (System.in);
        int numGuesses = 0;
        System.out.print("Введите верхнюю границу рандомного числа: ");
        int maxrangerandom = keyboard.nextInt();
        int randomNumber = new Random().nextInt(maxrangerandom) + 1;
        out.println("Добро пожаловать в игру!");
        out.println("_________________________");
        out.print("Введите число от 1 до " + maxrangerandom + " : ");
        int inputNumber = keyboard.nextInt();
        numGuesses++;
        //___________________________while___________________________
        while (inputNumber != randomNumber) {
            out.println("");
            out.println("Попытайтесь еще раз... ");
            out.print("Введите число от 1 до " + maxrangerandom + " : ");
            inputNumber = keyboard.nextInt();
            numGuesses++;
        }
        //___________________________while___________________________
        out.println("Вы угадали после " + numGuesses + " попыток.");
        System.out.println("....................................");
        System.out.println("Выход....");
    }
}
