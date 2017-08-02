/**
 * Created by Pavel on 02.08.2017
 */


//Write a program to find all distinct words from a text file. Ignore chars like    ".,/-;:" and Ignore case sensitivity.

public class Task1 {

    public static void main(String[] args) {

        String str1 = "первая строка";
        String str2 = "строка";
        String str3 = "строку";
        System.out.println(isContainsSimple(str1, str2));
        System.out.println(isContainsSimple(str1, str3));
    }

    private static boolean isContainsSimple(String first, String second) {

        return first.contains(second);
    }

}
