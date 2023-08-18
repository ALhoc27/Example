import java.io.IOException;
import java.util.Random;
public class Random5 {
    public static void main(String[] args) throws IOException {
        for (var i = 0; i < 5; i++) {
            var randomNumber = new Random().nextInt(100) + 1;
            System.out.println(randomNumber);
        }
        for (; ; ) {
            char ch = (char) System.in.read();
            if (ch == 'q') break;
        }
        System.out.println("Вы нажали клавишу q!");
    }
}