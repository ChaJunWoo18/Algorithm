class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};
        for(int i=0;i<babbling.length;i++) {
            for(int j=0;j<arr.length;j++) 
                babbling[i] = babbling[i].replace(arr[j], Integer.toString(j));
            try{
                if(Integer.parseInt(babbling[i])>=0) {                
                    System.out.println(i + " "+babbling[i]);
                    for(int k=0;k<babbling[i].length()-1;k++) {
                        if(babbling[i].substring(k,k+1).equals(babbling[i].substring(k+1,k+2))) {
                            answer--;
                            break;
                        }
                    }
                    answer++; 
                }
            } catch(Exception e) {
                continue;
            }
        }
        return answer;
    }
}