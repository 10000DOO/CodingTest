import java.io.*;
import java.util.*;

public class bj11004 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(arr,0,arr.length - 1);
        bw.write(String.valueOf(arr[target - 1]));

        bw.close();
    }

    private static void quickSort(int[] arr, int L, int R){
        //파티션 나누고 오른쪽 값 첫번째 값을 받아옴
        int part2 = partition(arr, L, R);

        //왼쪽 파티션의 요소가 하나 이상
        if (L < part2 - 1)
            quickSort(arr, L, part2 - 1);
        //오른쪽 파티션의 요소가 하나 이상
        if (part2 < R)
            quickSort(arr, part2, R);
    }

    private static int partition(int[] arr, int L, int R){
        int pivot = arr[(L + R)/2];
        while (L <= R) {
            while (arr[L] < pivot) L ++;
            while (arr[R] > pivot) R--;
            if (L <= R) {
                swap(arr, L, R);
                L++;
                R--;
            }
        }
        return L;
    }

    private static void swap(int[] arr, int aIndex, int bIndex) {
        int temp = arr[aIndex];
        arr[aIndex] = arr[bIndex];
        arr[bIndex] = temp;
    }
}
