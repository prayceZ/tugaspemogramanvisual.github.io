
package pkg03_perjumlahan;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner penjumlahan = new Scanner(System.in);
        System.out.println("masukan nilai =");
        int a = penjumlahan.nextInt();
        System.out.println("masukan nilai=");
        int b = penjumlahan.nextInt();
        int pertambahan = a + b ;
        System.out.println("hasil dari jumlah"+pertambahan);
        int perkalian = a*b;
        System.out.println("hasil dari perkalian"+perkalian);
        int pengurangan = a - b;
        System.out.println("hasil dari pengurangan"+pengurangan);
        int pembagian = a%b;
        System.out.println("hasil dari pembagian"+pembagian);
        
        
    }
    
}
