package 프로그래머스.LV1;

class 약수의_합 {
    public int 약수의_합(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer += i;
            }
        }
        return answer;
    }
}
