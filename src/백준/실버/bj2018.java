package 백준.실버;

import java.io.*;
import java.util.*;

public class bj2018{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int answer = 1, start = 1, end = 1, sum = 1;

        while(end != N){
            if(sum == N){
                answer++;
                end++;
                sum += end;
            } else if(sum > N){
                sum -= start;
                start++;
            } else if(sum < N){
                end++;
                sum += end;
            }
        }

        bw.write(String.valueOf(answer));
        bw.close();
    }
}
