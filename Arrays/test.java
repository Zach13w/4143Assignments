package Arrays;
import java.util.Arrays;

class main{
    public static void main(String[] args){
        String s = "hello";
        String[] arr = {"a","b","c"};
        int[] nums = {4,1,2,3};

        System.out.println(s.getClass().getName());
        
        System.out.println(arr.getClass().getName());

        System.out.println(nums.getClass().getName());

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));


    }
}