import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter something");
        String response = userInput.next();

        if (StringUtils.isNumeric(response)) {
            System.out.println("Response is a number.");
        } else {
            System.out.println("Response is not a number.");
        }

        System.out.println("Your response with cases swapped: " + StringUtils.swapCase(response));
        System.out.println("Your response reversed: " + StringUtils.reverse(response));

    }
}
