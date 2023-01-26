public class Main {
    public static void main(String[] args) {
        System.out.println("Luas");
//        segitiga segitiga1 = new segitiga1
        segitiga main1 = new segitiga(3,4);
        persegi main2 = new persegi(4);
        persegipanjang main3 = new persegipanjang(7,8);
        System.out.println("segitiga (" +main1.hitungLuas()+")");
        System.out.println("persegi (" +main2.hitungLuas()+")");
        System.out.println("persegi panjang (" +main3.hitungLuas()+")");
        System.out.println();
        System.out.println("keliling");
        System.out.println("persegi (" +main2.hitungKeliling()+")");
        System.out.println("segitiga (" +main1.hitungKeliling()+")");
        System.out.println("persegi panjang (" +main3.hitungKeliling()+")");
    }
}