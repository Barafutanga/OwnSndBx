package master;
import java.util.Scanner;

public class Question8 {

public static void inss(double sallary, double bs, double tax) {
    double ls = bs - ((bs * tax) / 100);
    System.out.printf("Salário líquido R$:%.2f", ls);
}
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double bs = 0.0;
        double tax = 0.0;

        System.out.print("Digite seu salário bruto: ");
        bs = sc.nextInt();
        if (bs <= 600) {
            inss(bs, bs, tax);
        } else if (bs > 600 && bs <= 1200) {
            tax = 20;
            inss(bs, bs, tax);
        } else if (bs > 1200 && bs <= 2000) {
            tax = 25;
            inss(bs, bs, tax);
        } else if (bs > 2000) {
            tax = 30;
            inss(bs, bs, tax);
        }
        sc.close();
    }
}
