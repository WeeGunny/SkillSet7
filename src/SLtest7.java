//Luke Simpson
import java.util.Scanner;

public class SLtest7 {

    public static void main(String[] args) {
        int nGood = 0, nBad = 0,nTotal=0;
        boolean bIsGood;
        Scanner sin = new Scanner(System.in);
        System.out.println("enter a Sentence");
        String sSentence = sin.nextLine();
        String sUpper = sSentence.toUpperCase();
        String[] arsWords = sUpper.split(" ");
        for (int i = 0; i < arsWords.length; i++) {
            String sWord = arsWords[i]; 
            bIsGood = IsGood(sWord);
            if (bIsGood == true) {
                nGood++;
            } else if (bIsGood == false) {
                nBad++;
            }
            nTotal++;
        }
        System.out.println(nTotal+" Total Words");
        System.out.println(nGood+" Good Words");
        System.out.println(nBad+" Bad Words");
    }

    public static boolean IsGood(String sWord) {
        Character cLetter;
        for (int i = 0; i < sWord.length(); i++) {
            cLetter = sWord.charAt(i);
            if (cLetter == 'e' || cLetter == 'E' || cLetter == 'a' || cLetter == 'A' || cLetter == 'i' || cLetter == 'I' || cLetter == 'o' || cLetter == 'O' || cLetter == 'u' || cLetter == 'U') {
                return true;
            }
        }
        return false;
    }
}
