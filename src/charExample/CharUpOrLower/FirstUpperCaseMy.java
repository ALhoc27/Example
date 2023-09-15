package charExample.CharUpOrLower;

public class FirstUpperCaseMy {

    public static String firstUpperCaseMy(String word){
        if(word == null || word.isEmpty()) return "";
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }
}
