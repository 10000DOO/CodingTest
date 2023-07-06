package 백준.브론즈;

import java.io.*;
import java.util.*;

public class bj2979{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] timeArr = new int[101];

        String[] input = new String[4];
        for(int i = 0; i < 4; i++){
            input[i] = br.readLine();
        }
        String[] parkingFee = input[0].split(" ");

        int a = Integer.parseInt(parkingFee[0]);
        int b = Integer.parseInt(parkingFee[1]);
        int c = Integer.parseInt(parkingFee[2]);

        for(int j = 1; j < 4; j++){
            String[] parkingTime = input[j].split(" ");
            int arrival = Integer.parseInt(parkingTime[0]);
            int departure = Integer.parseInt(parkingTime[1]);

            for(int k = arrival; k < departure; k++){
                timeArr[k]++;
            }
        }

        int sum = 0;
        for(int carCount : timeArr){
            switch (carCount){
                case 1:
                    sum += a * carCount;
                    break;
                case 2:
                    sum += b * carCount;
                    break;
                case 3:
                    sum += c * carCount;
                    break;
            }
        }

        bw.write(String.valueOf(sum));
        bw.close();
    }
}
