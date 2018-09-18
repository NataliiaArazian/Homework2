import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your line, please: ");
        String myLine = in.nextLine();
        System.out.print("Enter character: ");
        char myChar = in.next().charAt(0);


        int countOnes = 0;
        for (char element : myLine.toCharArray()){
            if (element == myChar) countOnes++;
        }
        System.out.print("Frequency: " + countOnes);
    }
}
