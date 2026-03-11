class Solution {
    public int[] solution(String[] wallpaper) {
        // 좌표의 범위를 제한 사항에 맞춰 초기화
        int lux = 50, luy = 50;
        int rdx = 0, rdy = 0;

        for (int r = 0; r < wallpaper.length; r++) {
            for (int c = 0; c < wallpaper[r].length(); c++) {
                // 파일("#")을 발견하면 상하좌우 경계 갱신
                if (wallpaper[r].charAt(c) == '#') {
                    lux = Math.min(lux, r); // 가장 위쪽 행
                    luy = Math.min(luy, c); // 가장 왼쪽 열
                    rdx = Math.max(rdx, r + 1); // 가장 아래쪽 행 + 1
                    rdy = Math.max(rdy, c + 1); // 가장 오른쪽 열 + 1
                }
            }
        }

        return new int[] { lux, luy, rdx, rdy };
    }
}