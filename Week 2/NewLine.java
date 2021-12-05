import java.util.Scanner;

public class NewLine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a CamelCase sentence: ");
        String sentence = keyboard.nextLine();
        String output = "";

        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLowerCase(sentence.charAt(i))) {
                output += sentence.charAt(i);
            } else {
                if (output != "") {
                    System.out.println(output);
                }
                output = "" + sentence.charAt(i);
            }
        }

        System.out.println(output);

        keyboard.close();
    }
}