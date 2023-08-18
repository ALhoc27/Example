package Algorithm;

public class Factorial {

    public static int factorial(int fact) {
        System.out.print(fact + " ");
        if (fact == 1) return 1;
        return  fact * factorial(fact - 1);
    }

    public static void main(String[] args) {
        factorial(13);
    }

    public static class BubbleSort {
        public static void main(String args[]) {
            final String format = "%.2f ";// формат вывода
            final String format1 = "array [%.2f]";// формат вывода
            final String shortfFormat = "%.2f";// формат вывода
            final String shortfFormatskobk = "[%.2f]";// формат вывода

            int n = 5; //число элементов в массиве
            double [] array = new double[n]; // Объявление double[] array; и создание масива array = new double[5];
            //^ заполняем циклом
            for (int g = 0; g<array.length; g+=1) {
                array[g] = Math.random();// заполняем рандомными значениями
            }
            int numberIndexArray = array.length; //получаем значение количества элементов масиива для дальнейших вычеслений
            //*********** вывод масива ***********
            System.out.print("Задан Math.random() массив из " + n + " элементов:  ");
            for (int i = 0; i < array.length; i++) {
                System.out.printf(format, array[i] * 10);//вывод масива на экран
            }
            System.out.print("\n");
            //*********** вывод индекса ***********
            System.out.print(" Следственно будет " + n + " проходов(итераций):   ");
            for (int i = 0; i < array.length; i++) {
                System.out.print("  " + i + "  "); //вывод индекса на экран
            }
            System.out.print("\n");
            System.out.println("");//для перевода строки
            for (int i = 0; i < array.length; i++) { //
                for (int j = 0; j < array.length - i - 1; j++) {
                    System.out.print("Сравниваем элемент массива: ");
                    System.out.printf(shortfFormatskobk, array[j] * 10);
                    System.out.print(" с ");
                    System.out.printf(shortfFormatskobk, array[j+1] * 10);
                    System.out.print(" \n");
                    if (array[j] > array[j+1]) {
                        double temp = array[j];  //Смена позиций через ввод промежуточной переменной
                        array[j] = array[j + 1]; //Меняем местами!
                        array[j + 1] = temp;     //Меняем местами!
                        System.out.print("Меняем: ");
                        System.out.printf(shortfFormatskobk, array[j+1] * 10);
                        System.out.print(" на ");
                        System.out.printf(shortfFormatskobk, array[j] * 10);
                        System.out.print(" ***************** (Сработало условие)    Теперь ");
                        System.out.printf(shortfFormatskobk, array[j+1] * 10);
                        //int ch = Integer.parseInt (array.length);
                        numberIndexArray =+j+1;//************************************
                        System.out.print(" на позиции " + numberIndexArray);
                        System.out.print(" \n");
                    }
                }
                var v = i+1; // для вывода итераций i+1
                System.out.print("Итерация № " + v + " завершена!  Самое большое число в результате итерации: ");
                //System.out.print("[" + v + "]" + ": ");
                System.out.printf(format, array[array.length - i - 1] * 10);
                System.out.println(" \n");
            }
            System.out.println();
            System.out.print("Отсортированный массив (BubbleSort): ");
            for (int i = 0; i < array.length; i++) {
                System.out.print("");
                System.out.printf(shortfFormat, array[i] * 10);
                System.out.print(" ");
            }
        }
    }
}
