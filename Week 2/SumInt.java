import java.util.Scanner;

public class SumInt {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num = 1;
        int numtotal = 0;

        while (num > 0) {
            System.out.print("Enter a number: ");
            num = keyboard.nextInt();
            numtotal += num;
        }

        System.out.println("SumInt is " + numtotal);

        keyboard.close();
    }
}
