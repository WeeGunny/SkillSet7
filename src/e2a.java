
import java.util.Scanner;

public class e2a {

    public static void main(String[] args) {
        String sName;
        Character cFirst, cLetter;
        Scanner sin = new Scanner(System.in);
        System.out.println("enter your name");
        sName = sin.nextLine();
        cFirst = sName.charAt(0);
        if (Character.isLowerCase(cFirst)) {
            System.out.println("The First letter need to be uppercase");
        }
        for (int i = 0; i < sName.length(); i++) {
            cLetter = sName.charAt(i);
            if (Character.isDigit(cLetter) == true) {
                System.out.println("You Must not tell lies");
            }
        }
    }
}
