import java.text.DecimalFormat;

public class nationalCalls {
    String sourcePhoneNum;
    String DestinationPhoneNum;
    Double totalDuration_currentCall;
    static Double totalDuration_allCalls=0.0;
    Double callPrice_current=1.0;
    static Double callPrice_all=0.0;
    static double firstMin_rate= 0.20;
    static double firstsecondMin_rate= 0.15;
    static double AftersecondMin_rate= 0.10;
    static double tenTwentyMin_discountRate= 0.05;
    static double TwentyMin_discountRate= 0.07;

 
    static DecimalFormat ulp= new DecimalFormat("00.00");


    public nationalCalls(String sourcePhoneNum,String DestinationPhoneNum,Double totalDuration_currentCall) {
        
        this.sourcePhoneNum = sourcePhoneNum;
        this.DestinationPhoneNum=DestinationPhoneNum;
        this.totalDuration_currentCall = totalDuration_currentCall;
    }


    public nationalCalls(nationalCalls aNationalCalls) {
        
        sourcePhoneNum=aNationalCalls.sourcePhoneNum;
        DestinationPhoneNum= aNationalCalls.DestinationPhoneNum;
        totalDuration_currentCall= aNationalCalls.totalDuration_currentCall;

    }


    public static void priceForNationalCalls(nationalCalls aNationalCalls) {
        if (aNationalCalls.totalDuration_currentCall<=1.0) {
            aNationalCalls.callPrice_current= aNationalCalls.totalDuration_currentCall* firstMin_rate;
        } else if (aNationalCalls.totalDuration_currentCall>1.0 && aNationalCalls.totalDuration_currentCall<= 2.0) {
            aNationalCalls.callPrice_current= aNationalCalls.totalDuration_currentCall*firstsecondMin_rate;
        } else if (aNationalCalls.totalDuration_currentCall<=0.0) {
            aNationalCalls.callPrice_current= 0.0;
        } else{
            aNationalCalls.callPrice_current= aNationalCalls.totalDuration_currentCall*AftersecondMin_rate;
        }
        totalDuration_allCalls= totalDuration_allCalls + aNationalCalls.totalDuration_currentCall;
    }


    public static void discountCalc(nationalCalls aNationalCalls) {
        if (aNationalCalls.totalDuration_currentCall>10.0 && aNationalCalls.totalDuration_currentCall<= 20.0) {
            aNationalCalls.callPrice_current= aNationalCalls.callPrice_current - (aNationalCalls.callPrice_current*tenTwentyMin_discountRate);
    
        } else if (aNationalCalls.totalDuration_currentCall >20.0) {
           
            aNationalCalls.callPrice_current=  aNationalCalls.callPrice_current - ( aNationalCalls.callPrice_current*TwentyMin_discountRate);
        } else{
            aNationalCalls.callPrice_current= aNationalCalls.callPrice_current;  
        }
        callPrice_all= callPrice_all + aNationalCalls.callPrice_current;
    }

   

    public void displayNationalcalls(nationalCalls aNationalCalls) {
        System.out.println("===========================================================");
        System.out.println("Source phone number: " + aNationalCalls.sourcePhoneNum + "\n" +
        "Destination phone number: " + aNationalCalls.DestinationPhoneNum + "\n" +
        "Ongoing call minutes: " + aNationalCalls.totalDuration_currentCall+" mins" + "\n" + 
        "Price for the call: " + ulp.format(aNationalCalls.callPrice_current) + " dollar"+ "\n" );
    }

    public static void displayForAllCalls() {
        System.out.println("===========================================================");
        System.out.println("Duration of all national calls: " + totalDuration_allCalls + " mins" + "\n" +
        "Pice o all calls: " + ulp.format(callPrice_all)+" dollars");
    }


}
