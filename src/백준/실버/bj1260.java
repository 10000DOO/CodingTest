package 백준.실버;

import java.util.*;
import java.io.*;

public class bj1260{
    static int[][] graph;
    static boolean[] dfsVisited;
    static boolean[] bfsVisited;
    static int N;
    static int E;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        graph = new int[N+1][N+1];
        dfsVisited = new boolean[N+1];
        bfsVisited = new boolean[N+1];

        for(int i = 0; i < E; i++){
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        dfs(start);

        bw.write("\n");

        bfs(start);


        bw.close();
    }

    public static void dfs(int index) throws IOException {
        if(dfsVisited[index]){
            return;
        }
        dfsVisited[index] = true;
        bw.write(String.valueOf(index) + " ");
        for(int i = 1; i<=N; i++){
            if(graph[index][i] == 1){
                dfs(i);
            }
        }
    }

    public static void bfs(int index) throws IOException {
        if(bfsVisited[index]) return;

        bfsVisited[index] = true;

        Queue<Integer> queue = new LinkedList<>();

        queue.add(index);

        while(!queue.isEmpty()){
            int current = queue.poll();

            bw.write(String.valueOf(current) + " ");
            for(int i = 1; i <=N; i++){
                if(graph[current][i] == 1 && !bfsVisited[i]){ // index 대신 current 사용
                    bfsVisited[i] = true; // index 대신 i 사용
                    queue.add(i);
                }
            }
        }
    }
}
