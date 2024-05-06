import java.util.Scanner;

public class nilai {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print ("masukan nilai: ");
        int nilai = input.nextInt();
        char keterangan;

        if (nilai >=0 && nilai <= 100) {

            if (nilai >= 90) {
                keterangan = 'A';
            } else if (nilai >= 80) {
                keterangan = 'B';
            } else if (nilai >= 70) {
                keterangan = 'C';
            } else if (nilai >= 60) {
                keterangan = 'D';
            } else {
                keterangan = 'E';
            }
            
            System.out.println("Nilai: "+ nilai);
            System.out.println("keterangan: " + keterangan);
            
            switch (keterangan) {
                case 'A':
                    System.out.println ("lu pinter bangsatt_!!");
                    break;
                case 'B':
                    System.out.println ("tolol");
                    break;
                case 'C':
                    System.out.println ("bodoh");
                    break;
                case 'D':
                    System.out.println ("GOBLOKK-!!");
                    break;
                case 'E':
                    System.out.println ("GOBLOK, TOLOL, UDAH TAU DIA GASUKA MASIH BERHARAP, UDAH MAH GOBLOK TOLOL LAGI IDUP LAGI MENDING MATI LU KONTOLLL-!!");
                    break;
            }
        } else {
            System.out.println ("nilai ridak valid.");
        }
    }
}
