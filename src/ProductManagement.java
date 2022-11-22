import java.util.ArrayList;
import java.util.List;

public class ProductManagement {
    private static ArrayList<Product> products;

    private ProductManagement() {
        products = new ArrayList<>();
    }

    public static ArrayList<Product> getProducts() {
        return products;
    }

    public boolean isProduct(String productId) {
        for (Product product: products) {
            if (product.getId().equals(productId)) {
                return true;
            }
        }
        return false;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProductById(String productId) {
        products.removeIf(product -> isProduct(productId));
    }

    public void setProduct(String productId, String productName, long productPrice) {
        for (Product product: products) {
            if (isProduct(productId)) {
                product.setName(productName);
                product.setPrice(productPrice);
            }
        }
    }

//    public List<Product> getProductsList() {
//        return products;
//    }

//    public Product searchProductById(String productId) {
//        for (Product product: products) {
//            if (isProduct(productId)) {
//                return product;
//            }
//        }
//        return null;
//    }

    public List<Product> searchProductByName(String productName) {
        List<Product> tempProductsList = new ArrayList<>();
        for (Product product: products) {
            if (isProduct(productName)) {
                tempProductsList.add(product);
            }
        }
        return tempProductsList;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Product product: products) {
            result.append(product).append("\n");
        }
        return result.toString();
    }
}
