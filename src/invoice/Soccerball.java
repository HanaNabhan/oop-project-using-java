package invoice;

public class Soccerball extends FootballShop {

    private int ballType;

    public Soccerball() {
        // constructor with no arguments
    }

    public Soccerball(String brand, double price, int quantity, int ballType) {
        super(brand, quantity, ballType);
        this.ballType = ballType;
    }

    @Override
    public void display() {

        System.out.println("SOCCER BALL ");
        System.out.println("Brand :" + this.getBrand());

        String ballname = "";

        try {
            switch (ballType) {
                case 1:
                    ballname = "Professional Match";
                    price = 200;
                    break;
                case 2:
                    ballname = "Match";
                    price = 80;
                    break;
                case 3:
                    ballname = "Training";
                    price = 50;
                    break;
                case 4:
                    ballname = "Recreational";
                    price = 20;
                    break;
                default:
                    // if it's invalid balltype , exception will be thrown
                    NotBallTypeException a = new NotBallTypeException(ballType + " Not a valid soccer  ball type ,Changing the soccer ball type to training ball");

                    throw a;

            }
        } catch (NotBallTypeException e) {
            System.out.println(e.getMessage());
            ballname = "Training";
            price = 50;
            System.out.println("\n");

            System.out.println("SOCCER BALL ");
            System.out.println("Brand :" + this.getBrand());

        }

        System.out.println("Type : " + ballname);
        System.out.println("Price : $ " + price);
        System.out.println("No Discount !");
        System.out.println("Quantity :" + this.getQuantity());
        System.out.printf("Subtotal : $ %.2f ", this.calcPrice());
        System.out.println("\n");

    }

    @Override
    public double calcPrice() {
        return quantity * price;
    }

}
