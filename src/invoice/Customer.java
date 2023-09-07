package invoice;



public class Customer {

    private  String custName;
    private int numOfitems;
    private double totalPay;
    private FootballShop[] itemList;

    public  Customer(String custName) {
        this.custName = custName;
        this.numOfitems = 0;
        this.itemList = new FootballShop[10];
        this.totalPay = 0;

    }

    public String getCustName() {
        return custName;
    }

    public int getNumOfitems() {
        return numOfitems;
    }

    public double getTotalPay() {

        return totalPay;
    }
    public void buy(FootballShop product) {
        // ensure that the itemList array  doesn't exceed its initial size
        FootballShop[] newlist = new FootballShop[itemList.length + 1];
        for (int i = 0; i < itemList.length; i++) {
            // coppy the itemlist array in newlist array
            newlist[i] = itemList[i];
        }
        // take the last index and put the new product in it
        newlist[itemList.length] = product;
        // copy the newlist in the itemlist 
        itemList = newlist;
        numOfitems++;
        System.out.println("Item " + numOfitems);
        product.display();
        totalPay += product.calcPrice();
    }

    @Override
    public String toString() {
                   
          String result = "Welcome " + custName+ "\nList of Football Items Bought \n";
          return result;
    }

    public void print() {

        System.out.printf("TOTAL: $%.2f\n", totalPay);
    }

}
