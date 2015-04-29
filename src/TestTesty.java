/*
 * Luke Simpson
 create a program that tells the user if they are
 * following the rule I before E except after C.
 */

import java.util.*;

public class TestTesty {

    public static void main(String[] args) {
        String sWord;
        int Length;
        Character cLetter, cLetter2, cLetter3;
        Scanner sin = new Scanner(System.in);
        System.out.println("enter a Word");
        sWord = sin.nextLine();
        Length = sWord.length() - 1;
        for (int i = 0; i < Length; i++) {
            cLetter = sWord.charAt(i);
            cLetter2 = sWord.charAt(i + 1);
            if (i >= 1) {
                cLetter3 = sWord.charAt(i - 1);
                if (cLetter == 'i' && cLetter2 == 'e') {
                    System.out.println("Congrats your word is correct 1");
                } else if (cLetter == 'e' && cLetter2 == 'i' && cLetter3 != 'c') {
                    System.out.print("your word is NOT correct");
                } else if (cLetter == 'e' && cLetter2 == 'i' && cLetter3 == 'c') {
                    System.out.println("Congrats your word is correct2");
                } else {
                    System.out.println("Congrats your word is correct3");

                }
            }
        }
    }
}
