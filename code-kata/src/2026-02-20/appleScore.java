import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        // 1. 사과 점수를 오름차순으로 정렬
        Arrays.sort(score);

        // 2. 뒤에서부터(큰 점수부터) m개씩 묶기
        // 뒤에서 m번째, 2m번째... 위치의 사과가 각 상자의 최저 점수(p)가 됩니다.
        for (int i = score.length - m; i >= 0; i -= m) {
            answer += score[i] * m;
        }

        return answer;
    }
}