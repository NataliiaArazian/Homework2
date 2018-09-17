import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your word, please: ");
        String myLine = in.nextLine();

        String result = changeS(myLine);
        if (result.equals(myLine) ){
            System.out.println("It's palindrome");
        } else {
            System.out.println("It's not palindrome");
        }
    }

    private static String changeS(String s) {
        return new StringBuffer(s).reverse().toString();
    }
}
