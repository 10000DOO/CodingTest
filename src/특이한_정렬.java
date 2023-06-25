import java.util.*;

class 특이한_정렬 {
    public int[] 특이한_정렬(int[] numlist, int n) {
        Integer[] numListInteger = Arrays.stream(numlist).boxed().toArray(Integer[]::new);

        Arrays.sort(numListInteger, (a, b) -> {
            int diffA = Math.abs(n - a);
            int diffB = Math.abs(n - b);

            // 거리가 같다면, 더 큰 숫자가 앞으로 와야 한다
            if (diffA == diffB){
                return b.compareTo(a);
            }
            // 거리가 다르다면, 거리가 가까운 숫자가 앞으로 와야 한다
            return diffA - diffB;
        });

        // 결과값 반환
        return Arrays.stream(numListInteger).mapToInt(Integer::intValue).toArray();
    }
}
