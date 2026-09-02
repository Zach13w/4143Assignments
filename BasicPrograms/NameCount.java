import java.util.Scanner;

public class NameCount {
        public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String Fname = in.nextLine();
     
        System.out.print("Enter your last name: ");
        String Lname = in.nextLine();
        
        if (Fname.length() == Lname.length())
        {
            System.out.print("Your first and last name have the same number of letters.");
        }

        else
        {
            System.out.print("Your first and last name do not tomhave the same number of letters.");
        }


        in.close();
    }
}
