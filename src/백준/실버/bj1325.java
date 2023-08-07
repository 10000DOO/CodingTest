package 백준.실버;

import java.io.*;
import java.util.*;

public class bj1325 {
    static boolean[] visited;
    static int N,M,count;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i = 0; i <= N; i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(b).add(a);
        }

        int maxNum = 0;
        int[] result = new int[N + 1];

        for(int i = 1; i <= N; i++){
            visited = new boolean[N+1];
            count = 0;
            bfs(i);
            result[i] = count;
            maxNum = Math.max(count, maxNum);
        }
        for(int i = 1; i <= N; i++){
            if(result[i] == maxNum){
                bw.write(i + " ");
            }
        }

        bw.close();
    }

    public static void bfs(int start){
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[start] = true;
        queue.add(start);

        while(!queue.isEmpty()){
            int num = queue.poll();
            for(int ele : graph.get(num)){
                if(visited[ele] == false){
                    visited[ele] = true;
                    queue.add(ele);
                    count++;
                }
            }
        }
    }
}
