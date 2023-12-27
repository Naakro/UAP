import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Deklarasi variabel
        Scanner input = new Scanner(System.in);
        int pilihan;
        double angka1, angka2;

        // Tampilkan menu
        System.out.println("Menu Kalkulator");
        System.out.println("1. Akar Kuadrat");
        System.out.println("2. Pangkat");
        System.out.println("3. Logaritma Natural");
        System.out.println("4. Faktorial");
        System.out.print("Masukkan pilihan Anda: ");
        pilihan = input.nextInt();

        // Pilih operasi
        switch (pilihan) {
            case 1:
                // Akar kuadrat
                System.out.print("Masukkan angka: ");
                angka1 = input.nextDouble();
                System.out.println("Akar kuadrat dari " + angka1 + " adalah " + Math.sqrt(angka1));
                main(args);
            case 2:
                // Pangkat
                System.out.print("Masukkan angka: ");
                angka1 = input.nextDouble();
                System.out.print("Masukkan pangkat: ");
                angka2 = input.nextDouble();
                System.out.println(angka1 + " pangkat " + angka2 + " adalah " + Math.pow(angka1, angka2));
                main(args);
            case 3:
                // Logaritma natural
                System.out.print("Masukkan angka: ");
                angka1 = input.nextDouble();
                System.out.println("Logaritma natural dari " + angka1 + " adalah " + Math.log(angka1));
                main(args);
            case 4:
                // Faktorial
                System.out.print("Masukkan angka: ");
                angka1 = input.nextDouble();
                System.out.println("Faktorial dari " + angka1 + " adalah " + Math.atan(angka1));
                main(args);
            default:
                System.out.println("Pilihan tidak valid");
                main(args);
        }
    }
}
