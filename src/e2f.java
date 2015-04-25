
import java.util.*;

//Luke Simpson
public class e2f {

    public static void main(String[] args) {
        String sWord;
        Character cLetter;
        Scanner sin = new Scanner(System.in);
        System.out.println("enter a word");
        sWord = sin.nextLine();

        for (int i = 0; i < sWord.length(); i++) {
            cLetter = sWord.charAt(i);
            if (cLetter == 'e' || cLetter == 'E' || cLetter == 'a' || cLetter == 'A' || cLetter == 'i' || cLetter == 'I' || cLetter == 'o' || cLetter == 'O' || cLetter == 'u' || cLetter == 'U')
            {
                System.out.println(cLetter + " is the first vowel and it occurs at " + (i + 1));
                break;
            }
        }
        

    }
}
