package 프로그래머스.LV0;

public class 종이자르기 {
    public int solution(int M, int N) {
        int answer = 0;
        answer = (M-1)+((N-1)*M);
        return answer;
    }
}
