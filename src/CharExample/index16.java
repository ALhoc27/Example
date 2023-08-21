package CharExample;

public class index16 {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        for(i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        for(i = 0; i < 26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) {
                System.out.println(ch);
            }
        }

        for(i = 0; i < 5; i++) {
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println("");

        for(i = 0; i < 5; i++) {
            ch = smallQ.get();
            if(ch != (char) 'O') System.out.println(ch);
        }
    }
}
