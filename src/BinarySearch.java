import org.w3c.dom.ls.LSOutput;

public class BinarySearch { /*бинарный поиск*/

    static String binarySearch (int[] array, int e) {
        int low = 0;
        int mid, gues;
        int high = array.length - 1;
        for (int n: array) System.out.print(n + " "); //Вывод входящего массива

        if (e < array[0] || e > array[array.length-1]) { /*проверка на вхождение в диапазон множества массива*/
            return "В диапазоне множества нет числа!";
        }

        while (low <= high) {
            mid = (low + high) / 2;
            gues = array[mid];

            if (e == gues) {
                NumberSteps(array); /*вызов функции подсчета шагов*/
                System.out.println("Элемент найден. Находится по индесу: " + Integer.toString(mid) + "\n");
                return Integer.toString(mid); /* .....(array[mid] = e)..... */
            }
            else if (e < gues) high = mid - 1;           /* ..e..(mid-1)|..... */
            else low = mid + 1;                          /* .....|(mid+1).e.. */
        }
        return "Не найден";
    }

    static double NumberSteps (int[] array) {
        System.out.println("\n Шагов " + Math.round(Math.log10(array.length)/Math.log10(2)) + "  от массива из " + array.length + " элементов");
        return  Math.round(Math.log10(array.length)/Math.log10(2));
    }

    public static void main(String[] args) {
        int[] arrayBinarySearch = {1, 5, 5, 6, 7, 90, 456, 500, 501, 4543, 4544, 4550, 4643, 6643, 7777, 56423};
        int[] arrayBinarySearch1 = new int[240];
        int e = 456;

        binarySearch(arrayBinarySearch, e);
        NumberSteps(arrayBinarySearch1);


    }
}
