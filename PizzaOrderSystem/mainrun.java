

public class mainrun {
     

    public static void main(String[] args) {
     



        pizzaclass pizzaOne= new pizzaclass('L', 5, 3, 1);
        pizzaclass pizzaTwo= new pizzaclass('M', 2, 5, 3);
        pizzaclass pizzaThree= new pizzaclass('S', 2, 3, 4);
       pizzaOne.setsizeOfPizza('L');
       pizzaOne.setToppings(5, 3, 1);
       pizzaOne.calcCost();
       pizzaTwo.setsizeOfPizza('M');
       pizzaTwo.setToppings(2, 5, 3);
       pizzaTwo.calcCost();
       pizzaThree.setsizeOfPizza('S');
       pizzaThree.setToppings(2, 3, 4);
       pizzaThree.calcCost();

      System.out.println(pizzaOne.getDescription());
      System.out.println("=============================================");
      System.out.println(pizzaTwo.getDescription());
      
      System.out.println("=============================================");
      System.out.println(pizzaThree.getDescription());
      
      System.out.println("=============================================");

      pizzaOrder order= new pizzaOrder();
      order.setNumPizzas(4);
      order.setPizza(0, pizzaOne);
      order.setPizza(1, pizzaTwo);
      order.setPizza(2, pizzaThree);
      order.setPizza(3, pizzaTwo);
      

      order.calcTotal();



      System.out.println("=============================================");




      pizzaOrder order2= new pizzaOrder(order);
      order2.getpizza(0).setToppings(5, 7, 1);
    
      System.out.println("=============================================");



      
     
    }
}
