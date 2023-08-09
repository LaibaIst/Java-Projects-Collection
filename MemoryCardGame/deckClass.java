
public class deckClass {
    

    int cardNum;
    Boolean cardFaceUD;
    int i=0;
    boolean cardsMatch=false;
    String[] cardsFaceArray= new String[16];

    public deckClass(){
    }

    public deckClass(int cardNumber, Boolean cardFaceUpDown){
        this.cardFaceUD=cardFaceUpDown;
        this.cardNum=cardNumber;
       
    }

    public void display(){
        System.out.print( cardNum + "\t" );
    }

    public void initialize(deckClass[][] cards ){
        int row, column;
for (row = 0; row < cards.length; row++)
{
for (column = 0; column < cards[row].length; column++)
cards[row][column]= new deckClass();
}

    }




    public void cardReturnDisplay(int cardFaceCord1, int cardFaceCord2,int cardFaceCords1, int cardFaceCords2 ,deckClass[][] cards)
    {

        int row, column;
        
        System.out.println( "\t" +" 0" + "\t\t" + "1" + "\t\t" + "2" + "\t\t" + "3" + "\n");
        for (row = 0; row < cards.length ; row++)
        {
        for (column = 0; column < cards[row].length ; column++)

        if (cards[row][column].getCardUD() == true) {
            if(column==0){
            System.out.print(row + "\t");
            
            cards[row][column].display();
            } else{

                
    System.out.print(  "\t"  );
    cards[row][column].display();

            }
        }
        else{
            if (cards[row][column] ==  cards[cardFaceCord1][cardFaceCord2] || cards[row][column] ==  cards[cardFaceCords1][cardFaceCords2] ) {
                if(cards[row][column] ==  cards[cardFaceCord1][cardFaceCord2]){
                    if(column==0){ 
                        System.out.print(row + "\t");
                        
                    cards[cardFaceCord1][cardFaceCord2].display();
                    }
                    else{
                        System.out.print(  "\t"  );
                        cards[cardFaceCord1][cardFaceCord2].display();
                    }
                } else{
                    
                    System.out.print(  "\t"  );
                    cards[cardFaceCords1][cardFaceCords2].display();
                }
            } else{
                if (column==0) {
                    System.out.print(row + "\t" + " *" + "\t");
                } else{
                System.out.print(  "\t" +"*" + "\t" );
                }
            }
        }

        System.out.println("\n");

        matchingOfCards(cardFaceCord1, cardFaceCord2, cardFaceCords1, cardFaceCords2, cards);
    }
                               
    }

    public int getCardNumber() {
        return cardNum;
    }

    public Boolean getCardUD() {
        return cardFaceUD;
    }

    public Boolean getCardUD(deckClass[][] cards, int one, int two) {
        return cards[one][two].getCardUD();
    }

    public void reverseCardUD() {
        if (cardFaceUD==false) {
        cardFaceUD=true;   
        } else{
        cardFaceUD=false;
        }
    }

    public void matchingOfCards(int cardFaceCord1, int cardFaceCord2,int cardFaceCords1, int cardFaceCords2 ,deckClass[][] cards){

        int cardOne;
        cardOne= cards[cardFaceCord1][cardFaceCord2].getCardNumber();
        
        int cardTwo;
        cardTwo= cards[cardFaceCords1][cardFaceCords2].getCardNumber();
            

        if (cardOne == cardTwo) {
            cardsMatch=true;

            if(cards[cardFaceCord1][cardFaceCord2].getCardUD() == false)
            cards[cardFaceCord1][cardFaceCord2].reverseCardUD();
         else {
            cardsMatch=false;
        }

        if (cards[cardFaceCords1][cardFaceCords2].getCardUD() == false) {
            
            cards[cardFaceCords1][cardFaceCords2].reverseCardUD();
        }
    else {
        cardsMatch=false;
    }
}

    }




public void initialDisplay(deckClass[][] cards) {
    int row, column;
    System.out.println( "\t" +" 0" + "\t\t" + "1" + "\t\t" + "2" + "\t\t" + "3" + "\n");

    for (row = 0; row < cards.length; row++)
    {
    for (column = 0; column < cards[row].length; column++)

    if (column==0) {
        System.out.print(row + "\t" + " *" + "\t");
    } else{
    System.out.print(  "\t" +"*" + "\t" );
    }
    System.out.println("\n");
}
}


public void shuffle(deckClass[][] cards) {
    int randomOne= (int) (Math.random() * 4);
    int randomTwo= (int) (Math.random() * 4);    
    int randomThree= (int) (Math.random() * 4);
    int randomFour= (int) (Math.random() * 4);


    if ((cards[randomOne][randomThree] != cards[randomTwo][randomFour])    ) {
    int cardshuffled2= cards[randomOne][randomThree].getCardNumber();
    int cardshuffled1= cards[randomTwo][randomFour].getCardNumber();
    cards[randomOne][randomThree].cardNum= cardshuffled1 ;
    cards[randomTwo][randomFour].cardNum= cardshuffled2;
    } else{

        boolean cardsNoMatch=false;
        while (cardsNoMatch==false) {
            
        randomOne = (int) (Math.random() * 4);
        randomTwo=  (int) (Math.random() * 4);
 
        if (cards[randomOne][randomThree] != cards[randomTwo][randomFour]) {
            int cardshuffled2= cards[randomOne][randomThree].getCardNumber();
            int cardshuffled1= cards[randomTwo][randomFour].getCardNumber();
            cards[randomOne][randomThree].cardNum= cardshuffled1 ;
            cards[randomTwo][randomFour].cardNum= cardshuffled2;
            cardsNoMatch=true;
        }

        }
    }
    // if ( (cards[randomTwo][randomFour] != cards[randomThree][randomOne]) && (randomTwo != randomThree || randomFour != randomOne)) {
    // cards[randomTwo][randomFour]=cards[randomThree][randomOne];
    // } else{

    //     boolean cardsNoMatch=false;
    //     while (cardsNoMatch==false) {
            
    //     randomOne = (int) (Math.random() * 4);
    //     randomFour=  (int) (Math.random() * 4);
 
    //     if (cards[randomTwo][randomFour] != cards[randomThree][randomOne]) {
    //         cards[randomTwo][randomFour] = cards[randomThree][randomOne];
    //                   cardsNoMatch=true;
    //     }

         }
    
    


    





public void afterMatchDisplay(deckClass[][] cards){

    if (cardsMatch==false) {
 System.out.println("\n" + "\n" +"\n" +"\n" +"\n" +"\n" +"\n" );
 

 
    } else{
}


    }
}











