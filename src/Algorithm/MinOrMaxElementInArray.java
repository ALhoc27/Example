package Algorithm;

import Algorithm.configO.EstimationAlgorithmComplexity;

public class MinOrMaxElementInArray {

    public static int minElementInArray(int[] array) {
        int i;
        int minIndexValue = array[0];
        for (i = 1; i < array.length; i++) if (minIndexValue > array[i]) minIndexValue = array[i];
        printArray(array);
        System.out.print(minIndexValue + " - (min element) ");
        EstimationAlgorithmComplexity.linearСomplexity(array);
        return minIndexValue;
    }

    public static int maxElementInArray(int[] array) throws NullPointerException{
        int i;
        int maxIndexValue = array[0];
        for (i = 1; i < array.length; i++) if (maxIndexValue < array[i]) maxIndexValue = array[i];
        printArray(array);
        System.out.print(maxIndexValue + " - (max element) ");
        EstimationAlgorithmComplexity.linearСomplexity(array);
        return maxIndexValue;
    }

    public static void printArray(int[] array) {
        StringBuilder str = new StringBuilder();
        if (array.length > 16) {
            System.out.println("\n   ArrayIn.... array of more than 19 characters");
        } else {
            for (int j: array) str.append(j).append(" ");
            System.out.println("\n   ArrayIn - {" + str.toString().strip() + "}");
        }
    }

    public static void main(String[] args) {
        int[] array = {4332,4,5,7,5,3,3,33,3,5,60,5555};
        int[] array1 = {53545,22524,1445,5474,45683,2431,9605,777777};
        minElementInArray(array);
        maxElementInArray(array);
        minElementInArray(array1);
        maxElementInArray(array1);
    }
}
