import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //Live Template Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("---------------------------------------------------------");
        System.out.println("----------------Manajemen Keuangan-----------------------");
        System.out.println("---------------------------------------------------------");
        int Pilihan;

        do {
            System.out.println("Beberapa Menu Di Halaman ini\n");
            System.out.println("1. Manajemen Keuangan Pribadi");
            System.out.println("2. Kehematan Pengeluaran Anda");
            System.out.println("3. Keluar\n");
            System.out.println("Masukan Pilihan Anda : ");
            Pilihan = scan.nextInt();

            //Template Live switchwc
            switch (Pilihan){
                case 1: ManajemenKeuangan();
                    break;
                case 2: KehematanKeuangan();
                    break;
                case 3: Keluar();
                    break;

            }
        }while(Pilihan !=3);
    }


    //Live Template

    /**
     *
     */
    public static void ManajemenKeuangan(){
        Scanner scan = new Scanner(System.in);


        int Gaji;
        Double Kebutuhan, Tabungan, Jajan;

        System.out.println("Masukan Gaji Bulanan Anda :");
        Gaji = scan.nextInt();

        Kebutuhan = Gaji * 0.5;
        System.out.println("Uang Kebutuhan Pribadi \t: "+ Kebutuhan);

        Tabungan = Gaji * 0.2;
        System.out.println("Uang Untuk Di Tabung \t: "+ Tabungan);

        Jajan = Gaji * 0.3;
        System.out.println("Uang Jajan \t\t: "+ Jajan);
    }

    //Live Template

    /**
     * @KehematanKeuangan
     */
    public static void KehematanKeuangan() {
        Scanner scan = new Scanner(System.in);

        int gaji, Pengeluaran;
        System.out.println("Masukan Gaji Bulanan Anda :");
        gaji = scan.nextInt();

        System.out.println("Pengeluaran Anda Bulan Ini :");
        Pengeluaran = scan.nextInt();

        if (gaji * 0.7 < Pengeluaran){
            System.out.println("Anda Terlalu Borors\n");
        }else{
            System.out.println("Anda Sudah Berhemat\n");
        }
    }
    //Live Template

    /**
     * @Keluar
     */
    public static void Keluar(){
        System.out.println("---------------------------------------------------------");
        System.out.println("----------------Manajemen Keuangan-----------------------");
        System.out.println("---------------------------------------------------------");
    }
}