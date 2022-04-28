package master;
import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    int[] cod = {101, 102, 103, 104};
    double[] per = {0.1, 0.2, 0.3, 0.4};
   // double[] sal = {0.0, 0.0, 0.0, 0.0};
    String[] job = {"Manager", "Engineer", "Tecnician", "Others"};

    System.out.print("CODE  JOB       PERCENTAGE\n");
    for (int i = 0; i < cod.length; i++) {
        System.out.printf("%d - %s - %.2f\n", cod[i], job[i], per[i]);
    }

    System.out.println("Insert job code: ");
   // int search = sc.nextInt();

    sc.close();
    }
    
    
}
