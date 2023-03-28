class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int j=0;
        int[] minus=new int[array.length];
        for(int i=0;i<array.length;i++){
            int tmp=array[i]-n;
            minus[i]=Math.abs(tmp);
        }// minus[] == n을 뺀 값의 절대값
        int min=minus[0];
        for(int k=1;k<minus.length;k++){
            if(min>minus[k]){
                min=minus[k];
                j=k;
            }//작은 값을 찾음
            else if(min==minus[k]){
                min=minus[k];
                if(array[k]>array[j])
                    j=j;
                else
                    j=k;
            }//

        }
        answer=array[j];
        return answer;
    }
}