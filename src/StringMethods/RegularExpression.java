package StringMethods;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class RegularExpression {
    //вывод 2 столбца с задаными длинами
    //на вход получает два массива, 1 столбец и 2 столбец, и 1 ширена столбца и 2 ширена 2 столбца

    public static void printTwoColumns(String[] arrayColom1, String[] arrayColom2, String[] arrayColom3, String[] arrayColom4, String[] arrayColom5, String[] arrayColom6, int widthColomIndex, int widthColom) {
//        if (arrayColom1.length > arrayColom2.length) arrayColom2 = bringingArraysToOneLength(arrayColom1, arrayColom2);
//        if (arrayColom2.length > arrayColom1.length) arrayColom1 = bringingArraysToOneLength(arrayColom1, arrayColom2);
        //проверка какой массив больше, что бы вызвать и преобразовать младший массив к старшему заполнив "0"

        int maxLenghtIntI = lengthIntElement(arrayColom1.length);
        int maxLenghtCol1 = lengthArrayMaxElement(arrayColom2);
        int maxLenghtCol2 = lengthArrayMaxElement(arrayColom2);
        int maxLenghtCol3 = lengthArrayMaxElement(arrayColom3);
        int maxLenghtCol4 = lengthArrayMaxElement(arrayColom4);
        int maxLenghtCol5 = lengthArrayMaxElement(arrayColom5);

        for (int i = 0; i < arrayColom1.length - 1; i++) {
            System.out.print("Array №");
            String strI = "%-" + SumMaxAndCurrentAndwidthColom(i, maxLenghtIntI, widthColomIndex) + "s";
            System.out.print(String.format(strI, i) + "= ");
            // выведется 'Array №" + i'

            String strArI = "%-" + SumMaxAndCurrentAndwidthColom(arrayColom1[i], maxLenghtCol1, widthColom-3) + "s";
            System.out.print(String.format(strArI, arrayColom1[i]));
            // выведется '= + arrayColom1[i]'

            String strArI2 = "%-" + SumMaxAndCurrentAndwidthColom(arrayColom2[i], maxLenghtCol2, widthColom) + "s";
            System.out.print(String.format(strArI2, arrayColom2[i]));
            // выведется 'arrayColom2[i]'

            String strArI3 = "%-" + SumMaxAndCurrentAndwidthColom(arrayColom3[i], maxLenghtCol3, widthColom) + "s";
            System.out.print(String.format(strArI3, arrayColom3[i]));
            // выведется 'arrayColom3[i]'

            String strArI4 = "%-" + SumMaxAndCurrentAndwidthColom(arrayColom4[i], maxLenghtCol4, widthColom) + "s";
            System.out.print(String.format(strArI4, arrayColom4[i]));
            // выведется 'arrayColom4[i]'

            String strArI5 = "%-" + SumMaxAndCurrentAndwidthColom(arrayColom5[i], maxLenghtCol5, widthColom) + "s";
            System.out.print(String.format(strArI5, arrayColom5[i]));
            // выведется 'arrayColom5[i]'

            System.out.println(arrayColom6[i]);
            // выведется 'arrayColom6[i]'
        }
    }

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
    public static String[][] bringingArraysToOneLength(String[] array1, String[] array2, String[] array3, String[] array4, String[] array5, String[] array6) {
        String[][] tempWrapperArray = {array1, array2, array3, array4, array5, array6};
        int maxArrayLength = tempWrapperArray[0].length;
        int maxArrayIndex = 0;
        String[] differenceArray = new String[0];
        String[][] arrayAll;
        for (int i = 0; i < tempWrapperArray.length; i++) {
                if (maxArrayLength < tempWrapperArray[i].length) {
                    maxArrayLength = tempWrapperArray[i].length;
                    maxArrayIndex = i;
                }
            } // самый длинный элемент массива tempWrapperArray

        for (int i = 0; i < tempWrapperArray.length; i++) {
            if (maxArrayLength > tempWrapperArray[i].length) {
                int differenceArrayLength = maxArrayLength - tempWrapperArray[i].length;
                differenceArray = new String[differenceArrayLength];
                for (int j = 0; j < differenceArray.length; j++) {
                    differenceArray[j] = "";
                } //иницализировали и заполнили масив для следующего обьединения

                String[] arrayColom = new String[tempWrapperArray[i].length + differenceArray.length]; //ВЫВОДЯЩИЙ МАСИВ
                int count = 0;// инициализировал счетчик

                for (int p = 0; p < tempWrapperArray[i].length; p++) {
                    arrayColom[p] = tempWrapperArray[i][p];
                    count++;
                }
                for (int y = 0; y < differenceArray.length; y++) {
                    differenceArray[count++] = differenceArray[y];
                }
                    tempWrapperArray[i] = arrayColom;
                }

                //System.out.println("Возвращаем приведенный к длине массива arrayColom1, массив arrayColom2, длинною " + arrayColom2.length);
            }
        return tempWrapperArray;
        }

    public static void main(String args[]) {
        String[] array1 = {"12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6"};
        String[] array2 = {"32523","3241414141","3285423","124","102","5234","85","23","2321","1422","1745","32523","3241414141","3285423","124","102","5234","85","23","2321","1422","1745","32523","3241414141","3285423","124","102","5234","85","23","2321","1422","1745","32523","3241414141","3285423","124","102","5234","85","23","2321","1422","1745","32523","3241414141","3285423","124","102","5234","85","23","2321","1422","1745","32523","3241414141","3285423","124","102","5234","85","23","2321","1422","1745","32523","3241414141","3285423","124","102","5234","85","23","2321","1422","1745","32523","3241414141","3285423","124","102","5234","85","23","2321","1422","1745","32523","3241414141","3285423","124","102","5234","85","23","2321","1422","1745","32523","3241414141","3285423","124","102","5234","85","23","2321","1422","1745","32523","3241414141","3285423","124","102","5234","85","23","2321","1422","1745","32523","3241414141","3285423","124"};
        String[] array3 = {"11","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6"};
        String[] array4 = {"11","21","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6"};
        String[] array5 = {"1","21","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6"};
        String[] array6 = {"1","21","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","414","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6","12","23","42","12","3","2","1213123","0","31123","311","434","6"};
        printTwoColumns(array1, array2, array3, array4, array5, array6, 1, 3);

    }

}
