
import java.util.Scanner;

//Luke SImpson
public class e1b {

    
    public static void main(String[] args) {
       String sLetter;
       Character cLetter;
        Scanner sin = new Scanner(System.in);
       System.out.println("enter a letter or a number");
       sLetter = sin.nextLine();
       cLetter = sLetter.charAt(0);
       if(Character.isLetter(cLetter)){
          System.out.println("That is a letter"); 
       }
       else {
            System.out.println("That is a Number");
       }
    }
}
