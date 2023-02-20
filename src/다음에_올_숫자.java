class 다음에_올_숫자 {
    public int solution(int[] common) {
        int answer = 0;

        int x = common[1] - common[0];
        int y = common[2] - common[1];

        if (x == y) {
            answer = common[common.length - 1] + y;
        } else {
            answer = common[common.length - 1] * (common[2] / common[1]);
        }

        return answer;
    }
}
