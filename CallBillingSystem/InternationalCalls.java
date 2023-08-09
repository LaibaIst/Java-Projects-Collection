import java.text.DecimalFormat;


public class InternationalCalls {
    
   static DecimalFormat ulp= new DecimalFormat("00.00");



    String sourcePhoneNum;
    String DestinationPhoneNum;
    Double totalDuration_currentCall;
    static Double totalDuration_allCalls=0.0;
    Double callPrice_current=1.0;
    static Double callPrice_all=0.0;
    Integer sourceCountryCode;
    Integer destinationCountryCode;
    static double firstMin_rate= 0.60;
    static double firstsecondMin_rate= 0.40;
    static double AftersecondMin_rate= 0.20;
    static double tenTwentyMin_discountRate= 0.08;
    static double TwentyMin_discountRate= 0.10;
    



    public InternationalCalls(String sourcePhoneNum,String DestinationPhoneNum,Double totalDuration_currentCall,Integer sourceCountryCode,
    Integer destinationCountryCode) {
        
      this.sourcePhoneNum=sourcePhoneNum;
      this.DestinationPhoneNum=DestinationPhoneNum;
      this.totalDuration_currentCall=totalDuration_currentCall;
      this.sourceCountryCode=sourceCountryCode;
      this.destinationCountryCode=destinationCountryCode;

    }


    
    public InternationalCalls(InternationalCalls aInternationalCalls) {
      sourceCountryCode= aInternationalCalls.sourceCountryCode;
      destinationCountryCode=aInternationalCalls.destinationCountryCode;
      sourcePhoneNum=aInternationalCalls.sourcePhoneNum;
      DestinationPhoneNum= aInternationalCalls.DestinationPhoneNum;
      totalDuration_currentCall= aInternationalCalls.totalDuration_currentCall;

  }


  public static void priceForinterNationalCalls(InternationalCalls aInternationalCalls) {
      if (aInternationalCalls.totalDuration_currentCall<=1.0) {
          aInternationalCalls.callPrice_current= aInternationalCalls.totalDuration_currentCall * firstMin_rate;
      } else if (aInternationalCalls.totalDuration_currentCall>1.0 && aInternationalCalls.totalDuration_currentCall<= 2.0) {
          aInternationalCalls.callPrice_current= aInternationalCalls.totalDuration_currentCall * firstsecondMin_rate;
      } else if (aInternationalCalls.totalDuration_currentCall<=0.0) {
          aInternationalCalls.callPrice_current= 0.0;
      } else{
          aInternationalCalls.callPrice_current= aInternationalCalls.totalDuration_currentCall * AftersecondMin_rate;
      }
      totalDuration_allCalls= totalDuration_allCalls + aInternationalCalls.totalDuration_currentCall;
  }


  public static void discountCalc(InternationalCalls aInternationalCalls) {
      if (aInternationalCalls.totalDuration_currentCall>10.0 && aInternationalCalls.totalDuration_currentCall<= 20.0) {
          aInternationalCalls.callPrice_current= aInternationalCalls.callPrice_current - (aInternationalCalls.callPrice_current*tenTwentyMin_discountRate);
  
      } else if (aInternationalCalls.totalDuration_currentCall >20.0) {
         
          aInternationalCalls.callPrice_current=  aInternationalCalls.callPrice_current - ( aInternationalCalls.callPrice_current*TwentyMin_discountRate);
      } else{
          aInternationalCalls.callPrice_current= aInternationalCalls.callPrice_current;  
      }
      callPrice_all= callPrice_all + aInternationalCalls.callPrice_current;
  }

 

  public void displayInterNationalcalls(InternationalCalls aInternationalCalls) {
      System.out.println("Source phone number: " + aInternationalCalls.sourceCountryCode + aInternationalCalls.sourcePhoneNum + "\n" +
      "Destination phone number: " + aInternationalCalls.destinationCountryCode + aInternationalCalls.DestinationPhoneNum + "\n" +
      "Ongoing call minutes: " + aInternationalCalls.totalDuration_currentCall +" mins" + "\n" + 
      "Price for the call: " + ulp.format(aInternationalCalls.callPrice_current) + " dollar"+ "\n" );
  }

  public static void displayForAllCalls() {
      System.out.println("Duration of all Inenational calls: " + totalDuration_allCalls + " mins" + "\n" +
      "Price of all calls: " + ulp.format(callPrice_all)+" dollars");
  }

}
