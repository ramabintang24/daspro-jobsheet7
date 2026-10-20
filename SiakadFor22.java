// Rama Bintang Samudra Uda'a
import java.util.Scanner;

public class SiakadFor22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            // Modifikasi untuk menghitung jumlah lulus dan tidak lulus
            // Jika nilai >= 60, maka lulus
            // Jika nilai < 60, maka tidak lulus
            if (nilai >= 60) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah lulus: " + jumlahLulus);
        System.out.println("Jumlah tidak lulus: " + jumlahTidakLulus);
        sc.close();
    }
}