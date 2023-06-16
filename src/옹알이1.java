class 옹알이1 {
    public int solution(String[] babbling) {
        int answer = 0;

        for(String babb : babbling) {
            babb = babb.replace("aya", "1");
            babb = babb.replace("ye", "1");
            babb = babb.replace("woo", "1");
            babb = babb.replace("ma", "1");

            babb = babb.replace("1","");

            if(babb.length() == 0){
                answer++;
            }
        }
        return answer;
    }
}
