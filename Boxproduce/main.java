import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class main {
 
    public static void main(String[] args) {
        String choiceOneM="";
        String choiceTwoM="";
        String choiceThreeM="";
        
    
        Scanner scan= new Scanner(System.in);
        
        
        Scanner fileIn= null;
        try {
            fileIn= new Scanner(new FileInputStream("contents.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not Found");
            //TODO: handle exception
        }

        String one= fileIn.next().toLowerCase();
        fileIn.nextLine();
        String two= fileIn.next().toLowerCase();
        fileIn.nextLine();
        String three= fileIn.next().toLowerCase();
        fileIn.nextLine();
        String four= fileIn.next().toLowerCase();
        fileIn.nextLine();
        String five= fileIn.next().toLowerCase();



        System.out.println("The available vegs/fruits are: " +"\n" + one + "\n" + two + 
        "\n" + three + "\n" + four + "\n"+ five);

        System.out.println("==================================================================================");
        boxProduce box= new boxProduce();
        int boxRandom= (int) (Math.random()*4 ) +1;
        for (int i = 0; i < boxRandom; i++) {
            int randomNum= (int) (Math.random() *4) + 1;
            if (randomNum==1) {
                choiceOneM=one;
            } else if(randomNum==2){
                choiceOneM=two;
            } else if(randomNum==3){
                choiceOneM=three;
            } else if(randomNum==4){
                choiceOneM=four;
            } else if(randomNum==5){
                choiceOneM=five;
            }

            randomNum= (int) (Math.random() *4) + 1;
            if (randomNum==1) {
                choiceTwoM=one;
            } else if(randomNum==2){
                choiceTwoM=two;
            } else if(randomNum==3){
                choiceTwoM=three;
            } else if(randomNum==4){
                choiceTwoM=four;
            } else if(randomNum==5){
                choiceTwoM=five;
            }

            randomNum= (int) (Math.random() *4) + 1;
            if (randomNum==1) {
                choiceThreeM=one;
            } else if(randomNum==2){
                choiceThreeM=two;
            } else if(randomNum==3){
                choiceThreeM=three;
            } else if(randomNum==4){
                choiceThreeM=four;
            } else if(randomNum==5){
                choiceThreeM=five;
            }

            System.out.println("The contents of the box are: " + "\n" + choiceOneM +
        "\n" + choiceTwoM + "\n" + choiceThreeM);


        
        box.setChoiceOne(choiceOneM);
        boxProduce.salsaexits();
        box.setChoiceTwo(choiceTwoM);
        boxProduce.salsaexits();
        box.setChoiceThree(choiceThreeM);
        boxProduce.salsaexits();
        
        

        }

        
        System.out.println("==================================================================================");

        System.out.println("Enter the first veg or fruit you want: ");
        String subWordOneM= scan.next().toLowerCase();

        System.out.println("Enter the second veg or fruit you want: ");
        String subWordTwoM= scan.next().toLowerCase();

        System.out.println("Enter the third veg or fruit you want: ");
        String subWordThreeM= scan.next().toLowerCase();

        
        System.out.println("==================================================================================");


        box.setSubOne(subWordOneM);
        box.setSubTwo(subWordTwoM);
        box.setSubThree(subWordThreeM);
        box.subTheValues();
        box.toString();

        System.out.println("==================================================================================");

       

        
           scan.close();
        
    }
    
}
