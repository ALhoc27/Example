import java.util.Objects;
import java.util.Scanner;

public class index4 {
    static int inputInt;

    public static void main(String[] args) {
        System.out.println("___________________________________________");
        System.out.println("Введите целое число, программа преобразует его в двоичный код");
        System.out.println("И произведет заменут '0' на '1' и на оборот");
        System.out.print("Введите число: ");
        Scanner keyboard = new Scanner(System.in);
        inputInt = keyboard.nextInt();
        System.out.println(Integer.toBinaryString(inputInt));
        //вызов метода
        System.out.println("Преобразуем получившиеся число в 10-ную систему: " + charMyInt(inputInt));
    }
    public static int charMyInt (int ch) {
        String tempInputIntString = Integer.toBinaryString(ch);

        String result = "";
        for (int i = 0; i < tempInputIntString.length(); i++) {
            if (Character.toString(tempInputIntString.charAt(i)).equals("0")) {
                result = result + 1;
//                System.out.println(result);
//                System.out.println(Character.toString(tempInputIntString.charAt(i)));
            } else {
                result = result + 0;
//                System.out.println(result);
//                System.out.println(Character.toString(tempInputIntString.charAt(i)));
            }
        }
        System.out.println(result);
       return Integer.parseInt(result, 2);
    }
}
//Objects.equals(tempInputIntString.charAt(i),'0'  один из вариантов условия в цикле