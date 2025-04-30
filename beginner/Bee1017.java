import java.util.Scanner;

public class Bee1017 {

    private static final int AUTONOMY = 21;
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
 
            int travelTime = sc.nextInt();
            int averageSpeed = sc.nextInt();

            double distance = calculateDistance(averageSpeed, travelTime);
            double fuelSpent = calculateFuelSpent(distance);

            System.out.printf("%.3f%n", fuelSpent);
        }
    }

    private static double calculateDistance(int speed, int time) {
        return speed * time;
    }

    private static double calculateFuelSpent(double distance) {
        return distance / AUTONOMY;
    }

}