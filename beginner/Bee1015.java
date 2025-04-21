import java.util.Locale;
import java.util.Scanner;

public class Bee1015 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();

            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            double distance = calculateDistance(x1, y1, x2, y2);
            printDistance(distance);
        }
    }

    private static double calculateDistance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.hypot(dx, dy);
    }

    private static void printDistance(double distance) {
        System.out.printf("%.4f%n", distance);
    }

}