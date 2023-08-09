import java.util.ArrayList;
import java.util.Scanner;;

public class bubblesort{
  public static Scanner input=new Scanner(System.in);

 public static void main(String[] args) {
 


 System.out.println("You will enter numbers(int) and I will sort them for you. ");
 System.out.println("Enter integer values separated by spaces:");
 String userInput = input.nextLine();

 String[] inputValues = userInput.split(" ");
 ArrayList<Integer> dynamicArray = new ArrayList<>();

 for (String inputValue : inputValues) {
     try {
         int value = Integer.parseInt(inputValue);
         dynamicArray.add(value);
     } catch (NumberFormatException e) {
         System.out.println("Invalid input: " + inputValue);
     }
 }

 


 

 

 sorting classOfBubblesort= new sorting();


 System.out.println("Before Sorting: ");
 for (int i = 0; i < dynamicArray.size(); i++) {
     System.out.println("Index " + i + ": " + dynamicArray.get(i));

 }




 

 System.out.println("\n"+"====================================================================================");



 System.out.println("After sorting: ");
 classOfBubblesort.sortingAlgorithm(dynamicArray);


  
        System.out.println("\n Enter the value to search for its index position in array");
        Integer key=input.nextInt(); 

      

      System.out.println("Do you prefer binary searching or linear searching: Press 1 for binary, 2 for linear");
      int prefer=input.nextInt(); 


      if (prefer == 1) {
         sorting.binarySearching(dynamicArray, key);
      } else if(prefer == 2) {
         sorting.linearSearching(dynamicArray, key);
      } else{
         System.out.println("Error in input");
         System.exit(0);
      }

   





 

 System.out.println("\n"+"====================================================================================");



 

  
        

   
}

public static void assignValues(int[] a, int i, Double[] arrayTwo ) {
   if (arrayTwo != null) {
      Double inpu= input.nextDouble();
      arrayTwo[i]= inpu;
   }
   else{
      int inp= input.nextInt();
      a[i]= inp;
   }
   
}




}


 class sorting {

   private boolean notYetSorted;

   public  sorting() {
       notYetSorted= true;
   }

   public void sortingAlgorithm(ArrayList<Integer> dynamicArray) {

   if (dynamicArray !=null) {
       while (notYetSorted==true) {
        notYetSorted=false;
                    for (int i = 0; i < dynamicArray.size() - 1; i++) {
                if (dynamicArray.get(i) > dynamicArray.get(i + 1)) {
                    Integer temp = dynamicArray.get(i);
                    dynamicArray.set(i, dynamicArray.get(i + 1));
                    dynamicArray.set(i + 1, temp);
                    notYetSorted = true; // Array wasn't sorted, so we'll continue sorting
                }
            }
        }
         System.out.println("Sorted values:");
        for (double value : dynamicArray) {
            System.out.print("\t" + value);
        }
          
               }
   else{
    System.out.println("Empty array");
   }
   }



   public static void binarySearching(ArrayList<Integer> dynamicArray, int key){
    
       if (dynamicArray !=null) {
           int low = 0;
        int high = dynamicArray.size() - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < dynamicArray.get(mid)) {
                high = mid - 1;
            } else if (key == dynamicArray.get(mid)) {
                System.out.println(key + " is found in the array at index " + mid);
                System.exit(0);
            } else {
                low = mid + 1;
            }
        }
        System.out.println(key + " is not present in the array, it should have been at index " + low);
    
       }
      }


       public static void linearSearching(ArrayList<Integer> dynamicArray, int key){
     
           if (dynamicArray !=null) {
                boolean found = false;
        for (int i = 0; i < dynamicArray.size(); i++) {
            if (key == dynamicArray.get(i)) {
                System.out.println(key + " is present in the array at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(key + " is not present in the array");
        }
           } 
      } 
   
}
