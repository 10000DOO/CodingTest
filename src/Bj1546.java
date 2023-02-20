import java.util.Arrays;
import java.util.Scanner;

public class Bj1546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        double[] nums = new double[count];
        for(int i = 0; i < count; i++){
            nums[i] = sc.nextInt();
        }

        //int max = Arrays.stream(nums).max().getAsInt();
        Arrays.sort(nums);

        double sum = 0;
        for(int i = 0; i < count; i++){
            sum += nums[i];
        }

        double avg = sum / nums[count-1] * 100 / count;

        System.out.println(avg);
    }
}
