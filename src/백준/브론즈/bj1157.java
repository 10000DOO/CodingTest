package 백준.브론즈;

import java.io.*;
import java.util.*;

public class bj1157{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char maxAlpha = 'a';
        int maxNum = 0;
        boolean duplicate = false;

        String input = br.readLine();
        input = input.toUpperCase();

        int[] alpha = new int[26];

        for(int i = 0; i < input.length(); i++){
            switch (input.charAt(i)){
                case 'A':
                    alpha[0]++;
                    break;
                case 'B':
                    alpha[1]++;
                    break;
                case 'C':
                    alpha[2]++;
                    break;
                case 'D':
                    alpha[3]++;
                    break;
                case 'E':
                    alpha[4]++;
                    break;
                case 'F':
                    alpha[5]++;
                    break;
                case 'G':
                    alpha[6]++;
                    break;
                case 'H':
                    alpha[7]++;
                    break;
                case 'I':
                    alpha[8]++;
                    break;
                case 'J':
                    alpha[9]++;
                    break;
                case 'K':
                    alpha[10]++;
                    break;
                case 'L':
                    alpha[11]++;
                    break;
                case 'M':
                    alpha[12]++;
                    break;
                case 'N':
                    alpha[13]++;
                    break;
                case 'O':
                    alpha[14]++;
                    break;
                case 'P':
                    alpha[15]++;
                    break;
                case 'Q':
                    alpha[16]++;
                    break;
                case 'R':
                    alpha[17]++;
                    break;
                case 'S':
                    alpha[18]++;
                    break;
                case 'T':
                    alpha[19]++;
                    break;
                case 'U':
                    alpha[20]++;
                    break;
                case 'V':
                    alpha[21]++;
                    break;
                case 'W':
                    alpha[22]++;
                    break;
                case 'X':
                    alpha[23]++;
                    break;
                case 'Y':
                    alpha[24]++;
                    break;
                case 'Z':
                    alpha[25]++;
                    break;
            }
        }

        for(int j = 0; j<26; j++){
            if(maxNum > 0 && maxNum == alpha[j]){
                duplicate  = true;
            }
            if(maxNum < alpha[j]){
                maxNum = alpha[j];
                maxAlpha = (char)('A' + j);
                duplicate  = false;
            }
        }

        if(duplicate == true){
            bw.write("?");
        } else{
            bw.write(maxAlpha);
        }

        bw.close();
    }
}
