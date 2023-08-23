package Algorithm;

public class SumOf2Elements {
    static int[] sumOf2Elements(int[] array, int sumOf2El) {
        System.out.println("Алгоритм поиска двух слагаемых во множестве, на входе дан массив(Отсортированный) и значение, сумма слагаемых что нужно найти!");
        System.out.print("Массив IN: ");
        for (int t:array) System.out.print(t + " ");
        System.out.print(" Найти 2 элемента, сумма которых: " + sumOf2El);
        System.out.println("");
        System.out.print("Массив OUT: ");

        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            if (array[i] + array[j] == sumOf2El) return new int[]{array[i], array[j]};
            else if (array[i] < sumOf2El - array[j]) i++;
            else j--;
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 3, 7, 12, 23, 34, 45, 55, 56, 123, 3232, 4343, 44444, 565543, 5676654};
        for (int n:sumOf2Elements(array, 111)) System.out.print(n + " ");
        System.out.println("\n");

        int[] array1 = {1, 2, 3, 4};
        for (int n:sumOf2Elements(array1, 6)) System.out.print(n + " ");
        System.out.println("\n");
    }
}