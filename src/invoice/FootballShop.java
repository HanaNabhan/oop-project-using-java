package invoice;

abstract public class FootballShop implements comparable<FootballShop>{
    protected String brand;
    protected int quantity;
    protected double price;

    public FootballShop(String brand, int quantity, double price) {
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
    }

    public  FootballShop() {
        // constructor with no arguments
        
    }

    public String getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        
    }

    // abstract methods
    public abstract void display();

    public abstract double calcPrice();
   
   public int compareTo(FootballShop b){
       return Double.compare(price, price);
      
       
       
   }

}
