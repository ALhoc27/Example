package algorithm;

import algorithm.configAlgorithm.EstimationAlgorithmComplexity;

public class MinOrMaxElementInArray {

    public static int minElementInArray(int[] array) {
        int i;
        int minIndexValue = array[0];
        for (i = 1; i < array.length; i++) if (minIndexValue > array[i]) minIndexValue = array[i];
        EstimationAlgorithmComplexity.printArrayint(array);
        System.out.print("\n " + minIndexValue + " - (min element) ");
        EstimationAlgorithmComplexity.linearСomplexity(array);
        System.out.println("");
        return minIndexValue;
    }

    public static int maxElementInArray(int[] array) throws NullPointerException{
        int i;
        int maxIndexValue = array[0];
        for (i = 1; i < array.length; i++) if (maxIndexValue < array[i]) maxIndexValue = array[i];
        EstimationAlgorithmComplexity.printArrayint(array);
        System.out.print("\n " + maxIndexValue + " - (max element) ");
        EstimationAlgorithmComplexity.linearСomplexity(array);
        System.out.println("");
        return maxIndexValue;
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
