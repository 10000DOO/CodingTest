package 프로그래머스.LV0;

class 연속된_수의_합 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int middle = total/num;
        int start = num%2 == 1 ? middle-(num/2) : middle-(num/2)+1;
        if(num%2 == 1){
            start = middle-(num/2);
        }else{
            start = middle-(num/2)+1;
        }
        for(int i = 0; i<num; i++){
            answer[i] = start+i;
        }
        return answer;
    }
}
