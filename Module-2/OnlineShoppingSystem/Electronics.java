
class Electronics extends Product{
    private final String type;
    private final String company;
    public Electronics(String type,String company,String Producttype,String name, int Stock, Double Price) {
        super(Producttype,name, Stock, Price);
        this.type=type;
        this.company=company;
    }

    public String gettype(){
        return type;
    }
    public String getcompany(){
        return company;
    }
    @Override
    public void displayProductDetails(){
        super.displayProductDetails();
        System.out.println("Electonic type: " + type);
        System.out.println("Product Company:"+company);
    }
}