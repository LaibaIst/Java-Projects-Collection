public class pizzaOrder {
    int numPizzas;
    pizzaclass newpizza;
    int totalCost;
    pizzaclass[] Pizzas;;

    public pizzaOrder(){

    }

    public void setNumPizzas(int numPizzas) {
        Pizzas =new pizzaclass[numPizzas];
    }

    public void setPizzasIntoarray(int indexOfPizza, pizzaclass thePizza) {
         
        if (Pizzas[indexOfPizza]==null) {
        Pizzas[indexOfPizza]= thePizza;
        } else{
            System.out.println("Error");
        }


    }

    public void setPizza(int index, pizzaclass newpizza) {
        this.newpizza=newpizza;
        setPizzasIntoarray( index, newpizza);
        
    }


    public void errorcheck() {
        for (int i = 0; i < Pizzas.length; i++) {
            System.out.println(Pizzas[i]);
        }
    }
    public double calcTotal() {
        double totalCost=0;
        for (int i = 0; i < Pizzas.length; i++) {
             totalCost= totalCost + Pizzas[i].calcCost();
        }
        
        System.out.println("The total cost of the pizzas is: " + totalCost);
        return totalCost;    }


        public int getNumPizzas() {
            return numPizzas; 
        }

        public pizzaclass getpizza(int index) {
               if (Pizzas[index] != null) {
                return Pizzas[index];    
            } else {
                return null;
            }
        
        }



        public pizzaOrder(pizzaOrder aPizzaOrder) {
           newpizza= new pizzaclass(aPizzaOrder.newpizza);
            this.numPizzas= aPizzaOrder.numPizzas;
            this.totalCost= aPizzaOrder.totalCost;
            this.Pizzas= aPizzaOrder.Pizzas;
        }

        

}
