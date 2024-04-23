class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = multiply(arr1, arr2);
        return answer;
    }
    public int[][] multiply(int[][]A,int[][]B) {
        int m = A.length;
        int n = A[0].length;
        int p = B[0].length;
        
        int[][] C = new int[m][p];
        
        for(int i=0;i<m;i++) {
            for(int j=0;j<p;j++) {
                for(int k=0;k<n;k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }
}