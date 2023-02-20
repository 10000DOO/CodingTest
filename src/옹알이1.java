class 옹알이1 {
    public int solution(String[] babbling) {
        int answer = 0;
        boolean tf = false;
        String[] originalBabList = {"aya", "ye", "woo", "ma"};
        for (String str : babbling){
            for (String str2 : originalBabList){
                str = str.replace(str2,"X");
            }
            for(int i = 0; i < str.length(); i++){
                if(str.substring(i,i+1).equals("X")){
                    tf = true;
                }else{
                    tf = false;
                    break;
                }
            }
            if(tf == true){
                answer++;
            }
        }
        return answer;
    }
}
