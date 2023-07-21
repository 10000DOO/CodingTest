package 백준.실버;

import java.io.*;
import java.util.*;

public class bj1931 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int answer = 0;
        int[][] time = new int[count][2];

        for(int i = 0; i < count; i++){
            st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time, (a, b) ->
                a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]
        );

        int end = -1;
        for(int i = 0; i < count; i++){
            if(time[i][0] >= end){
                end = time[i][1];
                answer++;
            }
        }

        bw.write(String.valueOf(answer));
        bw.close();
    }
}
