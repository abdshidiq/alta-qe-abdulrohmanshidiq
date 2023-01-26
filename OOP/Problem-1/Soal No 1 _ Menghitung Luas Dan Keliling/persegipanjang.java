public class persegipanjang {
    int panjang;
    int lebar;

    public persegipanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int hitungLuas(){ return this.panjang*this.lebar;
    }
    public int hitungKeliling(){ return (this.panjang*2)+(this.lebar*2);
    }
}


