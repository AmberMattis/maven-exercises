import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class StringManipulation extends Ascii {
    public static void main(String[] args) {
        Ascii title = new Ascii();

        Ascii.asciiTitle();

        Scanner userInput = new Scanner(System.in);

        System.out.println(RESET + "Enter something");
        String response = userInput.nextLine();
        System.out.println( );

        System.out.println(YELLOW + "You Entered: " + RESET + response);

        if (StringUtils.isNumeric(response)) {
            System.out.println(response + YELLOW + " is a number.");
        } else {
            System.out.println(response + YELLOW +  " is not a number.");
        }

        System.out.println(YELLOW + "Your response with cases swapped: " + RESET +  StringUtils.swapCase(response));
        System.out.println(YELLOW + "Your response reversed: " + RESET +  StringUtils.reverse(response));

    }
}
