package 프로그래머스.LV0;

class 문자열_밀기 {
    public int 문자열_밀기(String A, String B) {
        int answer = 0;

        char lastStr = A.charAt(A.length() - 1);
        A = A.substring(0, A.length() - 1);
        A = String.valueOf(lastStr) + A;

        if(A.equals(B)){
            answer = 1;
        } else {
            answer = -1;
        }
        return answer;
    }
}
