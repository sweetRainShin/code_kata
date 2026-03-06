import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        // 1. 모든 성격 유형의 점수를 0으로 초기화
        Map<Character, Integer> map = new HashMap<>();
        char[] types = { 'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N' };
        for (char t : types)
            map.put(t, 0);

        // 2. 질문 결과를 토대로 점수 합산
        for (int i = 0; i < survey.length; i++) {
            int choice = choices[i];

            if (choice < 4) { // 비동의 관련 (첫 번째 문자)
                char type = survey[i].charAt(0);
                map.put(type, map.get(type) + (4 - choice));
            } else if (choice > 4) { // 동의 관련 (두 번째 문자)
                char type = survey[i].charAt(1);
                map.put(type, map.get(type) + (choice - 4));
            }
        }

        // 3. 지표별로 최종 성격 유형 결정
        StringBuilder answer = new StringBuilder();
        answer.append(map.get('R') >= map.get('T') ? 'R' : 'T');
        answer.append(map.get('C') >= map.get('F') ? 'C' : 'F');
        answer.append(map.get('J') >= map.get('M') ? 'J' : 'M');
        answer.append(map.get('A') >= map.get('N') ? 'A' : 'N');

        return answer.toString();
    }
}