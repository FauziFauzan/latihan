public class Staff {
    private String Nama;
    private int Umur;
    private int TahunMasuk; 
    public Staff (String Nama, int Umur, int TahunMasuk) {
        this.Nama = Nama;
        this.Umur = Umur;
        this.TahunMasuk = TahunMasuk;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getUmur() {
        return Umur;         
    }

    public void setUmur(int Umur){
        this.Umur = Umur;
    }

    public int getTahunMasuk() {
        return TahunMasuk;
    }

    public void setTahunMasuk(int TahunMasuk) {
        this.TahunMasuk = TahunMasuk;
    }
}
