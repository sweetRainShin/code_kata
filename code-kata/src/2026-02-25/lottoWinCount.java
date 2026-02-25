import java.util.stream.IntStream;

class Solution {
    public int[] lottoWinPredict(int[] lottos, int[] win_nums) {
        int win_count = 0;
        int zero_count = 0;
        int[] lank = {6, 6, 5, 4, 3, 2, 1};
        int[] result = new int[2];
        for (int i = 0; i < lottos.length; i++) {
            int lotto = lottos[i];
            if (IntStream.of(win_nums).anyMatch(x -> x == lotto))
                win_count++;
            if (lotto == 0)
                zero_count++;
        }
        result[0] = lank[win_count + zero_count];
        result[1] = lank[win_count];
        return result;
    }
    
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = lottoWinPredict(lottos, win_nums);
        return answer;
    }
}