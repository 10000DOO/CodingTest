package 백준.실버;

import java.io.*;
import java.util.*;

public class bj12891{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arrLength = Integer.parseInt(st.nextToken());
        int strLength = Integer.parseInt(st.nextToken());
        String[] DNA = new String[arrLength];
        int startIdx = 0;
        int endIdx = startIdx + strLength - 1;
        int aCount = 0, cCount = 0, gCount = 0, tCount = 0;
        int answer = 0;

        String DNAstr = br.readLine();
        for(int i = 0; i< strLength; i++){
            if(DNAstr.charAt(i) == 'A'){
                aCount++;
            } else if(DNAstr.charAt(i) == 'C'){
                cCount++;
            } else if(DNAstr.charAt(i) == 'G'){
                gCount++;
            } else if(DNAstr.charAt(i) == 'T'){
                tCount++;
            }
        }

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        while(endIdx <= arrLength - 1){
            if(aCount >= a && cCount >= c && gCount >= g && tCount >= t){
                answer++;
            }
            if(DNAstr.charAt(startIdx) == 'A'){
                aCount--;
            } else if(DNAstr.charAt(startIdx) == 'C'){
                cCount--;
            } else if(DNAstr.charAt(startIdx) == 'G'){
                gCount--;
            } else if(DNAstr.charAt(startIdx) == 'T'){
                tCount--;
            }
            startIdx++;
            endIdx++;
            if(endIdx < arrLength) {
                if(DNAstr.charAt(endIdx) == 'A'){
                    aCount++;
                } else if(DNAstr.charAt(endIdx) == 'C'){
                    cCount++;
                } else if(DNAstr.charAt(endIdx) == 'G'){
                    gCount++;
                } else if(DNAstr.charAt(endIdx) == 'T'){
                    tCount++;
                }
            }
        }
        bw.write(String.valueOf(answer));
        bw.close();
    }
}
