public class Main {
    public static void main(String[] args) {
        kalkuLator main = new kalkuLator();
        System.out.println("======HASIL======");
        main.setProses(3,4);
        System.out.println("penjumlahan (" +main.penambahan()+")");
        main.setProses(15,4);
        System.out.println("pengurangan (" +main.pengurangan()+")");
        main.setProses(10,10);
        System.out.println("perkalian (" +main.perkalian()+")");
        main.setProses(12,3);
        System.out.println("pembagian (" +main.pembagian()+")");
    }
}
