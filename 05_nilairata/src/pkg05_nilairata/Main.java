
package pkg05_nilairata;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            int total = 0;
            int jumlahAngka = 0;

            System.out.println("Masukkan serangkaian angka (selesai dengan menginputkan 'selesai'): ");

            while (true) {
                try {
                    String inputAngka = input.next();
                    if (inputAngka.equalsIgnoreCase("selesai")) {
                        break;
                    }
                    int angka = Integer.parseInt(inputAngka);
                    total += angka;
                    jumlahAngka++;
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid. Masukkan angka atau 'selesai' untuk mengakhiri.");
                }
            }

            if (jumlahAngka > 0) {
                double rataRata = (double) total / jumlahAngka;
                System.out.println("Rata-rata dari angka-angka yang dimasukkan adalah: " + rataRata);
            } else {
                System.out.println("Tidak ada angka yang dimasukkan.");
            }

            System.out.print("Apakah Anda ingin melanjutkan (y/n)? ");
            String jawaban = input.next();
            if (!jawaban.equalsIgnoreCase("y")) {
                lanjut = false;
            }
        }

        System.out.println("Terima kasih telah menggunakan program ini!");
        input.close();
    }
}
