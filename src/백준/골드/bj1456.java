package 백준.골드;

import java.io.*;
import java.util.*;

public class bj1456 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long start = Long.parseLong(st.nextToken());
        long end = Long.parseLong(st.nextToken());

        long[] arr = new long[10000001];

        for (long i = 2L; i < arr.length; i++) {
            arr[(int) i] = i;
        }

        for (long i = 2L; i <= Math.sqrt(end); i++) {
            if (arr[(int) i] == 0L) {
                continue;
            }
            for (long j = i * i; j < arr.length; j += i) {
                arr[(int) j] = 0L;
            }
        }

        long count = 0L;
        for(long i = 2L; i < arr.length; i++){
            if (arr[(int) i] != 0L) {
                long temp = arr[(int) i];
                while((double)arr[(int) i] <=
                        (double)end / (double)temp){
                    if((double)arr[(int) i] >=
                            (double)start / (double)temp){
                        count++;
                    }
                    temp = temp * arr[(int) i];
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.close();
    }
}
