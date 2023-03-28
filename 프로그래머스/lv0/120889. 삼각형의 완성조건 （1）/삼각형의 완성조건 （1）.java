class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int res = 0;
        int max = 0;
        int cnt=0;
        if(sides[0]==sides[1]&&sides[1]==sides[2])
            return 1; // 정삼각형이므로 바로 return
        for(int i=0;i<sides.length;i++) {
            if(max<sides[i]) {
                max = sides[i];
            }
        }
        for(int i=0;i<sides.length;i++) {
            if(max!=sides[i]) {
                res += sides[i];
            }
            if(max==sides[i]){
                cnt++;
            }
        }
        if(cnt==2)
            return 1;
        if(res<=max)
            return 2;
        else 
            return 1;
    }
}