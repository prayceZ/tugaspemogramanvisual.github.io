
package pkg01_segitiga;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double L, K, a, t, s;
        Scanner masuk = new Scanner(System.in);
        System.out.println("masukan alas=");
        a = masuk.nextDouble();
        System.out.println("masukan tinggi=");
        t = masuk.nextDouble();
        s =a;
        L = 0.5 * (a*t);
        K = s+s+s;
        System.out.println("luas segitiga ="+L);
        System.out.println("keliling segitiga ="+K);
    }
    
}
