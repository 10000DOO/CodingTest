package 백준.실버;

import java.util.*;
import java.io.*;

public class bj2164{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i < N + 1; i++){
            queue.offer(i);
        }
        while(true){
            if(queue.size() == 1){
                bw.write(String.valueOf(queue.poll()));
                break;
            }
            queue.poll();
            if(queue.size() == 1){
                bw.write(String.valueOf(queue.poll()));
                break;
            }
            int front = queue.poll();
            queue.offer(front);
        }

        bw.close();
    }
}
