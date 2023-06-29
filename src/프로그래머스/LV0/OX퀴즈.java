package 프로그래머스.LV0;

class OX퀴즈 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int sequence = 0;

        for(String cal : quiz){
            String[] strArray = cal.split(" ");
            int firstNum = Integer.parseInt(strArray[0]);
            int secondNum = Integer.parseInt(strArray[2]);
            String operator = strArray[1];
            int result = 0;

            switch(operator){
                case "+":
                    result = firstNum + secondNum;
                    break;
                case "-":
                    result = firstNum - secondNum;
                    break;
            }
            if(result == Integer.parseInt(strArray[4])){
                answer[sequence] = "O";
            } else{
                answer[sequence] = "X";
            }
            sequence++;
        }
        return answer;
    }
}
