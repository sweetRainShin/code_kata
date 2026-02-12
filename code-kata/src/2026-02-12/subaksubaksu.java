class Solution {
    public String getSuBakString(int n) {
        StringBuilder sb = new StringBuilder();
        String[] keywords = {"수", "박"};
        for (int i = 0; i < n; i++) {
            sb.append(keywords[i%2]);
        }
        return sb.toString();
    }
    public String solution(int n) {
        String answer = getSuBakString(n);
        return answer;
    }
}