import java.util.Scanner;
import java.util.Locale;

public class Bee1005 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double pesoA = 3.5;
        double pesoB = 7.5;

        double media = (a * pesoA + b * pesoB) / (pesoA + pesoB);

        System.out.printf("MEDIA = %.5f%n", media);

        sc.close();
    }
}
