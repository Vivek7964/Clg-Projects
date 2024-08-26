public class Main {
    public static void main(String[] args) {
        Product phone = new Electronics("Moblie","Apple","Electronics","Smartphone", 2, 50000.00);
        Product shirt = new Clothing("Red","T-Shirt",40,"Clothes","T-Shirt", 2, 1000.0);

        Cart cart = new Cart();
        cart.addProduct(phone);
        cart.addProduct(shirt);

        Order order = new Order(cart);
        order.displayOrderDetails();
        order.placeOrder();
        System.out.println();

        Cart cart2=new Cart();
        DiscountedProduct discountedPhone = new DiscountedProduct("Electonics","Smartphone",2, 70000.0, new SeasonalDiscount());
        cart2.addProduct(discountedPhone);
        order.displayOrderDetails();
    }
}
