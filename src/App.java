public class App {
    public static void main(String [] args) {
        Karyawan karyawan1 = new Karyawan("000001","ojan", "bos");
        Karyawan karyawan2 = new Karyawan("000002","zul","staff");
        System.out.println("data karyawan 1: ");
        karyawan1.info();

        System.out.println();

        System.out.println("data karyawan 2: ");
        karyawan2.info();

        System.out.println();

        karyawan1.setNama("rifki");
        karyawan1.setJabatan("pembantu");
        System.out.println("data karyawan yang sudah di ubah: ");
        System.out.println("data karyawan 1: ");
        karyawan1.info();
    }
}