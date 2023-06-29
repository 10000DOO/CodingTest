package 프로그래머스.LV0;

class 분수의_덧셈 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int sumNumer = (numer1*denom2) + (numer2*denom1);
        int sumDenom = denom1*denom2;
        int resultDenom = 0;
        int resultNumer = 0;

        int smallNum = sumDenom < sumNumer ? sumDenom : sumNumer;
        for(int i = smallNum; i > 0; i--){
            if(sumDenom % i == 0 && sumNumer % i == 0){
                resultDenom = sumDenom / i;
                resultNumer = sumNumer / i;
                break;
            }
        }
        answer[0] = resultNumer;
        answer[1] = resultDenom;
        return answer;
    }
}
