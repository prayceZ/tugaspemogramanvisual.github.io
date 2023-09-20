
package pkg02_data;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner data = new Scanner(System.in);
    System.out.println("masukan nama anda :");
    String nama =data.nextLine();
    System.out.println("masukan usia anda :");
    int usia = data.nextInt();
    System.out.println("masukan tinngi anda :");
    double tinngiBadan =data.nextDouble();
    
    System.out.println("masukana nama anda ="+nama);
    System.out.println("masukan usia anda="+usia);
    System.out.println("masukan tinngi badan anda="+tinngiBadan);
            
            
    }
    
}
