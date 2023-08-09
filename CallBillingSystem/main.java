public class main {
    

    public static void main(String[] args) {
        

        nationalCalls nationalCalls1= new nationalCalls(new nationalCalls("03150059716","03495106394", 10.0));
        nationalCalls nationalCalls2= new nationalCalls(new nationalCalls("03120097133", "03877668900", 13.0));

        InternationalCalls internationalCalls1= new InternationalCalls(new InternationalCalls("03150059716", "03778298898", 80.0, 92, 988));
        InternationalCalls internationalCalls2= new InternationalCalls(new InternationalCalls("03150059767", "03277798898", 90.0, 91, 92));

        nationalCalls.priceForNationalCalls(nationalCalls1);
        nationalCalls.priceForNationalCalls(nationalCalls2);
        nationalCalls.discountCalc(nationalCalls1);
        nationalCalls.discountCalc(nationalCalls2);
        nationalCalls1.displayNationalcalls(nationalCalls1);
        nationalCalls2.displayNationalcalls(nationalCalls2);
        nationalCalls.displayForAllCalls();

        System.out.println("==============================================");
        InternationalCalls.priceForinterNationalCalls(internationalCalls1);
        InternationalCalls.priceForinterNationalCalls(internationalCalls2);
        InternationalCalls.discountCalc(internationalCalls1);
        InternationalCalls.discountCalc(internationalCalls2);
        internationalCalls1.displayInterNationalcalls(internationalCalls1);
        internationalCalls2.displayInterNationalcalls(internationalCalls2);
        InternationalCalls.displayForAllCalls();
    }
}
