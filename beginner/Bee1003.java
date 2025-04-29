import java.util.Scanner;

public class Bee1003 {

    public static void main(String [] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = sum(a, b);
    
            System.out.println("SOMA = " + result);
        }
    }

    private static int sum(int x, int y) {
        return x + y;
    }

}
