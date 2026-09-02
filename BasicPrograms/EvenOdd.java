import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if(num == 0)
        {
            System.out.print("Your number is zero.");
        }

        else if(num % 2 == 1)
        {
            System.out.print("Your number is odd.");
        }

        else if(num % 2 == 0)
        {
            System.out.print("Your number is even.");
        }

        in.close();
    }
}
