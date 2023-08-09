package projectThree;
import java.util.Scanner;
import java.text.DecimalFormat;

public class main {
    public static void main(String[] args) {
        double quizOne=0;
        double quizTwo=0;
        double quizThree=0;
        double midTerm=0;
        double terminal=0;
       

        Scanner scan= new Scanner(System.in);

        System.out.println("Please enter your marks: ");
        System.out.println("For quiz one: "); quizOne= scan.nextDouble();
        System.out.println("For quiz two: ");  quizTwo= scan.nextDouble();
        System.out.println("For quiz three: "); quizThree= scan.nextDouble();
        System.out.println("For mid-term: "); midTerm= scan.nextDouble();
        System.out.println("For terminal: "); terminal= scan.nextDouble();

        grades studentGrade= new grades(quizOne, quizTwo, quizThree, midTerm, terminal);
        studentGrade.setQuizzes(quizOne, quizTwo, quizThree);
         studentGrade.setMids(midTerm);
         studentGrade.setTerminal(terminal);
         studentGrade.setQuizzesValues(); 
         studentGrade.setMids();
         studentGrade.setTerminal();
         studentGrade.setSum();
         studentGrade.getTheGrade();
         //studentGrade.checkMethod();
         

        scan.close();


    }
    
}

 class grades {

    private double quiz01;
    private double quiz02;
    private double quiz03;
    private double quiz01s;
    private double quiz02s;
    private double quiz03s;
    private double midS;
    private double termS;
    private double mid;
    private double term;
    private double sum;
    private double percentage;
    private String percent;

    DecimalFormat formatIt= new DecimalFormat("00.00%");


    public grades(Double quiz01, Double quiz02, Double quiz03, Double mid, Double term) {
        setQuizzes(quiz01, quiz02, quiz03);
        setMids(mid);
        setTerminal(term);
    }

    public void setQuizzes(Double quizOne, Double quizTwo, Double quizThree) {
        this.quiz01=quizOne;
        this.quiz02=quizTwo;
        this.quiz03= quizThree;
    }

    public void setMids(Double midTerm) {
        this.mid= midTerm;
    }
    public void setTerminal(Double terminal){
        this.term= terminal;
    }
    public void setQuizzesValues() {
       this.quiz01s= quiz01/50;
       this.quiz02s= quiz02/50;
        this.quiz03s= quiz03/50;
        System.out.println("Percent of Quiz one: " + formatIt.format(quiz01s) + "\n" +
        "Percent of Quiz two: " + formatIt.format(quiz02/50) + "\n" +
        "Percent of Quiz Three: " + formatIt.format(quiz03s)
        );
    }

    public void checkMethod() {
        System.out.println(mid);
        System.out.println(term);
        System.out.println(midS + termS);
        System.out.println( sum);
        System.out.println(percentage);
        System.out.println(percent);
        System.out.println(quiz01s);
        System.out.println(quiz02s);
        System.out.println(quiz03s);
        
    }

    public void setMids() {
       this.midS=mid/100;
        System.out.println("Percent of mid-term: " + formatIt.format(midS));
    }
    public void setTerminal() {
        this.termS= term/100;
       System.out.println("Percent of Quiz one: " + formatIt.format(termS) + "\n");
    }
    
    public void setSum() {
        this.sum= quiz01+quiz02+quiz03+mid+term;
        this.percentage= (sum/350) * 100;
        // this.percent= formatIt.format(percentage);
        

        
    }

    public void getTheGrade(){
        if (percentage<=50) {
            System.out.println("Grade F" );        
        } else if(percentage>=50 || percentage <=60){
            System.out.println("Grade C");
        } else if(percentage>=61 || percentage<=75){
            System.out.println("Grade B");
        } else if(percentage>=76 || percentage<=100){
            System.out.println("Grade A");
        } else {
            System.out.println("There has been some error in the input.");
        }
    }

}
