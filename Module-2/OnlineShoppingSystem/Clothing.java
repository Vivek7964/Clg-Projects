class Clothing extends Product{
    private final String Color;
    private final String type;
    private final int Size;
    public Clothing(String Color,String type,int Size,String Producttype,String name, int Stock, Double Price) {
        super(Producttype,name, Stock, Price);
        this.Color=Color;
        this.type=type;
        this.Size=Size;
    }

    public String getColor(){
        return Color;
    }
    public String gettype(){
        return type;
    }
    public int getSize(){
        return Size;
    }
    @Override
    public void displayProductDetails(){
        super.displayProductDetails();
        System.out.println("Cloth color: " + Color);
        System.out.println("Cloth type:"+ type);
        System.out.println("Cloth size:"+ Size);
    }
}