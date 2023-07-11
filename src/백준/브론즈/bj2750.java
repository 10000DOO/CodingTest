package 백준.브론즈;

import java.io.*;

public class bj2750{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int k = 0; k < N; k++){
            arr[k] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < N; i++){
            for(int j = 1; j < N - i; j++){
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        for(int k = 0; k < N; k++){
            bw.write(String.valueOf(arr[k]) + "\n");
        }

        bw.close();
    }
}
