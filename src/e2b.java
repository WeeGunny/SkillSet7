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
        bFirst=Conditions(sFirst,cFirst);
         bLast=Conditions(sLast,cFirst2);
        if (bFirst==true&&bLast==true){
            System.out.println("Congratulations you can enter your name right:)");
        }
    }
    
    public static boolean Conditions(String sName, int cFirst) {
        Character cLetter;
        if (Character.isLowerCase(cFirst)) {
            System.out.println("The First letter need to be uppercase");
            return false;
        }
        for (int i = 0; i < sName.length(); i++) {
            cLetter = sName.charAt(i);
            if (Character.isDigit(cLetter) == true) {
                System.out.println("No numbers in your name please");
                return false;
            }
        }
        return true;
    }
}