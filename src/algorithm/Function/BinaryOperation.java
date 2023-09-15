package algorithm.Function;

import java.util.Scanner;

public class BinaryOperation {
    static int inputInt;

    public static void main(String[] args) {
        System.out.println("_____________________________________________________________");
        System.out.println("Введите целое число, программа преобразует его в двоичный код");
        System.out.println("И произведет замену '0' на '1' и на оборот");
        System.out.print("Введите число: ");
        Scanner keyboard = new Scanner(System.in);
        inputInt = keyboard.nextInt();
        System.out.println(Integer.toBinaryString(inputInt));
        System.out.println("Преобразуем получившиеся число в 10-ную систему: " + charMyInt(inputInt));
    }
    public static int charMyInt (int ch) {
        String tempInputIntString = Integer.toBinaryString(ch);

        String result = "";
        for (int i = 0; i < tempInputIntString.length(); i++) {
            if (Character.toString(tempInputIntString.charAt(i)).equals("0")) {
                result = result + 1;
            } else {
                result = result + 0;
            }
        }
        System.out.println(result);
       return Integer.parseInt(result, 2);
    }
}