package master;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DartMath {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO MATHTEST! LET'S CHECK YOUR MOM.. I MEAN, CALCULATING CAPACITY");

        int x, y, answer, result, calc, score = -1;

        do {
        x = (int) Math.floor (Math.random() * 99);
        y = (int) Math.floor (Math.random() * 99);
        calc = (int) Math.floor (Math.random() * 2); 

        if (calc == 0) {
            result = x + y;
        } else {
            result = x * y;
        }
        
        if (calc == 0) {
        System.out.printf("%d + %d = ", x, y);
        } else {
            System.out.printf("%d * %d = ", x, y);
        }

        TimeUnit.SECONDS.sleep(1);
        answer = sc.nextInt();
        System.out.println(answer);
        score++;
        } while (result == answer);

        System.out.printf("GAME OVER\nSCORE: %d", score);

        sc.close();
    }    
}
