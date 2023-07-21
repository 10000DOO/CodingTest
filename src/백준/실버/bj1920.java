package 백준.실버;

import java.io.*;
import java.util.*;

public class bj1920 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] nArr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            nArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nArr);

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            int target = Integer.parseInt(st.nextToken());

            int start = 0;
            int end = N - 1;
            boolean find = false;
            while(start <= end){
                int mid = (start + end) / 2;
                if(target > nArr[mid]){
                    start = mid + 1;
                } else if(target < nArr[mid]){
                    end = mid - 1;
                } else{
                    find = true;
                    break;
                }
            }
            if(find){
                bw.write(String.valueOf(1) + "\n");
            } else{
                bw.write(String.valueOf(0) + "\n");
            }
        }
        bw.close();
    }
}
