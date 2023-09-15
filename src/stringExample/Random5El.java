package stringExample;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Random5El {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner (System.in);
        String ch;
        do {
            for (var i = 0; i < 5; i++) {
                var randomNumber = new Random().nextInt(100);
                System.out.println(randomNumber);
            }
            System.out.println("Для выхода нажмите клавишу 'q'");
            System.out.print("Введите символ: ");
            ch = keyboard.next();
        }
        while (!"q".equals(ch));
    }
}