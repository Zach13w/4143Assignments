import java.util.Scanner;

public class sumfind{
            public static void main(String[] args){
                Scanner in = new Scanner(System.in);

                System.out.print("Enter a number: ");
                int num = in.nextInt();
                int sum = 0;
                int count = 1;
                while(count <= num)
                {
                    sum += count;
                    count++;
                }

                System.out.print("The sum from 1 to " + num + " is " + sum);
                in.close();
            }

}
