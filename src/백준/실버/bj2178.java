package 백준.실버;

import java.io.*;
import java.util.*;

public class bj2178{
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int[][] graph;
    static boolean[][] visited;
    static int N;
    static int M;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            String line = br.readLine();
            for(int j = 0; j < M; j++){
                graph[i][j] = Integer.parseInt(line.substring(j,j+1));
            }
        }

        bfs(0,0);
        bw.write(String.valueOf(graph[N-1][M-1]));
        bw.close();
    }

    public static void bfs(int i, int j){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});
        visited[i][j] = true;

        while(!queue.isEmpty()){
            int[] current = queue.poll();

            for(int k = 0; k<4; k++){
                int x = current[0] + dx[k];
                int y = current[1] + dy[k];
                if(x >=0 && y >= 0 && x < N && y < M){
                    if(graph[x][y] != 0 && !visited[x][y]){
                        visited[x][y] = true;
                        graph[x][y] = graph[current[0]][current[1]] + 1;
                        queue.add(new int[] {x,y});
                    }
                }
            }
        }
    }
}
