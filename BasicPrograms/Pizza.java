import java.util.Scanner;

public class Pizza {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("How many people are going to the party?");
        int people = in.nextInt();

        System.out.print("How many pizzas are you ordering?");
        int pizza = in.nextInt();

        pizza *= 8;

        System.out.print("With " + people + " at the party, each person gets " + pizza / people + " with "
            + pizza % people + " pices left.");
        in.close();
    }
}
