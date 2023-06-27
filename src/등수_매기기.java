class 등수_매기기 {
    public int[] 등수_매기기(int[][] score) {
        int[] answer = new int[score.length];
        double[] average = new double[score.length];

        for(int i = 0; i<score.length; i++){
            average[i] = (score[i][0] + score[i][1]) / 2.0;
        }

        for(int i = 0; i<score.length; i++){
            int rank = 0;
            for(int j = 0; j<score.length; j++){
                if(average[i] < average[j]){
                    rank++;
                }
            }
            answer[i] = rank+1;
        }

        return answer;
    }
}
