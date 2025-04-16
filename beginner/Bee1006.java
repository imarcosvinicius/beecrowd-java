import java.util.Scanner;
import java.util.Locale;

public class Bee1006 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double pesoA = 2.0;
        double pesoB = 3.0;
        double pesoC = 5.0;

        double media = (a * pesoA + b * pesoB + c * pesoC) / (pesoA + pesoB + pesoC);

        System.out.printf("MEDIA = %.1f%n", media);

        sc.close();
    }
}
