package master;

public class FirstProj {
    public static void main (String[] args) {
        byte age = 15;
        short balance = 1020;
        int height = 100;
        long distance = 10000000;

        float score = 9;
        double sla = 10.33;

        System.out.printf("Idade: %d\nBalance: %d\nHeight: %d\nDistance: %d\nScore: %.2f\nsla: %.2f"
        , age, balance, height, distance, score, sla);
    }
}