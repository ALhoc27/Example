package StringExample;

public class SymbolVerification {

public static void symbolVerification(char n) {
    char myChar;
    System.out.print("Метод проверяет аргумент на принадлежность: ");

    if (Character.isDigit(n)) System.out.println("Символ " + n + " является цифрой"); //Метод isDigit(). Определяет, есть ли заданный символ цифрой
    if (Character.isLowerCase(n)) {
        myChar = Character.toUpperCase(n);
        System.out.print("Символ " + n + " строчной буквой"); //Метод isLowerCase(). Есть ли указанный символ строчным
        System.out.println("  Возвращаем заглавный символ: " + myChar);
    }
    if (Character.isUpperCase(n)) {
        myChar = Character.toLowerCase(n);
        System.out.println("Символ " + n + " заглавной буквой");//Метод isUpperCase(). Есть ли символ в верхнем регистре
        System.out.println("  Возвращаем прописной символ: " + myChar);
    }
    if (Character.isSpace(n)) System.out.println("Символ " + n + " является пробелом"); //Метод isSpace(). Определение, есть ли указанный символ пробельным
}

    public static void main(String args[]) {
        symbolVerification('3');
        symbolVerification(' ');
        symbolVerification('g');
    }
}
