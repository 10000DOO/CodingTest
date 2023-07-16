package 백준.실버;

import java.io.*;
import java.util.*;

public class bj2751 {
    private static int[] sortedArr;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        sortedArr = new int[size];
        for(int i = 0; i< size; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(arr, 0, size - 1);
        for(int element : arr){
            bw.write(String.valueOf(element) + "\n");
        }
        bw.close();
    }

    public static void mergeSort(int[] arr, int left, int right){
        if(left >= right){
            return;
        }

        int mid = (left+right)/2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);

        mergeSort(arr, left, mid, right);
    }

    public static void mergeSort(int[] arr, int left, int mid, int right){
        int firstStart = left;
        int secondStart = mid + 1;
        int idx = left;

        while(firstStart <= mid && secondStart <= right){
            if(arr[firstStart] <= arr[secondStart]){
                sortedArr[idx] = arr[firstStart];
                idx++;
                firstStart++;
            } else{
                sortedArr[idx] = arr[secondStart];
                idx++;
                secondStart++;
            }
        }
        if(firstStart > mid){
            for(int j = secondStart; j <= right; j++){
                sortedArr[idx] = arr[j];
                idx++;
            }
        } else{
            for(int k = firstStart; k <= mid; k++){
                sortedArr[idx] = arr[k];
                idx++;
            }
        }

        for (int i = left; i <= right; i++) {
            arr[i] = sortedArr[i];
        }
    }
}
