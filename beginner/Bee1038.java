import java.util.Map;
import java.util.Scanner;

public class Bee1038 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int prodCode = sc.nextInt();
            int prodPrice = sc.nextInt();

            double total = calculateTotal(prodCode, prodPrice);
            System.out.printf("Total: R$ %.2f%n", total);
        }
    }

    private static double calculateTotal(int code, int amount) {
        Double precoUnitario = TABLE_PRODUCTS.get(code);
        return precoUnitario * amount;
    }

    private static final Map<Integer, Double> TABLE_PRODUCTS = Map.of(
        1, 4.00,
        2, 4.50,
        3, 5.00,
        4, 2.00,
        5, 1.50
    );

}