package Algorithm.CharExample;

public class Queue {
    char [] array;
    int putloc, getloc;

    Queue(int size) {
        array = new char[size];
        putloc = getloc = 0;
    }

    void put(char ch) {
        if(putloc == array.length) {
            System.out.print("Очередь переполненна.");
            return;
        }
        array[putloc++] = ch;
    }

    char get() {
        if(getloc == putloc) {
            System.out.println("Очередь пуста ");
        }
        return array[getloc++];
    }
}
