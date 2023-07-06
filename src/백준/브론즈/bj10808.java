package 백준.브론즈;

import java.io.*;

public class bj10808{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int[] alpha = new int[26];

        for(int i = 0; i < input.length(); i++){
            switch (input.charAt(i)){
                case 'a':
                    alpha[0]++;
                    break;
                case 'b':
                    alpha[1]++;
                    break;
                case 'c':
                    alpha[2]++;
                    break;
                case 'd':
                    alpha[3]++;
                    break;
                case 'e':
                    alpha[4]++;
                    break;
                case 'f':
                    alpha[5]++;
                    break;
                case 'g':
                    alpha[6]++;
                    break;
                case 'h':
                    alpha[7]++;
                    break;
                case 'i':
                    alpha[8]++;
                    break;
                case 'j':
                    alpha[9]++;
                    break;
                case 'k':
                    alpha[10]++;
                    break;
                case 'l':
                    alpha[11]++;
                    break;
                case 'm':
                    alpha[12]++;
                    break;
                case 'n':
                    alpha[13]++;
                    break;
                case 'o':
                    alpha[14]++;
                    break;
                case 'p':
                    alpha[15]++;
                    break;
                case 'q':
                    alpha[16]++;
                    break;
                case 'r':
                    alpha[17]++;
                    break;
                case 's':
                    alpha[18]++;
                    break;
                case 't':
                    alpha[19]++;
                    break;
                case 'u':
                    alpha[20]++;
                    break;
                case 'v':
                    alpha[21]++;
                    break;
                case 'w':
                    alpha[22]++;
                    break;
                case 'x':
                    alpha[23]++;
                    break;
                case 'y':
                    alpha[24]++;
                    break;
                case 'z':
                    alpha[25]++;
                    break;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int output : alpha){
            bw.write(Integer.toString(output) + " ");
        }
        bw.close();
    }
}
