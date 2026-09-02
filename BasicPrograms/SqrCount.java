import java.util.Scanner;

public class SqrCount {
        public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        System.out.print("\n Num   Sqr");

        for(int i = 0; i <= num; i++)
        {
            System.out.print("\n " + i + "   " + i*i);
        }

        in.close();
    }
}