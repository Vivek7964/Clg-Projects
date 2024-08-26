class Order {
    private final Cart cart;
    private String orderStatus;

    public Order(Cart cart) {
        this.cart = cart;
        this.orderStatus = "Pending";
    }
    
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void placeOrder() {
        if (cart.getTotalPrice() > 0) {
            setOrderStatus("Confirmed");
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Your cart is empty!");
        }
    }

    public void displayOrderDetails() {
        System.out.println("Order Status: " + orderStatus);
        cart.displayCart();
    }
}
