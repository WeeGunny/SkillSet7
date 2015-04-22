
import java.util.Scanner;

//Luke Simpson
public class e2c {

    
    public static void main(String[] args) {
        String sWord;
        Character cLetter;
        Scanner sin = new Scanner(System.in);
        System.out.println("enter a word");
        sWord = sin.nextLine();
        int e=0;
        for (int i = 0; i < sWord.length(); i++) {
            cLetter = sWord.charAt(i);
            if (cLetter =='e'||cLetter=='E') {
                System.out.println("a letter e is at "+(i+1));
                e++;
            }
        }
        System.out.println("there is "+e+" Letter e's");
    }
    
}
