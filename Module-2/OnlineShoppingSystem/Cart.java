import java.util.ArrayList;

class Cart {
    private final ArrayList<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void displayCart() {
        for (Product product : products) {
            product.displayProductDetails();
            System.out.println();
        }
        System.out.println("Total Price: $" + getTotalPrice());
    }
}
