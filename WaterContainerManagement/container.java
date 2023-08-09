public class container{


Integer maxCapacity= null;
Integer givenQuantity=null;
Integer ContainerNum;

public container(Integer theMaxQuantity, Integer theGivenQuantity, Integer theContainerNum){
 this.givenQuantity=theGivenQuantity;
 this.maxCapacity= theMaxQuantity;
 this.ContainerNum=theContainerNum;
}


public container(container aContainer){
 this.givenQuantity= aContainer.givenQuantity;
 this.ContainerNum= aContainer.ContainerNum;
 this.maxCapacity=aContainer.maxCapacity;
}

public Integer quantity(container aContainer, Integer aContainerNum) {

    if (aContainer.ContainerNum == aContainerNum ) {
        System.out.println(aContainer.givenQuantity);
        return aContainer.givenQuantity;
    } else {
        System.out.println("error in code");
        return 0;
    }
    
}


/** This returns the leftover, the quantity left in after being filled */
public static Integer leftover(container aContainer) {

System.out.println("Quantity left in container " + aContainer.ContainerNum + " after filling the other container is: " +  aContainer.givenQuantity);
return aContainer.givenQuantity;
}

/**makes the container full */
public static void full(container aContainer) {
 aContainer.givenQuantity=  aContainer.maxCapacity;
 System.out.println("Container full, the amount of water in it is: " + aContainer.givenQuantity);
}

/**makes the container empty */
public static void empty(container aContainer) {
    aContainer.givenQuantity= 0;
    System.out.println("Container now empty, amount of water in it is: " + aContainer.givenQuantity);
}

/**transfers from one container to another */
public static void transfer(container aContainer, int amountToTransfer, container bContainer) {
int condition= bContainer.givenQuantity + amountToTransfer;
    if (amountToTransfer>0 && amountToTransfer <= aContainer.givenQuantity) {
   bContainer.givenQuantity= bContainer.givenQuantity + amountToTransfer;
   aContainer.givenQuantity= aContainer.givenQuantity - amountToTransfer;
} else if (amountToTransfer == bContainer.maxCapacity || condition>=aContainer.givenQuantity  ) {
    System.out.println("Transfer less amount, as it supercedes the limit of max capacity a container can handle, or there is insufficient amount in the container.");
    System.exit(0);
}
}

/**displays quantity after being filled */
public static void displayQuantity(container bContainer) {
System.out.println("After being filled the quantity in container " + bContainer.ContainerNum + " is: " + bContainer.givenQuantity );
}


/** displays everything in container */
public static void displayWhole(container aContainer) {
    System.out.println("Container Number: " + aContainer.ContainerNum + "\t"+ "Max capacity: " + aContainer.maxCapacity +"\t"+ "Amount of water in it: " + aContainer.givenQuantity);
}

// public container transfers() {
//     return new container(aContainer.) ;
    
// }
}