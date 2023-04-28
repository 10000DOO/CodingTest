import java.util.Scanner;

public class Bj11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCount = sc.nextInt();
        int qNum = sc.nextInt();

        int[] arr = new int[numCount];
        int[] sumArr = new int[numCount];
        for(int i = 0; i < numCount; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == 0){
                sumArr[i] = arr[0];
            }else{
                sumArr[i] = arr[i] + sumArr[i - 1];
            }
        }

        int[] sum = new int[qNum];
        for (int k = 0; k < qNum; k++) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            if (first == 1) {
                sum[k] = sumArr[second -1];
            }else {
                sum[k] = sumArr[second -1] - sumArr[first -2];
            }
        }

        for (int i : sum) {
            System.out.println(i);
        }
    }
}
