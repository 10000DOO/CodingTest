package 백준.실버;

import java.io.*;
import java.util.*;

public class bj1026 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        Integer[] S = new Integer[N];
        int sum = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            S[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        Arrays.sort(S, Collections.reverseOrder());

        for(int i = 0; i < N; i++){
            sum += A[i]*S[i];
        }

        bw.write(String.valueOf(sum));
        bw.close();
    }
}
