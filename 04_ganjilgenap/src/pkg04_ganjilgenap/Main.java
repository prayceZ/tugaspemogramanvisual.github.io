
package pkg04_ganjilgenap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;
        System.out.println("masukan bilagan :");
        bilangan = input.nextInt();
        
        if (bilangan%2==0){
            System.out.println("bilangan"+bilangan+"adalah sebuah bilangan genap");
        }else{
            System.out.println("bilangan"+bilangan+"adalah sebuah bilangan ganjil");
        }
        
        }
    }
    

