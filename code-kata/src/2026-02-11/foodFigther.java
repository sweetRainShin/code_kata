class Solution {
    public String getArrangeFood(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            sb.append(String.valueOf(i).repeat(food[i]/2));
        }
        
        String leftString = sb.toString();
        return leftString + "0" + sb.reverse().toString();
    }
    public String solution(int[] food) {
        String answer = getArrangeFood(food);
        return answer;
    }
}