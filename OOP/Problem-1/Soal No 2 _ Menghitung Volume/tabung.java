public class tabung {
    double jari2;
    double tinggi;

    public tabung(double jari2, double tinggi) {
        this.jari2 = jari2;
        this.tinggi = tinggi;
    }

    public double hitungVolumeTabung(){
        double volume = Math.PI * Math.pow(jari2, 2) * tinggi;
        return Math.ceil(volume);
    }
}