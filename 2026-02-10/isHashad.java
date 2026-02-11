class Solution {
    public boolean isHashad(int x) {
        int sum = 0;
        int num = x;

        while (num > 0) {
            sum += num % 10;
            num /= 10;       
        }

        return x % sum == 0;
    }
    public boolean solution(int x) {
        boolean answer = isHashad(x);
        return answer;
    }
}