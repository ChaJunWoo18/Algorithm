import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        Arrays.sort(nums);
        int max = nums[nums.length-1] + nums[nums.length-2] + nums[nums.length-3];
        boolean[] check = new boolean[max+1];
        Arrays.fill(check, true);
        check[0] = check[1] = false;
        //소수 찾기
        for(int i=2;i<= (int)Math.sqrt(max);i++) {
            if(check[i]) {
                for(int j=i*i;j<=max;j+=i)
                    check[j] = false;
            }
        }
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                for(int k=j+1;k<nums.length;k++) {
                    if(check[nums[i]+nums[j]+nums[k]]) 
                        answer++;
                }
            }
        }
        return answer;
    }
}