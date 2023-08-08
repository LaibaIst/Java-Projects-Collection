import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        airplaneSeating seatingArr[][]= new airplaneSeating[7][5];

        seatingArr[0][0]= new airplaneSeating(1);
        seatingArr[1][0]= new airplaneSeating(2);
        seatingArr[2][0]= new airplaneSeating(3);
        seatingArr[3][0]= new airplaneSeating(4);
        seatingArr[4][0]= new airplaneSeating(5);
        seatingArr[5][0]= new airplaneSeating(6);
        seatingArr[6][0]= new airplaneSeating(7);

        seatingArr[0][1]= new airplaneSeating("A", 1, false);
        seatingArr[0][2]= new airplaneSeating("B", 1, false);
        seatingArr[0][3]= new airplaneSeating("C", 1, false);
        seatingArr[0][4]= new airplaneSeating("D", 1, false);
        
        seatingArr[1][1]= new airplaneSeating("A", 2, false);
        seatingArr[1][2]= new airplaneSeating("B", 2, false);
        seatingArr[1][3]= new airplaneSeating("C", 2, false);
        seatingArr[1][4]= new airplaneSeating("D", 2, false);
        
        seatingArr[2][1]= new airplaneSeating("A", 3, false);
        seatingArr[2][2]= new airplaneSeating("B", 3, false);
        seatingArr[2][3]= new airplaneSeating("C", 3, false);
        seatingArr[2][4]= new airplaneSeating("D", 3, false);
        
        seatingArr[3][1]= new airplaneSeating("A", 4, false);
        seatingArr[3][2]= new airplaneSeating("B", 4, false);
        seatingArr[3][3]= new airplaneSeating("C", 4, false);
        seatingArr[3][4]= new airplaneSeating("D", 4, false);
        
        seatingArr[4][1]= new airplaneSeating("A", 5, false);
        seatingArr[4][2]= new airplaneSeating("B", 5, false);
        seatingArr[4][3]= new airplaneSeating("C", 5, false);
        seatingArr[4][4]= new airplaneSeating("D", 5, false);
        
        seatingArr[5][1]= new airplaneSeating("A", 6, false);
        seatingArr[5][2]= new airplaneSeating("B", 6, false);
        seatingArr[5][3]= new airplaneSeating("C", 6, false);
        seatingArr[5][4]= new airplaneSeating("D", 6, false);
        
        seatingArr[6][1]= new airplaneSeating("A", 7, false);
        seatingArr[6][2]= new airplaneSeating("B", 7, false);
        seatingArr[6][3]= new airplaneSeating("C", 7, false);
        seatingArr[6][4]= new airplaneSeating("D", 7, false);
        
        airplaneSeating seatingAssignment= new airplaneSeating();

        // USER INPUT FOR ASSIGNMENT OF SEAT
        
        
         boolean allSeatsBooked= false;
        while (!allSeatsBooked) {
            seatingAssignment.DisplayOfSeats(seatingArr);
            System.out.println("\n" + "\n");


            System.out.println("Please input the seat you want, first input the digit of the seat then the letter: ");
            System.out.print("Digit(1-7): ");
            int digitOfSeat= scan.nextInt();
    
            System.out.print("Letter(a-d): ");
            String letterOfSeat= scan.next();



            seatingAssignment.assignTheSeat(seatingArr, digitOfSeat, letterOfSeat);
            allSeatsBooked= seatingAssignment.allseatsAreBooked();
        }


        seatingAssignment.DisplayOfSeats(seatingArr);
            System.out.println("\n" + "\n");

        System.out.println("All seats are booked.");
        scan.close();
        
    }
    
}


class airplaneSeating {

    private String letterOfSeat;
    private int numOfSeat;
    private boolean taken=false;
    private int add=0;

    public airplaneSeating() {
    }

    public airplaneSeating(int numOfSeat) {
        this.numOfSeat= numOfSeat;
    }

    public airplaneSeating(String letterOfSeat, int numOfSeat, boolean taken) {
        this.letterOfSeat= letterOfSeat;
        this.numOfSeat= numOfSeat;
        this.taken= taken;
    }


    public String getLetter() {
        return letterOfSeat;
    }

    public void printLetter() {
        System.out.print(letterOfSeat + "\t");

    }

    public int getDigit() {
        return numOfSeat;
    }
    public void printDigit() {
        System.out.print(numOfSeat + "\t");

    }

    public boolean getState() {
        return !taken;
    }

    public void setState() {
        if (!taken) {
            taken=true;
        }
    }

    public void setLetter() {
        letterOfSeat="X";
    }


    public boolean allseatsAreBooked() {
        return add == 28;
    }



    public void assignTheSeat(airplaneSeating[][] seat, int userDigitInput, String userLetterInput) {

        int row, column;
        for (row = 0; row < seat.length; row++) {
            for (column = 0; column < seat[row].length; column++) {


                if (column !=0) {
                    if (seat[row][column].getState()){
                        if ((seat[row][column].getLetter().equalsIgnoreCase(userLetterInput)) && (seat[row][column].getDigit() == userDigitInput)) {
                            if (seat[row][column].getState()) {
                                seat[row][column].setState();
                                seat[row][column].setLetter();
                                ++add;
                            }
                        }
                    } else{
                        System.out.println("Error, seat already booked. Please choose another");
                    }
                }
            }
        }
    }

    public void DisplayOfSeats(airplaneSeating[][] seat) {

        int row, column;
        for (row = 0; row < seat.length; row++) {
            for (column = 0; column < seat[row].length; column++) {
                if (column==0) {

                    System.out.println();
                    seat[row][column].printDigit();

                }
                else{

                    seat[row][column].printLetter();

                }
            }
        }
    }
}

