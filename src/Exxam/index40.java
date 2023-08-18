package Exxam;

public class index40 implements ICharQ {
    private char[] q;
    private int putloc, getloc;

    public index40 (int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    // Поместить символ в очередь,
    public void put (char ch) {
        if (putloc == q.length) {
            System.out.println("- Очередь переполненна.");
            return;
        }
        q[putloc++] = ch;
        System.out.println("Индекс: " + putloc + "  Значение: " + ch);
        if (putloc == getloc) putloc = 0; // закольцевать
    }

    // Извлечь символ из очереди
    public char get() {
        if(getloc == putloc) {
            System.out.println("- Очередь пуста");
            return (char) 0;
        }
        char ch = q[getloc++];
        if (getloc == q.length) getloc = 0;
        return ch;
    }
}
