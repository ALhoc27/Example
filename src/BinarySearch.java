import org.w3c.dom.ls.LSOutput;

public class BinarySearch { /*бинарный поиск*/

    static int binarySearch (int[] array, int e) {
        int low = 0;
        int mid, gues;
        int high = array.length - 1;
        if (array.length < 18) { //Вывод входящего массива
            System.out.print("Массив: ");
            for (int n: array) System.out.print(n + " ");
        } else {
            System.out.println("Массив: " + array.toString() + " более 18 элементов...");
        } //Вывод входящего массива (НЕ ОБЯЗАТЕЛЬНО)
        if (e < array[0] || e > array[array.length-1]) { /*проверка на вхождение в диапазон множества массива (НЕ ОБЯЗАТЕЛЬНО)*/
            System.out.println("Элемент не входит в множество \n");
            return -1;
        } /*проверка на вхождение в диапазон множества массива (НЕ ОБЯЗАТЕЛЬНО)*/

        while (low <= high) {
            mid = (low + high) / 2;
            gues = array[mid];

            if (e == gues) {
                System.out.println("\n Алгоритм 'Бинарный поиск' - O(log n) \nЭлемент в массиве найден и находится по индесу: " + Integer.toString(mid) + " ");
                NumberSteps(array); /*вызов функции подсчета шагов (НЕ ОБЯЗАТЕЛЬНО)*/
                System.out.println(""); /*(НЕ ОБЯЗАТЕЛЬНО)*/
                return mid;                      /* .....(array[mid] = e)..... */
            }
            else if (e < gues) high = mid - 1;   /* ..e..(mid-1)|..... */
            else low = mid + 1;                  /* .....|(mid+1).e.. */
        }
        System.out.println("Элемент не найден! \n");
        return -1;
    }

    static double NumberSteps (int[] array) { /*Функция определения шагов нахождения решения O(log n) из массива*/
        System.out.print("Выполненно: шагов - " + Math.round(Math.log10(array.length)/Math.log10(2)) + ", массив из " + array.length + " элементов, 'Cкорость выполнения - O(log n) - логарифмическое время'\n");
        return  Math.round(Math.log10(array.length)/Math.log10(2));
    } /*Метод расчета шагов Алгоритмов типа (log n) из массива*/
    static double NumberSteps (int count) { /*Функция определения шагов нахождения решения O(log n) */
        System.out.print("Выполненно: шагов - " + Math.round(Math.log10(count)/Math.log10(2)) + ", из " + count + " элементов, 'Cкорость выполнения - O(log n) - логарифмическое время'\n");
        return  Math.round(Math.log10(count)/Math.log10(2));
    } /*Метод расчета шагов Алгоритмов типа (log n) из кол-вол элементов*/

    public static void main(String[] args) {
        int[] arrayBinarySearch = {1, 5, 5, 6, 7, 90, 456, 500, 501, 4543, 4544, 4550, 4643, 6643, 7777, 56423};
        int[] arrayBinarySearch1 = new int[240];
        int[] arrayBinarySearch2 = {1, 5, 5, 6, 8, 91, 92, 457, 499, 503, 506, 508, 509, 4543, 4544, 4550, 4643, 6643, 7777, 56423};
        int e = 456;

        binarySearch(arrayBinarySearch, e);
        binarySearch(arrayBinarySearch1, e);
        binarySearch(arrayBinarySearch2, e);
        NumberSteps(arrayBinarySearch1);
        NumberSteps(1222);

    }
}
