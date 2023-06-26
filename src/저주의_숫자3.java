class 저주의_숫자3 {
    public int 저주의_숫자3(int n) {
        int answer = 1;
        int decimal = 1;

        while(true){
            if(decimal == n){
                break;
            }
            if((answer+1) % 3 == 0 || String.valueOf(answer+1).contains("3")){
                answer++;
                continue;
            }

            decimal++;
            answer++;
        }
        return answer;
    }
}
