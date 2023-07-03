class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int[] arX= new int[10];
        int[] arY= new int[10];
        for(int i=0;i<X.length();i++)
            arX[Integer.parseInt(X.substring(i,i+1))]++;
        for(int i=0;i<Y.length();i++)
            arY[Integer.parseInt(Y.substring(i,i+1))]++;
        for(int i=9;i>=0;i--) {
            while(arX[i]>0 && arY[i]>0) {
                sb.append(i);
                arX[i]--; arY[i]--;
            }
        }
        if(sb.toString().equals("")) return "-1";
        else if(sb.toString().substring(0,1).equals("0")) return "0";
        else return sb.toString();
    }
}