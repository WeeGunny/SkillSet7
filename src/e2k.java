//Luke Simpson
import java.util.*;
public class e2k {

    public static void main(String[] args) {
      Scanner sin = new Scanner(System.in);
      Character cLetter=0;
        System.out.println("enter a Sentence");
        String sSentence = sin.nextLine();
        String sUpper = sSentence.toUpperCase();
        String[] words = sUpper.split(" "); 
        for(int i=0;i<words.length;i++){
                cLetter=words[i].charAt(0);
            System.out.print(words[i].substring(1)+cLetter+"AY ");
        }
    }
    
}
