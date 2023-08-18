package StringMethods;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class RegularExpression {
    //вывод 2 столбца с задаными длинами
    //на вход получает два массива, 1 столбец и 2 столбец, и 1 ширена столбца и 2 ширена 2 столбца

    public static void printTwoColumns(String[] arrayColom1, String[] arrayColom2, String[] arrayColom3, int widthColomIndex, int widthColom) {
        if (arrayColom1.length > arrayColom2.length) arrayColom2 = bringingArraysToOneLength(arrayColom1, arrayColom2);
        if (arrayColom2.length > arrayColom1.length) arrayColom1 = bringingArraysToOneLength(arrayColom1, arrayColom2);
        //проверка какой массив больше, что бы вызвать и преобразовать младший массив к старшему заполнив "0"

        int maxLenghtIntI = lengthIntElement(arrayColom1.length);
        int maxLenghtCol1 = lengthArrayMaxElement(arrayColom2);
        int maxLenghtCol2 = lengthArrayMaxElement(arrayColom2);

        for (int i = 0; i < arrayColom1.length - 1; i++) {
            System.out.print("Array №");
            String strI = "%-" + SumMaxAndCurrentAndwidthColom(i, maxLenghtIntI, widthColomIndex) + "s";
            System.out.print(String.format(strI, i) + "= ");
            // выведется 'Array №" + i'

            String strArI = "%-" + SumMaxAndCurrentAndwidthColom(arrayColom1[i], maxLenghtCol1, widthColom) + "s";
            System.out.print(String.format(strArI, arrayColom1[i]));
            // выведется '= + arrayColom1[i]'

            System.out.println(arrayColom2[i]);
        }
    }
   /* public static void printTwoColumns(String[] arrayColom1, String[] arrayColom2, String[] arrayColom3  int widthColomIndex, int widthColom) {
        if (arrayColom1.length > arrayColom2.length) arrayColom2 = bringingArraysToOneLength(arrayColom1, arrayColom2);
        if (arrayColom2.length > arrayColom1.length) arrayColom1 = bringingArraysToOneLength(arrayColom1, arrayColom2);
        //проверка какой массив больше, что бы вызвать и преобразовать младший массив к старшему заполнив "0"

        int maxLenghtIntI = lengthIntElement(arrayColom1.length);
        int maxLenghtCol1 = lengthArrayMaxElement(arrayColom2);
        int maxLenghtCol2 = lengthArrayMaxElement(arrayColom2);

        for (int i = 0; i < arrayColom1.length - 1; i++) {
            System.out.print("Array №");
            String strI = "%-" + SumMaxAndCurrentAndwidthColom(i, maxLenghtIntI, widthColomIndex) + "s";
            System.out.print(String.format(strI, i) + "= ");
            // выведется 'Array №" + i'

            String strArI = "%-" + SumMaxAndCurrentAndwidthColom(arrayColom1[i], maxLenghtCol1, widthColom) + "s";
            System.out.print(String.format(strArI, arrayColom1[i]));
            // выведется '= + arrayColom1[i]'

            String strArI2 = "%-" + SumMaxAndCurrentAndwidthColom(arrayColom2[i], maxLenghtCol2, widthColom) + "s";
            System.out.print(String.format(strArI2, arrayColom2[i]));

            System.out.println(arrayColom3[i]);
        }
    }*/

    private static int lengthArrayMaxElement(String[] arrayColom) {
        int maxLenght = arrayColom[0].length();
        for (int i = 1; i <= arrayColom.length - 1; i++) {
            if (maxLenght < arrayColom[i].length()) {
                maxLenght = arrayColom[i].length(); // - ищем максимальную длину элемента массива (maxLenght)
            }
        }
        return maxLenght;
    }
    private static int lengthIntElement(int ch) {
        return String.join("", String.valueOf(ch).split("")).length();
    }
    private static int SumMaxAndCurrentAndwidthColom(String str, int maxLenghtCol, int widthColomIndex) {
       return maxLenghtCol + widthColomIndex;
    }
    private static int SumMaxAndCurrentAndwidthColom(int ch, int maxLenghtIntI, int widthColomIndex) {
        return maxLenghtIntI + widthColomIndex;
    }
    private static String[] bringingArraysToOneLength(String[] array1, String[] array2) {
        if (array1.length > array2.length) {
            int differenceArrayLength = array1.length - array2.length;
            String[] temparray2 = new String[differenceArrayLength];
            for (int i = 0; i <= temparray2.length - 1; i++) {
                temparray2[i] = "0";
            } //иницализировали и заполнили масив для следующего обьединения
            
            String[] arrayColom2 = new String[temparray2.length + array2.length]; //новый масив таклй же длинны что и array1 и заполненный
            int count = 0;

            for (int i = 0; i < array2.length; i++) {
                arrayColom2[i] = array2[i];
                count++;
            }
            for (int i = 0; i < temparray2.length; i++) {
                arrayColom2[count++] = temparray2[i];
            }
            //System.out.println("Возвращаем приведенный к длине массива arrayColom1, массив arrayColom2, длинною " + arrayColom2.length);
            return arrayColom2;
        } else {
            int differenceArrayLength = array2.length - array1.length;
            String[] temparray1 = new String[differenceArrayLength];
            for (int i = 0; i <= temparray1.length - 1; i++) {
                temparray1[i] = "";
            } //иницализировали и заполнили масив для следующего обьединения

            String[] arrayColom1 = new String[temparray1.length + array1.length]; //новый масив таклй же длинны что и array1 и заполненный
            int count = 0;

            for (int i = 0; i < array1.length; i++) {
                arrayColom1[i] = array1[i];
                count++;
            }
            for (int i = 0; i < temparray1.length; i++) {
                arrayColom1[count++] = temparray1[i];
            }
            //System.out.println("Возвращаем приведенный к длине массива arrayColom2, массив arrayColom1, длинною " + arrayColom1.length);
            return arrayColom1;
        }
    }

    public static void main(String args[]) {
        String[] array1 = {"12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6"};
        String[] array2 = {"32523","3241414141","3285423","124","102","5234","85","23","2321","1422","1745","32523","3241414141","3285423","124","102","5234","85","23","2321","1422","1745","32523","3241414141","3285423","124","102","5234","85","23","2321","1422","1745","32523","3241414141","3285423","124","102","5234","85","23","2321","1422","1745","32523","3241414141","3285423","124","102","5234","85","23","2321","1422","1745","32523","3241414141","3285423","124","102","5234","85","23","2321","1422","1745","32523","3241414141","3285423","124","102","5234","85","23","2321","1422","1745","32523","3241414141","3285423","124","102","5234","85","23","2321","1422","1745","32523","3241414141","3285423","124","102","5234","85","23","2321","1422","1745","32523","3241414141","3285423","124","102","5234","85","23","2321","1422","1745","32523","3241414141","3285423","124","102","5234","85","23","2321","1422","1745","32523","3241414141","3285423","124"};
        String[] array3 = {"11","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6"};
        printTwoColumns(array1, array2, array3, 1, 2);

        /*printTwoColumn(array1, array2, array3, 2, 2);*/

    }

}