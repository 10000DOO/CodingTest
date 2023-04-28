import java.util.*;
public class 겹치는_선분_길이 {
    public int solution(int[][] lines) {
        int[] arr = new int[201];
        int answer = 0;
        for(int i = 0; i<3; i++){
            for(int j = (lines[i][0] + 100); j<(lines[i][1]+100); j++){
                arr[j]++;
            }
        }
        for(int k = 0; k <201; k++){
            if (arr[k] > 1){
                answer++;
            }
        }
        return answer;
    }
}
