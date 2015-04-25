//Luke Simpson
import java.util.*;
public class e2g {

    public static void main(String[] args) {
       String sNumbers;
       Character cNum;
       int nSum=0;
        Scanner sin = new Scanner(System.in);
       System.out.println("enter a Number");
        sNumbers = sin.nextLine();
        
        for (int i = 0; i < sNumbers.length(); i++) {
            cNum = sNumbers.charAt(i);
            nSum+=cNum;
        }
       if (nSum%3==0){
           System.out.println("This number is divisible by 3.");
       }
       else{
          System.out.println("This number is NOT divisible by 3"); 
       }
    }
    
}
