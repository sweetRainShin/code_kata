class Solution {
    private int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                count++;
            } else if (n % i == 0) {
                count += 2;
            }
        }
        return count;
    }

    public int getIronCount(int number, int limit, int power) {
        int totalWeight = 0;
        for (int i = 1; i <= number; i++) {
            int count = countDivisors(i);

            if (count <= limit)
                totalWeight += count;
            else
                totalWeight += power;
        }
        return totalWeight;
    }

    public int solution(int number, int limit, int power) {
        int answer = getIronCount(number, limit, power);
        return answer;
    }
}