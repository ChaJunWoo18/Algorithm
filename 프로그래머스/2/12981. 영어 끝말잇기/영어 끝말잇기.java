import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        int lastWordIdx = 0;
        List<String> wordList = new ArrayList<>();
        wordList.add(words[0]);
        for(int i=1;i<words.length;i++) {
            String preWord = wordList.get(i-1);
            if(wordList.contains(words[i]) || 
              !(preWord.substring(preWord.length()-1)
               .equals(words[i].substring(0,1)))) {
                lastWordIdx = i;
                break;
            }
            wordList.add(words[i]);
            if(wordList.size()==words.length)
                return answer;
        }
        if((lastWordIdx+1) % n == 0) {
            answer[0] = n;
            answer[1] = (lastWordIdx+1) / n;
        }
        else{
            answer[0] = (lastWordIdx+1) % n;
            answer[1] = (lastWordIdx+1) / n +1;
        }
        return answer;
    }
}