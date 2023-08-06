package 백준.실버;

import java.io.*;
import java.util.*;

public class bj18352 {
    static int[] visited;
    static ArrayList<ArrayList<Integer>> A;
    static int N;
    static int M;
    static int K;
    static int X;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        A = new ArrayList<ArrayList<Integer>>();
        visited = new int[N+1];
        Arrays.fill(visited, -1);

        for(int i = 0; i <= N; i++){
            A.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            A.get(Integer.parseInt(st.nextToken())).add(Integer.parseInt(st.nextToken()));
        }

        bfs(X);

        boolean anyCityFound = false;
        for (int i = 1; i < visited.length; i++) {
            if (visited[i] == K) {
                bw.write(i + "\n");
                anyCityFound = true;
            }
        }

        if (!anyCityFound) {
            bw.write("-1\n");
        }
        bw.close();
    }
    public static void bfs(int X){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(X);
        visited[X] = 0;
        while(!queue.isEmpty()){
            int num = queue.poll();
            for(int element : A.get(num)){
                if(visited[element] == -1){
                    visited[element] = visited[num]+1;
                    queue.add(element);
                }
            }
        }
    }
}
