package StringMethods;

public class RegularExpression {

    public static void printTwoColumns(String[] arrayColom1, String[] arrayColom2, String[] arrayColom3, String[] arrayColom4, String[] arrayColom5, String[] arrayColom6, int widthColomIndex, int widthColom) {
        var result = bringingArraysToOneLength(arrayColom1, arrayColom2, arrayColom3, arrayColom4, arrayColom5, arrayColom6);
        arrayColom1 = result[0];
        arrayColom2 = result[1];
        arrayColom3 = result[2];
        arrayColom4 = result[3];
        arrayColom5 = result[4];
        arrayColom6 = result[5];

        int maxLenghtIntI = lengthIntElement(arrayColom1.length);
        int maxLenghtCol1 = lengthArrayOneMaxElement(arrayColom2);
        int maxLenghtCol2 = lengthArrayOneMaxElement(arrayColom2);
        int maxLenghtCol3 = lengthArrayOneMaxElement(arrayColom3);
        int maxLenghtCol4 = lengthArrayOneMaxElement(arrayColom4);
        int maxLenghtCol5 = lengthArrayOneMaxElement(arrayColom5);

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

    private static int lengthArrayOneMaxElement(String[] arrayColom) {
        int maxLenght = arrayColom[0].length();
        for (int i = 1; i < arrayColom.length; i++) {
            if (maxLenght < arrayColom[i].length()) {
                maxLenght = arrayColom[i].length(); // - ищем максимальную длину элемента массива (maxLenght)
            }
        }
        return maxLenght;
    }
    private static int lengthArraySMaxElement(String[] ... array) {
        int maxArraysLength = array[0].length;
        for (int i = 0; i < array.length; i++) {
            if (maxArraysLength < array[i].length) {
                maxArraysLength = array[i].length;
            }
        }
        return maxArraysLength;
    }
    private static String[] addsSpacesToTheEndOfTheArray(String[] array, int count) {
        String[] tempArray = new String[count];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = "";
        }
       return combiningTwoMasivsIntoOne(array, tempArray);
    }
    private static String[] combiningTwoMasivsIntoOne(String[] array1, String[] array2) {
        String[] tempArray = new String[array1.length + array2.length];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            tempArray[i] = array1[i];
            count++;
        }
        for (int i = 0; i < array2.length; i++) {
            tempArray[count++] = array2[i];
        }
        return tempArray;
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

    private static String[][] bringingArraysToOneLength(String[] ... array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != lengthArraySMaxElement(array)) array[i] = addsSpacesToTheEndOfTheArray(array[i], lengthArraySMaxElement(array)-array[i].length);
        }
        return array;
    }


    public static void main(String args[]) {
        String[] array1 = {"3","2","1213123","0","31123","311","434","6","0","31123","311","434","6","0"};
        String[] array2 = {"5","2","1213123","0","31123","311","434","6"};
        String[] array3 = {"5","2","1213123","0","31123","311","434","6"};
        String[] array4 = {"0","2","1213123","0","31123","311","434","6"};
        String[] array5 = {"1","2","1213123","0","31123","311","434","6","1","4","233232","22324424324324234234","858757","875578685","888"};
        String[] array6 = {"2","2","1213123","0","31123","311","434","6"};

        printTwoColumns(array1, array2, array3, array4, array5, array6, 1, 3);

    }

}
