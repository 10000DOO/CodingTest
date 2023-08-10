package 백준.실버;

import java.io.*;
import java.util.*;

public class bj11725 {
    static boolean[] visited;
    static int[] answer;
    static int N;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        for(int i = 0; i <= N; i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < N-1; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(b).add(a);
            graph.get(a).add(b);
        }
        visited = new boolean[N+1];
        answer = new int[N+1];

        dfs(1);

        for(int i = 2; i < N+1; i++){
            bw.write(answer[i] + "\n");
        }
        bw.close();
    }

    public static void dfs(int num){
        visited[num] = true;
        for(int i : graph.get(num)){
            if(!visited[i]){
                answer[i] = num;
                dfs(i);
            }
        }
    }
}
