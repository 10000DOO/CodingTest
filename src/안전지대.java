class 안전지대 {
    public int solution(int[][] board) {
        int answer = 0;
        int danger = 0;

        int rowSize = board[0].length;

        int[][] bigBoard = new int[rowSize+2][rowSize+2];

        for(int i = 1; i <= rowSize; i++){
            for(int j = 1; j <= rowSize; j++){
                bigBoard[i][j] = board[i-1][j-1];
            }
        }

        for(int i = 0; i<rowSize+2; i++){
            for(int j = 0; j < rowSize+2; j++){
                if(bigBoard[i][j] == 1){
                    bigBoard[i-1][j-1] = (bigBoard[i-1][j-1] == 1) ? 1 : 2;
                    bigBoard[i-1][j] = (bigBoard[i-1][j] == 1) ? 1 : 2;
                    bigBoard[i-1][j+1] = (bigBoard[i-1][j+1] == 1) ? 1 : 2;
                    bigBoard[i][j+1] = (bigBoard[i][j+1] == 1) ? 1 : 2;
                    bigBoard[i+1][j+1] = (bigBoard[i+1][j+1] == 1) ? 1 : 2;
                    bigBoard[i+1][j] = (bigBoard[i+1][j] == 1) ? 1 : 2;
                    bigBoard[i+1][j-1] = (bigBoard[i+1][j-1] == 1) ? 1 : 2;
                    bigBoard[i][j-1] = (bigBoard[i][j-1] == 1) ? 1 : 2;
                }
            }
        }

        for(int i = 1; i < rowSize+1; i++){
            for(int j = 1; j < rowSize+1; j++){
                System.out.println(bigBoard[i][j]);
                if(bigBoard[i][j] != 0){
                    danger++;
                }
            }
        }

        answer = rowSize*rowSize - danger;

        return answer;
    }
}
