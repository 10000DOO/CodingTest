package 백준.실버;

import java.io.*;
import java.util.*;

public class bj1850 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());


        long temp = B % A;
        while(temp != 0){
            B = A;
            A = temp;
            temp = B % A;
        }

        for(int i = 0; i < A; i++){
            bw.write(String.valueOf(1));
        }
        bw.close();
    }
}
