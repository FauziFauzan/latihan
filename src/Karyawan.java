public class Karyawan {
    private String Nip;
    private String Nama;
    private String Jabatan;
    public Karyawan(String Nip, String Nama, String Jabatan) {
        this.Nip = Nip;
        this.Nama = Nama;
        this.Jabatan = Jabatan;
    }

    public String getNip() {
        return Nip;
    }

    public void setNip(String Nip) {
        this.Nip = Nip;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getJbatan() {
        return Jabatan;
    }

    public void setJabatan(String Jabatan) {
        this.Jabatan = Jabatan;
    }

    public void info () {
        System.out.println ("Nip: " + Nip);
        System.out.println("Nama: " + Nama);
        System.out.println("Jabatan: " + Jabatan);
    }
}
