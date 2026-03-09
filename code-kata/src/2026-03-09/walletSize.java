class Solution {
    public int solution(int[][] sizes) {
        int max_w = 0;
        int max_h = 0;

        for (int[] size : sizes) {
            // 현재 명함에서 더 긴 쪽을 w, 더 짧은 쪽을 h로 설정
            int w = Math.max(size[0], size[1]);
            int h = Math.min(size[0], size[1]);

            // 각 그룹에서의 최댓값을 갱신
            max_w = Math.max(max_w, w);
            max_h = Math.max(max_h, h);
        }

        return max_w * max_h;
    }
}