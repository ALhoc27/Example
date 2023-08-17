package StringMethods;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class RegularExpression {
    //вывод 2 столбца с задаными длинами
    //на вход получает два массива, 1 столбец и 2 столбец, и 1 ширена столбца и 2 ширена 2 столбца

    public static void printTwoColumns(String[] arrayColom1, String[] arrayColom2, int widthColom1, int widthColom2) {
        int maxLenghtCol1 = lengthArrayMaxElement(arrayColom2);
        //int maxLenghtCol2 = lengthArrayMaxElement(arrayColom2);
        int maxLenghtIntI = lengthIntElement(arrayColom1.length);

        for (int i = 0; i < arrayColom1.length - 1; i++) {
            System.out.print("Array №");
            String strI = "%-" + SumdifferenceMaxAndCurrentAndWidthColom1(i, maxLenghtIntI, widthColom1) + "s";
            System.out.print(String.format(strI, i) + "= ");
            // выведется Array №"0

            String strArI = "%-" + SumdifferenceMaxAndCurrentAndWidthColom1(arrayColom1[i], maxLenghtCol1, widthColom1) + "s";
            System.out.println(String.format(strArI, arrayColom1[i]));
//            System.out.print("Array №" + i + " = ");

        }
    }

    private static int lengthArrayMaxElement(String[] arrayColom) {
        int maxLenght = arrayColom[0].length();
        for (int i = 0; i < arrayColom.length - 1; i++) {
            if (maxLenght < arrayColom[i].length()) {
                maxLenght = arrayColom[i].length(); // - ищем максимальную длину элемента массива (maxLenght)
            }
        }
        return maxLenght;
    }
    private static int lengthIntElement(int ch) {
        return String.join("", String.valueOf(ch).split("")).length();
    }
    private static int SumdifferenceMaxAndCurrentAndWidthColom1(String str, int maxLenghtCol, int widthColom1) {
       return (maxLenghtCol - str.length()) + widthColom1;
    }
    private static int SumdifferenceMaxAndCurrentAndWidthColom1(int ch, int maxLenghtIntI, int widthColom2) {
        return (maxLenghtIntI - String.join("", String.valueOf(ch).split("")).length()) + widthColom2;
    }

    public static void main(String args[]) {
        String[] array1 = {"12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123"};
        String[] array2 = {"12","211"};
        printTwoColumns(array1, array2, 2, 4);

    }
}