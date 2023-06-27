import java.util.*;

class 유한소수_판별하기 {
    public int solution(int a, int b) {
        int answer = 1;
        List<Integer> factorization = new ArrayList<>();

        int smallNum = Math.min(a, b);

        //기약분수 만들기
        for(int i = 1; i <= smallNum; i++){
            if(a % i == 0 && b % i == 0){
                a = a / i;
                b = b / i;
            }
        }

        // 중복 소인수 제거
        while (b % 2 == 0) b /= 2;
        while (b % 5 == 0) b /= 5;

        // 반복되는 소수점을 판별
        if (b == 1) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }
}
