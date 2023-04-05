class Solution {
    public int solution(int[][] dots) {
        int maxx = dots[0][0], minx=dots[0][0], maxy=dots[0][1], miny= dots[0][1];
        for(int i=1;i<dots.length;i++) {
            if(maxx<dots[i][0])
                maxx = dots[i][0];
            if(minx>dots[i][0])
                minx =dots[i][0];
            if(maxy<dots[i][1])
                maxy = dots[i][1];
            if(miny>dots[i][1])
                miny = dots[i][1];
        }
        int x=maxx-minx;
        int y = maxy-miny;
        return x*y;
    }
}