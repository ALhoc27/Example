package StringMethods;

public class fr32 {

    public static void main(String[] args) {
        String[] ar1 = {"2","42","fr","2323","8"};
        String[] ar2 = {"f432","2231"};
        String[] ar3 = {"11","22","33","23232323","222"};

        String[][] allArr = {ar1, ar2, ar3};
        int maxArray = allArr[0].length;

        for (int i = 0; i < allArr.length; i++) {
            System.out.print(i + ": "); //0 1 2
            for (int j = 0; j < allArr[i].length; j++) {
                System.out.print(allArr[i][j] + " ");
            }
            if (maxArray < allArr[i].length) {
                maxArray = allArr[i].length;
            }
            System.out.println(" -- " + allArr[i].length);
            System.out.println("");
        }
        System.out.println(maxArray);
    }

}

//        0: 2 42 fr 2323 8
//        1: f432 2231
//        2: 11 22 33 23232323 222