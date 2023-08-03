package 백준.브론즈;

import java.io.*;
import java.util.*;

public class bj1934 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());

        for(int i =0; i< count; i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(minimun(A, B)) + "\n");
        }

        bw.close();
    }

    public static int minimun(int A, int B){
        int big = A;
        int small = B;
        int temp = 0;
        temp = big % small;
        while(temp != 0){
            big = small;
            small = temp;
            temp = big % small;
        }
        return A * B / small;
    }
}
