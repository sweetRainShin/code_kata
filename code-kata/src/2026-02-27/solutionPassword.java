class Solution {

    public String getAnswer(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        String alphabets = "";
        for (char c = 'a'; c <= 'z'; c++) {
            if (!skip.contains(String.valueOf(c))) {
                alphabets += c;
            }
        }

        for (char c : s.toCharArray()) {
            int nowIndex = alphabets.indexOf(c);
            nowIndex = (nowIndex + index) % alphabets.length();
            sb.append(alphabets.charAt(nowIndex));
        }
        return sb.toString();
    }

    public String solution(String s, String skip, int index) {
        String answer = getAnswer(s, skip, index);
        return answer;
    }
}