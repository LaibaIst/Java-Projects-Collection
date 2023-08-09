public class pizzaclass {

    private char sizeOfPizzaR;
    private double hamTopsR;
    private double cheeseTopsR;
    private double pepperoniTopsR;
    private double cost;
    private double totalCost;
    private String Result;

    public pizzaclass(char sizeOfPizzaR, double hamTopsR, double cheeseTopsR, double pepperoniTopsR){
    }

    public pizzaclass(pizzaclass aPizzaclass){
        sizeOfPizzaR=aPizzaclass.sizeOfPizzaR;
        hamTopsR=aPizzaclass.hamTopsR;
        cheeseTopsR=aPizzaclass.cheeseTopsR;
        pepperoniTopsR=aPizzaclass.pepperoniTopsR;
        cost=aPizzaclass.cost;
        totalCost=aPizzaclass.totalCost;
        Result=aPizzaclass.Result;

    }

    public void setsizeOfPizza(char sizeOfPizza) {
        if (sizeOfPizza == 'S' || sizeOfPizza == 'L' || sizeOfPizza == 'M' ) {
            this.sizeOfPizzaR= sizeOfPizza;   
        } else{
            System.out.println("error");
            System.exit(0);

        }
        
    }
    public char getsizeOfPizza() {
        return sizeOfPizzaR;
    }

    public void setToppings(double hamTops, double cheeseTops, double pepperoniTops) {
        this.cheeseTopsR=cheeseTops;
        this.hamTopsR= hamTops;
        this.pepperoniTopsR=pepperoniTops;
    }

    public double getCheeseToppings() {
        return cheeseTopsR;
    }
    public double getHamToppings() {
        return hamTopsR;
    }
    public double getPepToppings() {
        return pepperoniTopsR;
    }

    public double calcCost() {
        if (getsizeOfPizza()=='S') {
            cost=10; 
        } else if (getsizeOfPizza()=='M'){
            cost=12;
        } else if(getsizeOfPizza()=='L'){
            cost=14;
        }

        totalCost= cost + (getHamToppings()*2) + (getCheeseToppings()*2) + (getPepToppings()*2);
        return totalCost;
    }


    public String getDescription(){
      
    System.out.println ("This size of pizza is: " +getsizeOfPizza() + "\n" +
    "The number of ham toppings is: " + getHamToppings() + "\n" +
    "The number of cheese toppings is: " + getCheeseToppings() + "\n" +
    "The number of pepperoni toppings is: " + getPepToppings() + "\n" +
    "The total cost of your pizza is: " + calcCost()
    );
    return "";
    }

}
