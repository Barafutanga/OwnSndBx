package master;
import java.util.Scanner;
public class SecProj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("WE NEED 00!!!");
        
        int x, tries = 0;

        do {
            x = (int) Math.floor (Math.random() * 99999);
            System.out.print(" " + x);
            tries++;
        } while (x != 00);

        System.out.println();
        System.out.println("ATTEMPTS: " + tries);
        sc.close();
    }    
}
