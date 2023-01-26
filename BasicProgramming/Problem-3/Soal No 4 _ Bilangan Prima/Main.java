class CekBilanganPrima {
    public static boolean prima(int n) {
        int count = 0;
        int i;
        boolean angka_prima;
            for (i = 2; i <= n ; i++) {
                if (n % i == 0) {
                   count++;
                }
            }
        if (count == 1)
            angka_prima = true;
        else{
            angka_prima = false;
        }
        return angka_prima;
    }
    public static void main(String[] args){
        System.out.println(prima(11));
        System.out.println(prima(13));
        System.out.println(prima(17));
        System.out.println(prima(20));
    }
}