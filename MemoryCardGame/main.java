import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        deckClass[][] cards= new deckClass[4][4];
        int rowcol[][]=new int [5][5] ;
        rowcol[0][0]= 0;
        rowcol[0][1]= 0;
        rowcol[0][2]= 1;
        rowcol[0][3]= 2;
        rowcol[0][4]=3;
        rowcol[2][0]= 1;
        rowcol[4][0]= 3;
 


 
        int allCardsGuessed=0;

        Scanner scan= new Scanner(System.in);
        deckClass classOfDeck= new deckClass();

        classOfDeck.initialize(cards);
        cards[0][0]= new deckClass(0,false);
        cards[0][1]= new deckClass(1, false);
        cards[0][2]= new deckClass(2, false);
        cards[0][3]= new deckClass(3, false);
        cards[1][0]= new deckClass(4, false);
        cards[1][1]= new deckClass(5, false);
        cards[1][2]= new deckClass(6, false);
        cards[1][3]= new deckClass(7, false);
        cards[2][0]= new deckClass(0, false);
        cards[2][1]= new deckClass(1, false);
        cards[2][2]= new deckClass(2, false);
        cards[2][3]= new deckClass(3, false);
        cards[3][0]= new deckClass(4, false);
        cards[3][1]= new deckClass(5, false);
        cards[3][2]= new deckClass(6, false);
        cards[3][3]= new deckClass(7, false);
        
        classOfDeck.shuffle(cards);

        System.out.println("DECK OF CARDS GAME" + "\n" + "A MEMORY GAME" + "\n");
        System.out.println("Turn two cards according to the co-ordinates on sides,all cards turned must be same to win, if guessed incorrectly," + "\n" + " cards will turn back. You have all the time in the world, and infinite tries to guess them all!");


        System.out.println("\n");

        classOfDeck.initialDisplay(cards);

        System.out.println("==============================================");
        System.out.println("\n");



        while (allCardsGuessed!=16) {
            

            
        
        int row, column;
                
        
        for (row = 0; row < cards.length ; row++)
        {
        for (column = 0; column < cards[row].length ; column++)

        if (cards[row][column].getCardUD() == true) {
            allCardsGuessed++;
        }
    }
            
        System.out.println("==============================================");
        System.out.println("\n");

            System.out.println("Please Enter the Co-Ordinates of 1st card which you want to roll-over and press enter: " + "\n");
            System.out.println("Enter co-ordinate 1: " + "\n");
            int card1_1= scan.nextInt();
            System.out.println("Enter co-ordinate 2: " + "\n");
            int card1_2= scan.nextInt();

            if (classOfDeck.getCardUD(cards, card1_1, card1_2)==true) {
                boolean wrongInput=true;

                while (wrongInput==true) {
                    System.out.println("Co-ordinates can not be those of previously correctly chosen cards! Please re-enter" + "\n");

                     card1_1= scan.nextInt();
                     card1_2= scan.nextInt();
                     if (classOfDeck.getCardUD(cards, card1_1, card1_2)==true){
                        wrongInput=true;
                     } else{
                        wrongInput=false;
                     }
                }
                
            }

            
        System.out.println("==============================================");
        System.out.println("\n");
    
            System.out.println("Please Enter the Co-Ordinates of 2nd card which you want to roll-over and press enter: " + "\n");
            System.out.println("Enter co-ordinate 1: " + "\n");
            int card2_1= scan.nextInt();
            System.out.println("Enter co-ordinate 2: " + "\n");
            int card2_2= scan.nextInt();
    
            
            if (classOfDeck.getCardUD(cards, card2_1, card2_2)==true) {
                boolean wrongInput2=true;

                while (wrongInput2==true) {
                    System.out.println("Co-ordinates can not be those of previously correctly chosen cards! Please re-enter" + "\n");

                     card2_1= scan.nextInt();
                     card2_2= scan.nextInt();
                     if (classOfDeck.getCardUD(cards, card1_1, card1_2)==true){
                        wrongInput2=true;
                     } else{
                        wrongInput2=false;
                     }
                }
                
            }
    
            System.out.println("==============================================");
            System.out.println("\n");
    
            classOfDeck.cardReturnDisplay(card1_1, card1_2,card2_1,card2_2 ,cards);
    
            
    
            
        }
        


        System.out.println("ALL CARDS GUESSED CORRECTLY! YOU WIN!");

        scan.close();
    

        }
    }


