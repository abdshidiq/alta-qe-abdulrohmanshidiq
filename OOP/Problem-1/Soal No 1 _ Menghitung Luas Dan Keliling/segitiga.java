public class segitiga {
    int alas;
    int tinggi;

    public segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int hitungLuas(){
        return this.alas*this.tinggi /2;
    }
    public int hitungKeliling(){
        return this.tinggi*2 + this.alas;
    }
}

