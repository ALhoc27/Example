package generic;

public class Main {

    public static void main(String[] args) {
        Person human1 = new Person(23, "Physica Education Teacher");
        Person human2 = new Person(35, "Stasik");
        Person human3 = new Person(50, "Pivasik");

        User obuser1 = new User(4, "Dasha");
        User obuser2 = new User(43, "Al");
        User obuser3 = new User(12, "Vanya");

        Person[] arrayPerson = {human1, human2, human3};
        User[] arrayUser = {obuser1, obuser2, obuser3};

        System.out.println(findMax(arrayPerson));
        System.out.println(findMax(arrayUser));
        System.out.println(human1.compareTo(human2));
    }

    public static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

}
