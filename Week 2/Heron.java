import java.util.Scanner;

public class Heron {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the length of side a? ");
        double a = keyboard.nextDouble();
        System.out.print("What is the length of side b? ");
        double b = keyboard.nextDouble();
        System.out.print("What is the length of side c? ");
        double c = keyboard.nextDouble();

        double s = 0.5*(a+b+c);
        double area=Math.pow((s*(s-a)*(s-b)*(s-c)), 0.5);

        System.out.println("The area is " + area);

        keyboard.close();
    }
}