
import java.util.Scanner;

//Luke Simpson
public class e1a {

   
    public static void main(String[] args) {
       String sLetter;
        Scanner sin = new Scanner(System.in);
       System.out.println("enter a letter");
       sLetter = sin.nextLine();
       if(sLetter==sLetter.toUpperCase()){
          System.out.println("That is an Upper case letter"); 
       }
       else {
            System.out.println("That is an Lower case letter");
       }
       
    }
}
