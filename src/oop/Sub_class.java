package oop;

// Интерфейс
class Super_class {
    int num = 88;

    public void display() {
        System.out.println("Это метод display() суперкласса");
    }  // Метод display() суперкласса
}

public class Sub_class extends Super_class {
    int num = 77;

    public void display() {
        System.out.println("Это метод display() подкласса");
    } // Метод display() субкласса

    public void my_method() {
        Sub_class sub = new Sub_class();  // Инициализация подкласса
        sub.display();   // Вызываем метод display() подкласса
        super.display(); // Вызываем метод display() суперкласса

        System.out.println("Значение переменной num в подклассе: " + sub.num);         // Выводим значение переменной num подкласса
        System.out.println("Значение переменной num в суперклассе: " + super.num);         // Выводим значение переменной num суперкласса
    }

    public static void main(String args[]) {
        Sub_class obj = new Sub_class();
        obj.my_method();
    }
}