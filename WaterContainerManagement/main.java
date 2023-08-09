import java.util.Scanner;

public class main{


    public static void main(String[] args) {
        
    container container1= new container(12, 0, 1);
    container container2= new container(new container(20, 12, 2));
    container container3= new container(new container(22, 3, 3));

    container.full(container1);

    Scanner scan= new Scanner(System.in);

    /** Displays everything about container*/ 
    container.displayWhole(container1);
    container.displayWhole(container2);
    container.displayWhole(container3);


    /**User input part */
    System.out.println("Input the amount you want to transfer: ");
    int amountToTransfer= scan.nextInt();

    System.out.println("From which container do you want to transfer: 1, 2 ,3: ");
    int ContainerNumInput= scan.nextInt();

    System.out.println("To which container do you want to transfer: 1, 2, 3: ");
    int ContainerNumOutput= scan.nextInt();


    


    if (ContainerNumInput==1 && ContainerNumOutput==2) {
        container.transfer(container1, amountToTransfer, container2);
        container.displayQuantity( container2);
        container.leftover( container1);
    } else if (ContainerNumInput==2 && ContainerNumOutput==3) {
        container.transfer(container2, amountToTransfer, container3);
        container.displayQuantity(container3);
        container.leftover(container2);
    } else if (ContainerNumInput==3 && ContainerNumOutput==1) {
        container.transfer(container3, amountToTransfer, container1);
        container.displayQuantity(container1);
        container.leftover( container3);
    } else{
        System.out.println("ERROR: Cannot transfer from same container to same container.");
    }

    

    


    }
}