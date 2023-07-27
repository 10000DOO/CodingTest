package 백준.실버;

import java.io.*;
import java.util.*;

public class bj1929 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int[] arr = new int[end+1];

        for(int i = 2; i<end + 1; i++){
            arr[i] = i;
        }

        for(int i = 2; i <= Math.sqrt(end); i++){
            if(arr[i] == 0){
                continue;
            }
            for(int j = i + 1; j<end + 1; j++){
                if(arr[j] == 0){
                    continue;
                } else if(arr[j] % arr[i] == 0) {
                    arr[j] = 0;
                }
            }
        }

        for(int element : arr){
            if(element != 0 && element >= start){
                bw.write(String.valueOf(element) + "\n");
            }
        }

        bw.close();
    }
}
