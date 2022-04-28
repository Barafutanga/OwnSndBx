package master;
import java.util.Scanner;

public class AgeVerif {

    public static void number(int x) {
        if (x >= 50) {
            System.out.print(x + 1);
        } else {
            System.out.print(x - 1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.print("DIGIT A NUMBER\n");
        x = sc.nextInt();
        number(x);

        sc.close();
    }
}