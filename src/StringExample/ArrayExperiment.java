package StringExample;

public class ArrayExperiment {

    public static void exp1(int[] sortArr) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            System.out.print("\n i= " + i + "  j= ");
            for (int j = 0; j < i + 1; j++) System.out.print(j + " ");
        }
    }

    public static void exp2(int[] sortArr) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            System.out.print("\n i= " + i + "  j= ");
            for (int j = i; j < sortArr.length - 1; j++) System.out.print(j + " ");
        }
    }

    public static void exp3(int[] sortArr) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            System.out.print("\n i= " + i + "  j= ");
            for (int j = 0; j < sortArr.length - 1; j++) System.out.print(j + " ");
        }
    }

    public static void exp4(int[] sortArr) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            System.out.print("\n i= " + i + "  j= ");
            for (int j = sortArr.length - 2; j >= 0; j--) System.out.print(j + " ");
        }
    }

    public static void exp5(int[] sortArr) {
        int n = sortArr.length - 1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (sortArr[n] > sortArr[i]) {
                int temp = sortArr[count];
                sortArr[count] = sortArr[i];
            }
        }
    }


    public static void main(String[] args) {
        int[] sortArr = {12, 6, 4, 1, 15, 10, 0, 4};
        String msgArray = "";
        for (int i : sortArr) {
            msgArray = msgArray + " " + i;
        }

        System.out.print("\n IN ARRAY " + msgArray + "  exp1");
        exp1(sortArr);
        System.out.println("");

        System.out.print("\n IN ARRAY " + msgArray + "  exp2");
        exp2(sortArr);
        System.out.println("");

        System.out.print("\n IN ARRAY " + msgArray + "  exp3");
        exp3(sortArr);
        System.out.println("");

        System.out.print("\n IN ARRAY " + msgArray + "  exp4");
        exp4(sortArr);
    }
}