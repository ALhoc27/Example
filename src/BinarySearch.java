import org.w3c.dom.ls.LSOutput;

public class BinarySearch { /*бинарный поиск*/

    static String binarySearch (int[] array, int e) {
        int low = 0;
        int mid, gues;
        int high = array.length - 1;

        if (e < array[0] || e > array[array.length-1]) { /*проверка на вхождение в диапазон множества массива*/
            return "В диапазоне множества нет числа!";
        }

        while (low <= high) {
            mid = (low + high) / 2;
            gues = array[mid];

            if (e == gues) return Integer.toString(mid); /* .....(array[mid] = e)..... */
            else if (e < gues) high = mid - 1;           /* ..e..(mid-1)|..... */
            else low = mid + 1;                          /* .....|(mid+1).e.. */
        }
        return "Не найден";
    }

    public static void main(String[] args) {
        int[] arrayBinarySearch1 = {1, 5, 5, 6, 7, 90, 456, 500, 501, 4543, 4544, 4550, 4643, 6643, 7777, 56423};
        int[] arrayBinarySearch = {1, 2, 3, 4, 5, 6, 7, 7};
        int e = 56421121;

        System.out.println(binarySearch(arrayBinarySearch1, e));
    }
}
