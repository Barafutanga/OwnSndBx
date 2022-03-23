import java.util.Scanner;

public class DartMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("WELCOME TO MATHTEST! LET'S CHECK YOUR CALCULATING CAPACITY");
        
        int x, y, calc, score = -1;
        double result, answer;
        
        do {
            calc = (int) Math.floor (Math.random() * 4); 
            calc = 2;
            
            if (calc == 0) {
                x = (int) Math.floor (Math.random() * 99);
                y = (int) Math.floor (Math.random() * 99);
                result = x + y;
            } else if (calc == 1) {
                x = (int) Math.floor (Math.random() * 99);
                y = (int) Math.floor (Math.random() * 10);
                result = x * y;
            } else if (calc == 2) { //arredondando o resultado
                x = (int) Math.floor (Math.random() * 99);
                y = (int) Math.floor (Math.random() * 10);
                result = x / y;
            } else {
                x = (int) Math.floor (Math.random() * 14);
                y = (int) Math.floor (Math.random() * 5);
                result = Math.pow(x, y);
            }
            
            if (calc == 0) {
                System.out.printf("%d + %d = ", x, y);
            } else if (calc == 1) {
                System.out.printf("%d * %d = ", x, y);
            } else if (calc == 2) {
                System.out.printf("%d / %d = ", x, y);
            } else {
                System.out.printf("%d ^ %d = ", x, y);
            }
            
            answer = sc.nextDouble();
            score++;
            
        } while (result == answer);
        
        System.out.printf("GAME OVER\nSCORE: %d", score);
        sc.close();
    }    
}
