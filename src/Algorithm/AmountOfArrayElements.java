package Algorithm;

import java.util.Arrays;


public class AmountOfArrayElements { //сумма элементов массива через рекурсию
    static int sumEl = 0;

    static int amountOfArrayElements(int[] array) {

        if (array.length == 0) return 0;
        else return array[0] + amountOfArrayElements(Arrays.copyOfRange(array, 1, array.length));
    }

    public static void main(String[] args) {
        int[] arr = {21, 32, 4, 11, 2};
        System.out.println(amountOfArrayElements(arr));
    }
}
