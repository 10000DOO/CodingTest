package 프로그래머스.LV0;

import java.util.*;

class 최빈값_구하기 {
    public int solution(int[] array) {
        int answer = 0;

        int[] result = new int[1001];

        for(int num : array){
            result[num] = result[num] + 1;
        }

        int max = result[0];
        int maxIndex = 0;

        for (int i = 0; i < result.length; i++) {
            if (result[i] > max) {
                max = result[i];
                maxIndex = i;
            }
        }

        answer = maxIndex;

        Arrays.sort(result);
        if(result[999] == result[1000]){
            answer = -1;
        }
        return answer;
    }
}
