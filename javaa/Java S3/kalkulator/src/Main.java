import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Program Kalkuator Sederhana");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pembagian");
        System.out.println("3. Perkalian");
        System.out.println("4. Pengurangan");
        System.out.println("5. Sisa Bagi");

        // Input Data
        int Sum1, Sum2, Choic, result=0;
        System.out.println("Masukan Angaka Pertama : ");
        Sum1 = scan.nextInt();

        System.out.println("Masukan ANgka Kedua: ");
        Sum2 =scan.nextInt();

        System.out.println("Masukan Operasi");
        Choic=scan.nextInt();

        System.out.println("Hasil : "+ result);
    }
}