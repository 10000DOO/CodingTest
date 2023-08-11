package 백준.실버;

import java.io.*;
import java.util.*;

public class bj1068 {
    static boolean[] visited;
    static int answer = 0;
    static int stop;
    static int N;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int start = 0;
        for(int i = 0; i < N; i++){
            graph.add(new ArrayList<Integer>());
        }
        visited = new boolean[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(st.nextToken());
            if(a == -1){
                start = i;
            } else{
                graph.get(a).add(i);
            }
        }

        st = new StringTokenizer(br.readLine());
        stop = Integer.parseInt(st.nextToken());

        if(stop == start){
            bw.write("0");
        } else{
            graph.get(stop).clear();
            for (int i = 0; i < N; i++) {
                if (graph.get(i).contains(stop)) {
                    graph.get(i).remove(Integer.valueOf(stop));
                }
            }
            dfs(start);
            bw.write(String.valueOf(answer));
        }
        bw.close();
    }

    public static void dfs(int num){
        visited[num] = true;
        int count = 0;
        for(int i : graph.get(num)){
            if(!visited[i]){
                count++;
                dfs(i);
            }
        }
        if(count == 0){
            answer++;
        }
    }
}
