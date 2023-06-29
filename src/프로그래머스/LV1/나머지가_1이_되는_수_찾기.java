package 프로그래머스.LV1;

class 나머지가_1이_되는_수_찾기 {
    public int 나머지가_1이_되는_수_찾기(int n) {
        int answer = 0;

        for(int i = 2; i < 1000000; i++){
            if(n % i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
