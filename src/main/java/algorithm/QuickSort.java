package main.Algorithm;

public class QuickSort {

    public static int[] quickSort(int[] array, int low, int high) { // {4 1 6 9 2 3 5 8}
        int pivot = low + (high - low) / 2; // 0 + ((array - 1) - 0)/2  (3) индекс // 1 итерация
        int border = array[pivot]; // 3 индекс = 9 //
        int i = low, j = high; // i = 0, j = 7 //

        while (i <= j) {
            while (array[i] < border) i++; // border = 9 //
            while (array[j] > border) j--;

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

       if (low < j) return quickSort(array, low, j);
       if (high > i) return quickSort(array, i, high); //
        return array;
    }


    public static void main(String[] args) {
        int[] array = {4,1,6,9,2,3,5,8};
        for(int n:array) System.out.print(n + " ");
        System.out.println("");
        for(int n:quickSort(array, 0, array.length - 1)) System.out.print(n + " ");

    }
}
