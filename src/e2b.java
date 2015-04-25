//Luke Simpson

import java.util.*;

public class e2b {

    public static void main(String[] args) {
        String sName, sFirst, sLast;
        Character cFirst, cFirst2, cLetter;
        boolean bFirst, bLast;
        Scanner sin = new Scanner(System.in);
        System.out.println("enter your name");
        sName = sin.nextLine();
        String[] split = sName.split(" ");
        sFirst = split[0];
        sLast = split[1];
        cFirst = sFirst.charAt(0);
        cFirst2 = sLast.charAt(0);

        if (Character.isLowerCase(cFirst) || Character.isLowerCase(cFirst2)) {
            System.out.println("The First letter need to be uppercase");
        }
        for (int i = 0; i < sFirst.length(); i++) {
            cLetter = sFirst.charAt(i);
            if (Character.isDigit(cLetter) == true) {
                System.out.println("No numbers in your name please");
                break;
            }
        }
        for (int i = 0; i < sLast.length(); i++) {
            cLetter = sLast.charAt(i);
            if (Character.isDigit(cLetter) == true) {
                System.out.println("No numbers in your name please");
                break;
            }
        }
    }
}