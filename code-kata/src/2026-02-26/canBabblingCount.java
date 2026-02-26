class Solution {
    public int babblingCount(String[] babbling) {
        int canBabblingCount = 0;
        String[] canBabbling = { "aya", "ye", "woo", "ma" };
        for (String b : babbling) {
            Boolean cannot = false;
            for (String c : canBabbling) {
                if (b.contains(c + c)) {
                    cannot = true;
                    break;
                }
            }

            if (!cannot) {
                for (String c : canBabbling) {
                    b = b.replace(c, " ");
                }

                if (b.trim().length() == 0)
                    canBabblingCount++;
            }
        }

        return canBabblingCount;
    }

    public int solution(String[] babbling) {
        int answer = babblingCount(babbling);
        return answer;
    }
}