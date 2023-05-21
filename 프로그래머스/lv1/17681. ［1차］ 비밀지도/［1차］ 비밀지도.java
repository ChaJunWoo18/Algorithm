class Solution {
    public String fill(String a, int n) {
        String s = "";
        for(int i = n - a.length()-1;i>=0;i--) {
            s += "0";
        }
        return s+a;
    }
    public String compare(String a, String b) {
        String s= "";
        for(int i=0;i<a.length();i++) {
            if(a.substring(i,i+1).equals("0") && b.substring(i,i+1).equals("0"))
                s += " ";
            else
                s += "#";
        }
        return s;
    }
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] ar1 = new String[n];
        String[] ar2 = new String[n];
        for(int i=0;i<n;i++) {
            ar1[i] = Integer.toString(arr1[i],2);
            ar2[i] = Integer.toString(arr2[i],2);
        }
        char[] c1 = {};
        for(int i=0;i<n;i++) {
            if(ar1[i].length()!=n) ar1[i] = fill(ar1[i],n);
            if(ar2[i].length()!=n) ar2[i] = fill(ar2[i],n);
            answer[i] = compare(ar1[i],ar2[i]);
        }
        return answer;
    }    
}