public class palindrom {
    public static boolean palindrome(String value) {
        String wordf = value;
        String wordl ="";
        wordf = wordf.toLowerCase();
        wordl = wordl.toLowerCase();
        for(int i = 0; i < wordf.length(); i++){
            wordl += wordf.substring((wordf.length()-i)-1,wordf.length()-i );
        }
//        System.out.println(wordf);
//        System.out.println(wordl);
        if(wordf.equals(wordl)){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(palindrome("Nababan"));
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("kaTak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));

    }
}
