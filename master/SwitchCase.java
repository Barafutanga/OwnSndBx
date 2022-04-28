package master;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int method;

        method = sc.nextInt();
        double price = 130.00;
        while (method != 1 || method != 2) {
        if (method == 1) {
            System.out.println("Pagamento à vista!");
            double discount = price - (price * 0.15);
            System.out.println(discount); 
        } else if (method ==2) {
            System.out.println("Pagamento parcelado");
            double discount = price + (price * 0.1);
            System.out.println(discount); 
        } else {
            System.out.println("Opção inválida!");
        }
    }
        sc.close();
    }   
}