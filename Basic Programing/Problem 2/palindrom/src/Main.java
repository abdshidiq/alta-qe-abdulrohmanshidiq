import java.util.Locale;

public class Main {
    public static boolean palindrome(String value) {
        char [] array = value.toLowerCase().toCharArray();
        StringBuilder palindrom = new StringBuilder(value.toLowerCase());
        char [] arrayReverse = palindrom.reverse().toString().toCharArray();
        int temp = 0;
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == arrayReverse[i]) {
                temp = temp+1;
            }else{
                break;
            }
        }
        if (temp == value.length()) {
            result = true;
        }else {
            result = false;
        }
        return result;
    }
    public static String reverseString (String str){
        char ch[]=str.toCharArray();
        String rev="";
        for (int i = ch.length-1; i > 0 ; i++) {
            rev += ch[i];
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(palindrome("jakarta"));
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));

    }
}
