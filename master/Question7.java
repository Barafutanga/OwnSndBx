package master;
import java.util.Scanner;

public class Question7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit = 0;

        double priceunit = 0.0;
        System.out.println("How many units will you buy?");
        unit = sc.nextInt();
        
        if (unit <= 20) {
            priceunit = 1.8;
            double total = priceunit * unit;
            System.out.printf("Amount buyed: %d\nTotal R$:%.2f", unit, total);
        } else {
            priceunit = 1.4;
            double total = priceunit * unit;
            System.out.printf("Amount buyed: %d\nTotal R$:%.2f", unit, total);
        }
        sc.close();
    }
}