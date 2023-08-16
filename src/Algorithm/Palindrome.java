package Algorithm;

import Algorithm.configO.EstimationAlgorithmComplexity;

public class Palindrome {
/*    В этом алгоритме цикл выполняется n/2 раз, где n — длина строки. Казалось бы, сложность работы алгоритма должна быть равна O(n/2).
    Но, как и в прошлый раз, это не так. Алгоритмы со временем работы 2n, 10n, n/5, n/32 — все имеют сложность O(n),*/
    static boolean palindrome(String inWord) {
        int[] words = new int[inWord.length()];
        for (int i = 0; i < inWord.length() / 2; i++) {
            if (inWord.charAt(i) != inWord.charAt(inWord.length() - 1- i)) {
                System.out.println(inWord + " - false");
                return false;
            }
        }
        System.out.println(inWord + " - true");
        EstimationAlgorithmComplexity.linearСomplexity(words);
        return true;
    }

/*    public static void main(String[] args) {
        System.out.println("Палиндромом называется строка, которая одинаково читается слева направо и справа налево. АНА и ABBA — это палиндромы, а YES и NO — нет.");
        System.out.println("");
        palindrome("ab");
        System.out.println();
        palindrome("aha");
        System.out.println();
        palindrome("abba");
        System.out.println();
        palindrome("abcba");
        System.out.println();
        palindrome("1221");
    }*/
}