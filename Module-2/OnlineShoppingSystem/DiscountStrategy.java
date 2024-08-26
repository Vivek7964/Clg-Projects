interface DiscountStrategy {
    double applyDiscount(double price);
}

class NoDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price;
    }
}

class SeasonalDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.9;  // 10% discount
    }
}

class ClearanceDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.7;  // 30% discount
    }
}
