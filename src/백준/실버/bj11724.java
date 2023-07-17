package 백준.실버;

import java.io.*;
import java.util.*;

public class bj11724{
    static int N;
    static int E;
    static int[][] graph;
    static boolean[] visited;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        graph = new int[N+1][N+1];
        visited = new boolean[N+1];
        int answer = 0;
        for(int i = 0; i < E; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        for(int i = 1; i <= N; i++){
            if(!visited[i]){
                dfs(i);
                answer++;
            }
        }
        bw.write(String.valueOf(answer));
        bw.close();
    }
    public static void dfs(int index){
        if(visited[index]){
            return;
        }
        visited[index] = true;
        for(int i = 1; i <= N; i++){
            if(graph[index][i] == 1){
                dfs(i);
            }
        }
    }
}
