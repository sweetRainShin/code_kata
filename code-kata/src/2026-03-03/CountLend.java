import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 1. 정렬 (그리디 적용을 위해 필수)
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 2. 여벌이 있지만 도난당한 학생 처리 (lost와 reserve에서 동시에 제거)
        int answer = n - lost.length;

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1; // 학생 번호로 나올 수 없는 값으로 치환
                    reserve[j] = -1;
                    break;
                }
            }
        }

        // 3. 체육복 빌려주기
        for (int l : lost) {
            if (l == -1)
                continue; // 이미 본인이 본인걸 쓴 경우 패스

            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] == -1)
                    continue;

                // 앞번호(l-1)나 뒷번호(l+1)인 경우에만 빌려줌
                if (reserve[j] == l - 1 || reserve[j] == l + 1) {
                    answer++;
                    reserve[j] = -1; // 빌려줬으므로 -1로 치환
                    break;
                }
            }
        }

        return answer;
    }
}