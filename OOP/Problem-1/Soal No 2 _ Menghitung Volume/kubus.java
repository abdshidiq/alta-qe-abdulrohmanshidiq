public class kubus {
    int sisi1;
    int sisi2;
    int sisi3;

    public kubus(int sisi1, int sisi2, int sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }
    public int hitungVolumeKubus(){
        return this.sisi1*this.sisi2*this.sisi3;
    }

}
