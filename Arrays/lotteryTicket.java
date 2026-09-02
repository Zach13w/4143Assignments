package Arrays;
import java.util.Arrays;
import java.util.Random;

public class lotteryTicket {
    public static void main(String[] args)
    {
        int[] nums = {0,0,0,0,0,0};
        Random rand = new Random();

        for (int i=0; i < nums.length; i++){
            nums[i] = rand.nextInt(55);
        }

        System.out.println();



    }
}
