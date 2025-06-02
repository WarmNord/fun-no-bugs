import java.util.Arrays;

public class Mock {
    /*
    * Реализовать метод, определяющий является ли строка палиндромом.

Важно, чтобы метод отрабатывал корректно на примерах

«да ад tlf» - палиндром
«Как как, как!» - палиндром
*
* написать функци
    * */


    public static void main(String[] args) {

        System.out.println(isPalindrome("да ад"));
        System.out.println(isPalindrome("Как как, как!"));
        System.out.println(isPalindrome("палиндром"));



    }
    static boolean isPalindrome(String string) {
        String s = string.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch) || Character.isWhitespace(ch)) {
                result.append(ch);
            }
        }
        String reverse = new StringBuilder(result).reverse().toString();
        return result.toString().equals(reverse);
    }

/*    static boolean isPalindrome2(String string) {
       boolean result = false;
        for (int i = 0; i < st.length() ; i++) {
            for (int j = st.length() - 1; j >= 0 ; j--) {
               result = st.charAt(i) == st.charAt(j);
            }
        }
        return result;
    }*/
}
