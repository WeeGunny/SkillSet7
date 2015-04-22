
import java.util.Scanner;

//LukeSImpson
public class e2d {

    public static void main(String[] args) {
        String sName;
        Scanner sin = new Scanner(System.in);
        System.out.println("enter your name");
        sName = sin.nextLine();
        for (int i = sName.length()-1; i >= 0; i--) {
           System.out.print(sName.charAt(i)); 
        }
        System.out.println();
    }

}
