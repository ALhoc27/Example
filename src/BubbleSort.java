public class BubbleSort {
    static String msgArray = "";

    public static int[] bubbleSort(int[] sortArr) { /*ПУЗЫРЬКОВАЯ СОРТИРОВКА*/
        for (int i: sortArr) {
            msgArray = msgArray + " " + i;
        } /*Создание строки элементов символа, для вывода*/
        System.out.print("Алгоритм 'bubbleSort' (Пузырьковая сортировка) - O(n^n)");
        System.out.print("\n IN array " + msgArray); /*Вывод заданного массива*/

        for (int i = 0; i < sortArr.length - 1; i++) {
        System.out.print("\n i= " + i + "  j= ");
        for (int j = 0; j < sortArr.length - 1 - i; j++) {
            System.out.print(sortArr[j] + " ");
            if (sortArr[j] > sortArr[j + 1]) {
                int swap = sortArr[j];
                sortArr[j] = sortArr[j + 1];
                sortArr[j + 1] = swap;
            }
        }
    }
        String msgArray = "";      /*Создание строки элементов символа, для вывода*/
        for (int i: sortArr) { /*Создание строки элементов символа, для вывода*/
            msgArray = msgArray + " " + i;
        } /*Создание строки элементов символа, для вывода*/
        System.out.println("\n OUT array " + msgArray);/*Вывод отсортированного массива*/
        NumberSteps(sortArr); /*вызов метода расчета шагов*/
        return sortArr;
}

    static double NumberSteps (int[] array) { /*Функция определения шагов нахождения решения O(n^n) из массива*/
        System.out.print("Выполненно: шагов - " + (int) Math.pow(array.length,2) + ", массив из " + array.length + " элементов, 'Cкорость выполнения - O(n^n) - квадратичное время выполнения операций'\n");
        return  (int) Math.pow(array.length,2);
    } /*Метод расчета шагов Алгоритмов типа (log n) из массива*/

    public static void main(String[] args) {
        int[] sortArr = {12, 6, 4, 1, 15, 10, 0, 4}; /*заданный массив*/
        bubbleSort(sortArr); /*вызов метода пузырьковой сортировки*/
    }
}
