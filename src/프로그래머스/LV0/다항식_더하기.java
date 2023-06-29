package 프로그래머스.LV0;

class 다항식_더하기 {
    public String solution(String polynomial) {
        String answer = "";

        String[] expression = polynomial.split(" ");
        String withX = "";
        String withoutX = "";

        int x = 0;
        int num = 0;

        for(String term : expression){
            if(term.contains("x")){
                if(term.equals("x")){
                    withX = withX + "1" + "x ";
                } else {
                    withX = withX + term + " ";
                }
            }else if(!term.contains("+")){
                withoutX = withoutX + term + " ";
            }
        }

        withX = withX.replace("x", "");

        String[] withXArr = withX.split(" ");
        String[] withoutXArr = withoutX.split(" ");

        for(String xnum : withXArr){
            if(xnum != ""){
                x = x + Integer.parseInt(xnum);
            }
        }
        for(String normalNum : withoutXArr){
            if(normalNum != ""){
                num = num + Integer.parseInt(normalNum);
            }
        }
        if(num == 0){
            if(x == 1){
                answer = "x";
            } else {
                answer = x + "x";
            }
        } else if(x == 0){
            answer = Integer.toString(num);
        } else {
            if(x == 1){
                answer = "x" + " + " + num;
            } else{
                answer = x + "x" + " + " + num;
            }
        }
        return answer;
    }
}
