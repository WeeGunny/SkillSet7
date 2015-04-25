
import java.util.Scanner;

public class e2h {

    public static void main(String[] args) {
        String sWord;
        Scanner sin = new Scanner(System.in);
        System.out.println("enter a Word");
        sWord = sin.nextLine();
        sWord = sWord.replaceAll("[AEIOUaeiou]", "");
        System.out.println(sWord);
    }

}
