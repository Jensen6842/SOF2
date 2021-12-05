import java.util.Scanner;

public class NoWhiteSpace {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = keyboard.nextLine();
        String output = "";

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                output += sentence.charAt(i);
            }
        }

        System.out.println(output);

        /**
         * using regex: System.out.println(sentence.replaceAll("\\s+",""));
         */

        keyboard.close();
    }
}
