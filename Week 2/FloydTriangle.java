import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = keyboard.nextInt();

        String first, second;
        String output = "";

        for (int i = 0; i <= rows; i++) {
            if (i % 2 == 0) {
                first = "1";
                second = "0";
            } else {
                first = "0";
                second = "1";
            }
            for (int j = 1; j < (i + 1); j++) {
                if (j % 2 == 0) {
                    output += first;
                } else {
                    output += second;
                }
            }
            System.out.println(output);
            output = "";
        }

        keyboard.close();
    }
}