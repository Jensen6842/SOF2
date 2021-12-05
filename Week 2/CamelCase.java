import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = keyboard.nextLine();
        String output = "";
        boolean newWord = true;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                if (newWord) {
                    output += sentence.toUpperCase().charAt(i);
                    // output += Character.toUpperCase(sentence.charAt(i));
                } else {
                    output += sentence.toLowerCase().charAt(i);
                    // output += Character.toLowerCase(sentence.charAt(i));
                }
                newWord = false;
            } else {
                newWord = true;
            }
        }

        System.out.println(output);

        keyboard.close();
    }
}
