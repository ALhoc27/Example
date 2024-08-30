package charExample.charEx;

import java.text.DecimalFormat;

public class Index100 {
    public static void main(String[] args) {
        //мой метод
        long bit64 = PowClass.pow1(2,64);
        long bit32 = PowClass.pow1(2,32);
        long bit16 = PowClass.pow1(2,16);
        long bit8 = PowClass.pow1(2,8);


        //метод Math
        //System.out.println(PowClass.pow(2, 8));


        System.out.println("('byte') 8 bit variations = " + bit8);
        System.out.print("('byte') 7 bit variations (-/+) = от -");
        System.out.print(new DecimalFormat( "###,###.##" ).format(bit8/2));
        System.out.print(" до ");
        System.out.println(new DecimalFormat( "###,###.##" ).format((bit8/2-1)));
        System.out.println("");
        System.out.print("('short' and 'char') 16 bit variations = ");
        System.out.println(new DecimalFormat( "###,###.##" ).format(bit16));
        System.out.print("('short' and 'char') 15 bit variations (-/+) = от -");
        System.out.print(new DecimalFormat( "###,###.##" ).format(bit16/2));
        System.out.print(" до ");
        System.out.println(new DecimalFormat( "###,###.##" ).format((bit16/2-1)));
        System.out.println("");
        System.out.print("('int' and 'float') 32 bit variations = ");
        System.out.println(new DecimalFormat( "###,###.##" ).format(bit32));
        System.out.print("('int' and 'float') 31 bit variations (-/+) = от -");
        System.out.print(new DecimalFormat( "###,###.##" ).format(bit32/2));
        System.out.print(" до ");
        System.out.println(new DecimalFormat( "###,###.##" ).format((bit32/2-1)));
        System.out.println("");
        System.out.print("('double' and 'long') 64 bit variations = ");
        System.out.println(new DecimalFormat( "###,###.##" ).format(bit64));
        System.out.print("('double' and 'long') 63 bit variations (-/+) = от -");
        System.out.print(new DecimalFormat( "###,###.##" ).format(bit64/2));
        System.out.print(" до ");
        System.out.println(new DecimalFormat( "###,###.##" ).format((bit64/2-1)));
    }
}
