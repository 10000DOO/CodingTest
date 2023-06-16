class 정수를_나선형으로_배치하기 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int[][] move = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int nextX = 0;
        int nextY = 0;
        int index = 0;
        int presentX = 0;
        int presentY = 0;

        for(int i = 1; i <= n*n; i++){
            answer[presentX][presentY] = i;

            nextX = presentX + move[index][0];
            nextY = presentY + move[index][1];

            if(nextX < 0 || nextY < 0 || nextX >= n || nextY >= n || answer[nextX][nextY] != 0) {
                index = (index+1)%4;
                nextX = presentX + move[index][0];
                nextY = presentY + move[index][1];
            }

            presentX = nextX;
            presentY = nextY;
        }

        return answer;
    }
}
