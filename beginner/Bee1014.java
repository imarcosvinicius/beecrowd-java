import java.util.Scanner;
import java.util.Locale;

public class Bee1014 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();
        double fuel = sc.nextDouble();

        double average = distance / fuel;

        System.out.printf("%.3f km/l%n", average);

        sc.close();
    }
}