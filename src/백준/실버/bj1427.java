package 백준.실버;

import java.io.*;

public class bj1427{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int[] inputArr = new int[input.length()];
        int maxIndex = 0;

        for(int i = 0; i < input.length(); i++){
            inputArr[i] = Character.getNumericValue(input.charAt(i));
        }

        for(int j = 0; j < input.length(); j++){
            int max = inputArr[j];
            for(int k = j+1; k < input.length(); k++){
                if(inputArr[k] > max){
                    max = inputArr[k];
                    maxIndex = k;
                }
            }
            if(max > inputArr[j]){
                int temp = inputArr[j];
                inputArr[j] = max;
                inputArr[maxIndex] = temp;
            }
        }

        for(int element : inputArr){
            bw.write(String.valueOf(element));
        }
        bw.close();
    }
}
