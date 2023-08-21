package Algorithm.Function;

public class BinaryShift {
    public static void main(String[] args) {

        class ShowBits {
            int numbits;

            ShowBits (int i) {
                numbits = i;
            }

            void show (long val) {
                long mask = 1; //128

                // Сдвиг влево значения 1 в нужную позицию.
                //System.out.println("\n" + mask + " - До Сдвига влево значения 1 в нужную позицию.");
                mask <<= numbits-1;
                //System.out.println(mask + " - Сдвиг влево значения 1 в нужную позицию.");


                int spacer = 0;
                for(; mask != 0; mask >>>= 1) {
                    if((val & mask) != 0) System.out.print("1");
                    else System.out.print("0");
                    spacer++;
                    if((spacer % 8) == 0) {
                        System.out.print(" ");
                        spacer = 0;
                    }
                }
                System.out.println();
            }
        }
        for (byte b = 0; b < 100; b++) {
            ShowBits byteval = new ShowBits(8);
            System.out.print(b + " в двоичном виде: ");
            byteval.show(b);
        }
    }
}
