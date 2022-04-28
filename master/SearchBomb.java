package master;

public class SearchBomb {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 999);
        int y, attempts = 0;
        do {
            attempts++;
            y = (int) Math.floor(Math.random() * 99999);
            System.out.print(" - " + y);
            
        } while (y != x);
        System.out.println("\nATTEMPTS: " + attempts);
    }
}
