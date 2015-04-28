
import java.util.Scanner;

//Luke Simpson
public class e2i {

    public static void main(String[] args) {
        String sSentence;
        Character cLetter, cMove;
        int nKey, nMove;
        Scanner sin = new Scanner(System.in);
        System.out.println("enter a Sentence");
        sSentence = sin.nextLine();
        System.out.println("enter a Number for the encoding key");
        nKey = sin.nextInt();
        
        for (int i = 0; i < sSentence.length(); i++) {
            cLetter = sSentence.charAt(i);
            if (cLetter == ' ') {
                System.out.print(" ");
            } else {
                nMove = (int) cLetter + nKey;
                if(nMove>26){
                    nMove-=26;
                }
                cMove = (char) nMove;
                System.out.print(cMove);
            }
        }
        System.out.println();
    }
}
