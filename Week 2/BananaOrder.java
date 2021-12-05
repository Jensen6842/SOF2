import java.util.Scanner;

public class BananaOrder {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many bananas are you buying in kg? ");
        double weight = keyboard.nextDouble();
        double banana_cost = weight * 3.0;
        double order_cost;

        if (banana_cost <= 50.0) {
            order_cost = banana_cost + 4.99;
        }else{
            order_cost = banana_cost + 3.49;
        }

        System.out.println("Your order will cost £" + order_cost);

        keyboard.close();
    }
}