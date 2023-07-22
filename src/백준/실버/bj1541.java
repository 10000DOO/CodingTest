package 백준.실버;

import java.io.*;
import java.util.*;

public class bj1541 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        List<Integer> calculate = new ArrayList<>();
        while(st.hasMoreTokens()){
            String text = st.nextToken();
            int sum = 0;
            if (text.contains("+")){
                String[] element = text.split("\\+"); // '+'를 이스케이프 처리
                for(String ele : element){
                    sum += Integer.parseInt(ele);
                }
                calculate.add(sum);
            } else{
                calculate.add(Integer.parseInt(text));
            }
        }

        int result = calculate.stream()
                .mapToInt(Integer::valueOf)
                .reduce((a, b) -> a - b)
                .getAsInt();

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
