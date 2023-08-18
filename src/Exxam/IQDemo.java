package Exxam;

public class IQDemo {
    public static void main(String[] args) {
        index40 wer = new index40(10);

        ICharQ iQ;
        char ch;
        int i;

        iQ = wer;
// Поместить ряд символов в очередь фиксированного размера,
        for (i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
        }
// Отобразить содержимое очереди.
        System.out.println("Содержимое очереди фиксированного размера: ");

        for (i = 0; i < 28; i++) {
            ch = iQ.get();
            System.out.println("Индекс: " + i + "  Значение: " + ch);
        }

    }
}
