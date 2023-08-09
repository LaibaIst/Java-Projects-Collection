import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        

        Scanner scan= new Scanner(System.in);

        Random rand= new Random();


        
        int randomPIN[]= new int[10];
        
        // ASSIGNING RANDOM INTS TO ARRAY
        for (int i = 0; i < randomPIN.length; i++) {
            randomPIN[i]= rand.nextInt(4);
        }

        // for (int i = 0; i < randomPIN.length; i++) {
        //     randomPIN[i]= 
        // }


        int usersPin[]= new int[6];
        usersPin[0]=1;
        usersPin[1]=9;
        usersPin[2]=7;
        usersPin[3]=8;
        usersPin[4]=9;


        int pin[]= new int[10];
        
        for (int i = 0; i < pin.length; i++) {
            pin[i]= i;
        }

        int inputPin[]= new int[6];

       
        System.out.println("Your pin is stored in the database. \n Enter your 5-digit pin from the random pin generated: " + "\n");

        System.out.println("PIN: ");
        for (int i : pin) {
            System.out.print("\t" + pin[i]);
        }

        
        System.out.println("\n"+"RANDOM NUMBERS: ");
        // PRINTING RANDOM PIN
        for (int i = 0; i < randomPIN.length; i++) {
            System.out.print("\t" + randomPIN[i]);
        }
        System.out.println("\n");

        
        System.out.println("\n"+"Input your PIN number");
        int firstDig = scan.nextInt();
        int secondDig = scan.nextInt();
        int thirdtDig = scan.nextInt();
        int fourthDig = scan.nextInt();
        int fifthtDig = scan.nextInt();

        inputPin[0]= firstDig;
        inputPin[1]= secondDig;
        inputPin[2]= thirdtDig;
        inputPin[3]= fourthDig;
        inputPin[4]= fifthtDig;


        //PRINT CODE FOR INPUT PIN
        // for (int i = 0; i < inputPin.length; i++) {
        //     System.out.println(inputPin[i]);
        // }
        



        matchingPin.matchingPinFunc(usersPin, randomPIN, pin, inputPin);





    }
    
}
