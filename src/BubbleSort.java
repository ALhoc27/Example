public class BubbleSort {

    public static int[] bubbleSort(int[] sortArr) { /*ПУЗЫРЬКОВАЯ СОРТИРОВКА*/

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
        return sortArr;
}
    public static void main(String[] args) {
        int[] sortArr = {12, 6, 4, 1, 15, 10, 0, 4}; /*заданный массив*/
        String msgArray = ""; /*для корректного вывода*/

        for (int i: sortArr) { /*Создание строки элементов символа, для вывода*/
            msgArray = msgArray + " " + i;
        }
        System.out.print("\n IN array " + msgArray + "  bubbleSort"); /*Вывод заданного массива*/
        bubbleSort(sortArr); /*вызов*/
        for (int i: sortArr) { /*Создание строки элементов символа, для вывода*/
            msgArray = msgArray + " " + i;
        }
        System.out.print("\n OUT SORT array " + msgArray + "  bubbleSort");/*Вывод отсортированнного массива*/

    }
}
