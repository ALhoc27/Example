package algorithm;

import algorithm.configAlgorithm.EstimationAlgorithmComplexity;

public class BinarySearch { /* Бинарный поиск */

// ищет в массиве, элемент e, если найдет элемент, вернет его позицию в массиве.
    public static int binarySearch (int[] array, int e) {
        int low = 0; // индекс нижняя граница
        int mid, gues; // mid - индекс опорного элемента, gues - значение опорного элемента
        int high = array.length - 1; // верхняя граница

        System.out.println(" Алгоритм 'Бинарный поиск' - O(log n) ");
        EstimationAlgorithmComplexity.printArrayint(array); // вывод массива на экран
        if (e < array[0] || e > array[array.length-1]) { /* проверка на вхождение в диапазон множества массива (НЕ ОБЯЗАТЕЛЬНО) */
            System.out.println("\n Элемент не входит в множество... \n");
            return -1; // если 'e' не входит в диапазон массива
        }

        while (low <= high) { // пока нижняя граница меньше или равна верхней
            mid = (low + high) / 2; // находим индекс середины
            gues = array[mid]; // получаем серединный элемент по индексу

            if (e == gues) {
                System.out.println(", поиск элемента 'e' - " + e + "\nЭлемент 'e' в массиве найден и находится по индесу: " + Integer.toString(mid) + " ");
                EstimationAlgorithmComplexity.logarithmicComplexity(array); /*вызов функции подсчета шагов (НЕ ОБЯЗАТЕЛЬНО)*/
                System.out.println(""); /*(НЕ ОБЯЗАТЕЛЬНО)*/
                return mid;                      /* .....(array[mid] = e)..... */
            }
            else if (e < gues) high = mid - 1;   /* ..e..(mid-1)|..... */
            else low = mid + 1;                  /* .....|(mid+1).e.. */
        }
        System.out.println("\n Элемент не найден! \n");
        return -1;
    }

    public static void main(String[] args) {
        int[] arrayBinarySearch = {1, 5, 5, 6, 7, 90, 456, 500, 501, 4543, 4544, 4550, 4643, 6643, 7777, 56423};
        int[] arrayBinarySearch1 = new int[240];
        int[] arrayBinarySearch2 = {1, 5, 5, 6, 8, 91, 92, 457, 499, 503, 506, 508, 509, 4543, 4544, 4550, 4643, 6643, 7777, 56423};
        int e = 456;

        binarySearch(arrayBinarySearch, e);
        binarySearch(arrayBinarySearch1, e);
        binarySearch(arrayBinarySearch2, e);
    }
}
