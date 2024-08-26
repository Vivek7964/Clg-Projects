public class Product{
    private final String Producttype;
    private final String name;
    private final int Stock;
    private final Double Price;

    public Product(String Producttype,String name,int Stock,Double Price) {
        this.Producttype=Producttype;
        this.Stock=Stock;
        this.Price=Price;
        this.name = name;
    }

    public String getProducttype(){
        return Producttype;
    }
    public int getStock(){
        return Stock;
    }
    public Double getPrice(){
        return Price;
    }
    public String getName(){
        return name;
    }
    public void displayProductDetails() {
        System.out.println("Product type:"+ Producttype);
        System.out.println("Product Name: " + name);
        System.out.println("Product Stock: " + Stock);
        System.out.println("Price: $" + Price);
    }
}