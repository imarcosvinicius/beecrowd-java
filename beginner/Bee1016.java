import java.util.Scanner;

public class Bee1016 {
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int distance = sc.nextInt();
            int timeInMinutes = calculateTravelTime(distance);
            System.out.println(timeInMinutes + " minutos");
        }
    }

    private static int calculateTravelTime(int distance) {
        return distance * 2;        
    }
}