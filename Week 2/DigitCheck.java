import java.util.Scanner;

public class DigitCheck {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter integer A: ");
        int num = keyboard.nextInt();
        String a = Integer.toString(num);

        System.out.print("Enter integer B: ");
        num = keyboard.nextInt();
        String b = Integer.toString(num);

        int max, diff;
        String output = "";

        if (a.length() < b.length()) {
            max = a.length();
            diff = b.length() - a.length();
        } else {
            max = b.length();
            diff = a.length() - b.length();
        }

        for (int i = 0; i < max; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                output += 1;
            } else {
                output += 0;
            }
        }

        for (int i = 0; i < diff; i++) {
            output += 0;
        }

        System.out.println(output);

        keyboard.close();
    }
}
