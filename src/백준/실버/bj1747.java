package 백준.실버;

import java.io.*;
import java.util.*;

public class bj1747 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[10000001];
        for(int i =1; i < arr.length; i++){
            arr[i] = i;
        }

        for(int i =2; i < Math.sqrt(arr.length); i++){
            for(int j = i * 2; j < arr.length; j = j + i){
                arr[j] = 0;
            }
        }

        for(int k = 2; k < arr.length; k++){
            boolean palindrome = true;
            if(arr[k] != 0 && arr[k] >= N) {
                String str = String.valueOf(arr[k]);
                for(int i = 0; i < str.length() / 2; i++) {
                    if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                        palindrome = false;
                        break;
                    }
                }
                if(palindrome) {
                    bw.write(String.valueOf(arr[k]));
                    break;
                }
            }
        }

        bw.close();
    }
}
