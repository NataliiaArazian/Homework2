import java.util.Scanner;
import java.util.Arrays;

public class PartReverse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] characters = new char[10];

        System.out.print("Enter start index: ");
        int startIndex = in.nextInt();
        System.out.print("Enter end index: ");
        int endIndex = in.nextInt();
        System.out.print("Enter 10 characters: ");
        for (int i = 0; i < characters.length; i++) {
            characters[i] = in.next().charAt(0);
        }
        reverse(characters, startIndex, endIndex);
        System.out.println("Output array : " + Arrays.toString(characters));
    }

    public static void reverse(char[] input, int k, int j) {
        int endIndexIterator = j - 1;
        for (int i = k - 1; i <= endIndexIterator; i++) {
            char temp = input[i];
            // swap
            input[i] = input[endIndexIterator];
            input[endIndexIterator] = temp;
            endIndexIterator--;
        }
    }
}
