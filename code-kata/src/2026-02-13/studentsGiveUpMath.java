import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] getWinnerList(int[] answers) {
        int[] student1 = { 1, 2, 3, 4, 5 };
        int[] student2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] student3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        int[] scoreList = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (student1[i % student1.length] == answers[i])
                scoreList[0]++;
            if (student2[i % student2.length] == answers[i])
                scoreList[1]++;
            if (student3[i % student3.length] == answers[i])
                scoreList[2]++;
        }

        int maxScore = Arrays.stream(scoreList).max().orElse(0);
        List<Integer> winnerArr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (scoreList[i] == maxScore)
                winnerArr.add(i + 1);
        }

        return winnerArr.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] solution(int[] answers) {
        int[] answer = getWinnerList(answers);
        return answer;
    }
}