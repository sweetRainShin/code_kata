import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        Map<String, Integer> currentMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            currentMap.put(discount[i], currentMap.getOrDefault(discount[i], 0) + 1);
        }

        if (wantMap.equals(currentMap))
            answer++;

        for (int i = 0; i < discount.length - 10; i++) {
            String outItem = discount[i];
            String inItem = discount[i + 10];


            currentMap.put(outItem, currentMap.get(outItem) - 1);
            if (currentMap.get(outItem) == 0) {
                currentMap.remove(outItem);
            }

            currentMap.put(inItem, currentMap.getOrDefault(inItem, 0) + 1);

            if (wantMap.equals(currentMap))
                answer++;
        }

        return answer;
    }
}