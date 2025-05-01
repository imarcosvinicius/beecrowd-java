import java.util.Scanner;

public class Bee1019 {

    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
            int timeInSeconds = sc.nextInt();

            System.out.println(formatSecondsToTime(timeInSeconds));
       }
    }

    private static String formatSecondsToTime(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        return String.format("%01d:%01d:%01d", hours, minutes, seconds);
    }

}