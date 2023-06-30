package 백준;

import java.io.*;

public class Bj10988{
    public static void main(String[] args) throws Exception {
        int answer = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int length = input.length();

        for(int i = 0; i < length / 2; i++){
            if(input.charAt(i) == input.charAt(length -i -1)){
                answer = 1;
            } else {
                answer = 0;
                break;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(answer));
        bw.newLine();
        bw.close();
    }
}
