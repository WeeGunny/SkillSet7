
import java.util.*;


public class e2j {

   public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String sInput;
        String arsHappy[] = new String[]{"great", "good", "happy", "joyful", "amazing", "delightful", "cheerful", "estatic", "gleeful", "chipper", "wonderful", "blissful", "fantastic"};
        System.out.println("How are you feeling?");
        sInput = sin.next();
        while (sInput.equals("bye") == false) {
            if (isHappy(arsHappy, sInput) == true) {
                System.out.println("It's great that you're feeling good!");
            } else if (isHappy(arsHappy, sInput) == false) {
                System.out.println("Aww...");
            }
            System.out.println("How are you feeling now?");
            sInput = sin.next();
        }
    }

    public static boolean isHappy(String arsHappy[], String sInput) {
        int i;
        for (i = 0; i < arsHappy.length; i++) {
            if (sInput.equalsIgnoreCase(arsHappy[i])) {
                return true;
            }
        }
        return false;
    }
}
