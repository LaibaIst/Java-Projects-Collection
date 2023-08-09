public class boxProduce {
    
    private String choiceOne;
    private String choiceTwo;
    private String choiceThree;
    private String subwordOne;
    private String subwordTwo;
    private String subwordThree;
    static int salsaflier= 5;
     static boolean hasSalsa;


    public boxProduce(){
       
    }

    public boxProduce( boxProduce aBoxProduce){
 
    }

    public void setChoiceOne(String choiceOne) {
        this.choiceOne= choiceOne;
        if (choiceOne.equalsIgnoreCase("kiwi")) {
            hasSalsa=true;
        } else{
            hasSalsa=false;
        }
    }

    public void setChoiceTwo(String choiceTwo) {
        this.choiceTwo= choiceTwo;
        if (choiceTwo.equalsIgnoreCase("kiwi") && hasSalsa==false) {
            hasSalsa=true;
        } else{
            hasSalsa=false;
        }
    }

    public void setChoiceThree(String choiceThree) {
        this.choiceThree=choiceThree;
        if (choiceThree.equalsIgnoreCase("kiwi") && hasSalsa==false) {
            hasSalsa=true;
        } else{
            hasSalsa=false;
        }
    }

    public void setSubOne(String subwordOne) {
        this.subwordOne= subwordOne;
    }

    public void setSubTwo(String subwordTwo) {
        this.subwordTwo= subwordTwo;
    }

    public void setSubThree(String subwordThree) {
        this.subwordThree= subwordThree;
    }
    public String getChoiceOne() {
      return choiceOne;
    }

    public String getChoiceTwo() {
        return choiceTwo;
    }

    public String getChoiceThree() {
        return choiceThree;
    }


    public void subTheValues() {

        if (this.choiceOne.equals(this.subwordOne)) {
        }else{
            choiceOne= subwordOne.substring(0, subwordOne.length());
        }

        if (this.choiceTwo.equals(this.subwordTwo)) {
        }else{
            choiceTwo= subwordTwo.substring(0, subwordTwo.length());
        }

        if (this.choiceThree.equals(this.subwordThree)) {
        }else{
            choiceThree= subwordThree.substring(0, subwordThree.length());
        }
        
    }

    public static boolean salsaexits(){
        if (hasSalsa==true && salsaflier>0) {
            System.out.println("******salsa verde reciper flier******");
            --salsaflier;
            return true;
        } else{
            return false;
        }
    }

    public String toString(){
        System.out.println("The updated contents of the box are: " + "\n" +choiceOne + "\n" + choiceTwo + "\n" + choiceThree);
          return "";
    }


}
