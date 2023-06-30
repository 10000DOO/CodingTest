package 백준;

import java.io.*;
import java.util.*;

class Bj10488 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lineNum = Integer.parseInt(br.readLine());

        int[] inputArr = new int[lineNum];
        for (int i = 0; i < lineNum; i++) {
            String s = br.readLine();
            inputArr[i] = Integer.parseInt(s);
        }

        List<Integer> tNums = new ArrayList<>();
        for(int i = 1; i*(i+1)/2<=1000; i++){
            tNums.add(i*(i+1)/2);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int j = 0; j < lineNum; j++){
            if(eureka(inputArr[j], tNums) == true){
                bw.write(Integer.toString(1));
            }else{
                bw.write(Integer.toString(0));
            }
            bw.newLine();
        }
        bw.close();
    }

    public static boolean eureka(int n, List<Integer> tNums){
        for(int firstNum : tNums){
            for(int secondNum : tNums){
                for(int thirdNum : tNums){
                    if(n == firstNum + secondNum + thirdNum){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
