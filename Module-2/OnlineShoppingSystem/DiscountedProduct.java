class DiscountedProduct extends Product {
    private final DiscountStrategy discountStrategy;

    public DiscountedProduct(String Producttype,String name, int Stock, Double Price, DiscountStrategy discountStrategy) {
        super(Producttype,name, Stock, Price);
        this.discountStrategy = discountStrategy;
    }

    @Override
    public Double getPrice() {
        return discountStrategy.applyDiscount(super.getPrice());
    }
}
