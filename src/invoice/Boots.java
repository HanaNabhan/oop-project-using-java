
package invoice;

public class Boots extends FootballShop implements DiscConsiderable {
  private int size;

    public Boots( String brand, double price, int quantity,int size) {
        super(brand, quantity, price);
       
        this.size = size;
    }
    public Boots(){
      // constructor with no arguments
    }

  
    
    @Override
    public double calcDisc() {
      return RATE*100;    }

    
    @Override
    public void display() {

        System.out.println("SOCCER BOOTS ");
        System.out.println("Brand :"+this.getBrand());
        System.out.println("Price : $ "+this.getPrice()+ " for size "+this.size);
        System.out.println("Discount :"+calcDisc()+"%");
        System.out.println("Quantity :"+this.getQuantity());
        System.out.printf("Subtotal : $ %.2f ",this.calcPrice());
        System.out.println("\n");
        
    }

 
    @Override
    public double calcPrice() {
return quantity*price -( quantity*price)*RATE;

    }

  
    
    

}
