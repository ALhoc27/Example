package main.Algorithm.Function;

public class СycleExample {
    public static void main(String[] args) {
        int sum = 0;
        int [][] nums = new int [3][5];

        for(int i = 0; i < 3; i++) {
            System.out.println(" " + i + " проход ");
            for(int j = 0; j< 5; j++) {
                nums[i][j] = (i+1) * (j+1);
                System.out.println(j + " тело ");
            }
        }
        System.out.println("");
        System.out.println("");

        for(int[] x : nums) {
            System.out.println("Проходка " + x);
            for(int y : x) {
                System.out.println("Значение: " + y);
                sum = sum + y;
            }
        }
        System.out.println("Сумма:  " + sum);
        System.out.println("");


        String command = "cancel";
        switch (command) {
            case "connekt":
                System.out.println("privet");
                break;
            case "cancel":
                System.out.println("poka");
                break;
            case "disconnect":
                System.out.println("1111");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
