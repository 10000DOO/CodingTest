package 백준;

import java.io.*;
import java.util.*;

public class bj2309{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] input = new int[9];
        int[] answer = new int[7];
        int sum = 0;

        for(int i = 0; i<9; i++){
            input[i] = Integer.parseInt(br.readLine());
        }

        for(int j = 0; j<9; j++){
            sum += input[j];
        }

        for(int a = 0; a < 9; a++){
            for(int b = 0; b < 9; b++){
                if(a != b && (sum -input[a] -input[b]) == 100) {
                    int answerIndex = 0;
                    for(int c = 0; c<9; c++){
                        if(c != a && c != b){
                            answer[answerIndex] = input[c];
                            answerIndex++;
                        }
                    }
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Arrays.sort(answer);
        for(int l = 0; l < 7; l++){
            bw.write(Integer.toString(answer[l]));
            if(l != 6){
                bw.write("\n");
            }
        }
        bw.close();
    }
}
