public class draw {
    public static void drawxyz(int n) {
        int temp = 1;
     for(int i = 1; i <= n; i++){
         for (int j = 1; j <= n; j++){
             if(temp % 2 != 0 && temp % 3 != 0){ //cek ganjil
                 System.out.print("Y ");
             }else if(temp % 2 == 0 && temp % 3 != 0){ //cek genap
                 System.out.print("Z ");
             }else if(temp % 3 == 0){ //cek khusus kelipatan 3
                 System.out.print("X ");
             }
             temp++;
         }
         System.out.println();
     }
    }

    public static void main(String[] args) {
        System.out.println();drawxyz(3);
        System.out.println();drawxyz(5);
        System.out.println();drawxyz(1);

    }
}
