import java.rmi.server.SocketSecurityException;

public class matchingPin {
 
    int usersPin[];
    int pin[]= new int[5];

    public matchingPin() {
    }


    public static void matchingPinFunc(int usersPin[], int Randompin[], int[] thePin, int[] inputPin) {
        
        boolean fullyMatched= false;
        boolean didNotMatch= false;
        String thisDigit="";
        int j=0;
        int endLoop=0;
        



        while (fullyMatched==false) {
            for (int i = 0; i < 10; i++) {
                ++endLoop;
                if (inputPin[j]==Randompin[i]) {
                   
                    if (thePin[i] == usersPin[j]) {
                        thisDigit=  thisDigit + thePin[i] ;
                        if (j<=4) {
                            ++j;
                        } 
                     } 
                     if (i==10 && j<2){
                        i=0;
                     }

                }
            }

            if (j==5) {
                didNotMatch=false;
                fullyMatched= true;
            } 
            else if(endLoop >= 20 && j!=5){
                didNotMatch =true;
                break;
            }

            
        }

        if(didNotMatch==false){
            System.out.println("Match: Your PIN is: " + thisDigit);
        } else if(didNotMatch==true) {
            System.out.println("Mis-Match: Wrong PIN entered");
        }

        
    }


    
}
