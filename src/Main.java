import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("01","A",200000);
        Product product2 = new Product("02","B",400000);
        Product product3 = new Product("03","C",300000);

        List<Product> productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        PriceComparator priceComparator = new PriceComparator();
        productList.sort(priceComparator);
        System.out.println("Comparing as price ascending");
        for (Product product: productList) {
            System.out.println(product.toString());
        }
        Collections.reverse(productList);
        System.out.println("Comparing as price descending");
        for (Product product: productList) {
            System.out.println(product.toString());
        }
    }
}