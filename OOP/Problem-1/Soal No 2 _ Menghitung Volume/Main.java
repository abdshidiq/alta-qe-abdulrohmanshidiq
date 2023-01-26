public class Main {
    public static void main(String[] args) {
        System.out.println("Volume");
        balok main1 = new balok(3,6, 10);
        kubus main2 = new kubus(10,10,10);
        tabung main3 = new tabung(7,10);
        System.out.println("balok (" +main1.hitungVolumeBalok()+")");
        System.out.println("kubus (" +main2.hitungVolumeKubus()+")");
        System.out.println("tabung (" +main3.hitungVolumeTabung()+")");
    }
}