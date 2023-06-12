class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0, idx2 = 0;
        for(int i=0;i<goal.length;i++) {
            if(cards1.length > idx1 && goal[i].equals(cards1[idx1]))
                idx1++;
            else if(cards2.length > idx2 && goal[i].equals(cards2[idx2]))
                idx2++;
            else
                return "No";
        }
        return "Yes";
    }
}