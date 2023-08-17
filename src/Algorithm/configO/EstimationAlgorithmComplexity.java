package Algorithm.configO;

public class EstimationAlgorithmComplexity {

    public static double quadraticComplexity (int[] array) { /*Функция определения шагов нахождения решения O(n^n) из массива*/
        System.out.print(" Cкорость выполнения O(n^n):    шагов - " + (int) Math.pow(array.length,2) + ", массив из " + array.length + " элементов, 'O(n^n) - Квадратичная сложность выполнения операций'\n");
        return  (int) Math.pow(array.length,2);
    } /*Метод расчета шагов алгоритма типа O(n^n) из массива*/

    public static double logarithmicComplexity (int[] array) { /*Функция определения шагов нахождения решения O(log n) из массива*/
        System.out.print(" Cкорость выполнения O(log n):  шагов - " + Math.round(Math.log10(array.length)/Math.log10(2)) + ", массив из " + array.length + " элементов, 'O(log n) - Логарифмическая сложность'\n");
        return  Math.round(Math.log10(array.length)/Math.log10(2));
    } /*Метод расчета шагов алгоритма типа O(log n) из массива*/

    public static double linearСomplexity (int[] array) { /*Функция определения шагов нахождения решения O(n) из массива*/
        System.out.print(" Cкорость выполнения O(n):      шагов - " + array.length + ", массив из " + array.length + " элементов, 'O(n) - Линейная сложность'\n");
        return array.length;
    } /*Метод расчета шагов алгоритма типа O(n) из массива*/

    public static void ConstantComplexity (int[] array) { /*Функция определения шагов нахождения решения O(1) из массива*/
        System.out.print(" Cкорость выполнения O(1): ______________________________________ 'O(1) /всегда выполняется за одно и тоже время/ - Константная cложность'\n");
    } /*Метод расчета шагов алгоритма типа O(1) из массива*/

    public static double Linearlogarithmiccomplexity (int[] array) { /*Функция определения шагов нахождения решения O(nlog n) из массива*/
        System.out.print(" Cкорость выполнения O(nlog n): шагов - " + array.length * Math.round(Math.log10(array.length)/Math.log10(2)) + ", массив из " + array.length + " элементов, 'O(nlog n) - Линейно-логарифмическая сложность'\n");
        return  array.length * Math.round(Math.log10(array.length)/Math.log10(2));
    } /*Метод расчета шагов алгоритма типа O(nlog n) из массива*/

    public static double ExponentialComplexity (int[] array) { /*Функция определения шагов нахождения решения O(2^n) из массива*/
        System.out.print(" Cкорость выполнения O(2^n):    шагов - " + 2 * array.length + ", массив из " + array.length + " элементов, 'O(2^n) - Экспоненциальная сложность (так же 3^n, 4^n и т.д.)'\n");
        return  2 * array.length;
    } /*Метод расчета шагов алгоритма типа O(2^n) из массива*/

    public static double FactorialComplexity (int[] array) { /*Функция определения шагов нахождения решения O(n!) из массива*/
        int count = 1;
        for (int tempCount = 1; tempCount < array.length; tempCount++) count *= tempCount;
        System.out.print(" Cкорость выполнения O(n!):     шагов - " + count + ", массив из " + array.length + " элементов, 'O(n!) - Экспоненциальная сложность'\n");
        return  count;
    } /*Метод расчета шагов алгоритма типа (n!) из массива*/

    public static void algorithm(int[] array) {
        logarithmicComplexity(array);
        linearСomplexity(array);
        ExponentialComplexity(array);
        Linearlogarithmiccomplexity(array);
        quadraticComplexity(array);
        FactorialComplexity(array);
        ConstantComplexity(array);
    }

    public static void printArrayint(int[] array) {
        StringBuilder str = new StringBuilder();
        if (array.length > 16) {
            System.out.print("   ArrayIn.... array of more than 19 characters");
        } else {
            for (int j: array) str.append(j).append(" ");
            System.out.print("   ArrayIn - {" + str.toString().strip() + "}");
        }

    }
}