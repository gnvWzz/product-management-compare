import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return Long.compare(product1.getPrice(), product2.getPrice());
    }
}
