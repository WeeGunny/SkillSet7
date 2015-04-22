
import java.util.Scanner;

//Luke Simpson
public class e2e {

    
    public static void main(String[] args) {
        String sSentence;
        Character cLetter;
        Scanner sin = new Scanner(System.in);
        System.out.println("enter a Sentence");
        sSentence = sin.nextLine();
        int nSpace=1;
        for (int i = 0; i < sSentence.length(); i++) {
            cLetter = sSentence.charAt(i);
            if(cLetter==' '){
                nSpace++;
            }
        }
        System.out.println("there are "+nSpace+" words");
    }
    
}
