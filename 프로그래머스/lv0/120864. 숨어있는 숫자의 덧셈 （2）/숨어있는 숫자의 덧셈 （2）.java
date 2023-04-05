class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int num = 0, tmp=0;
        String str = "";
        String[] arr = my_string.split("");
        for(int i=0;i<arr.length;i++) {
            num = arr[i].charAt(0) - 48;
            if(num>=0 && num<=9) {
                str += num;
            }
            else if(num<0 || num >9) {
                if(!str.equals("")) {
                    answer+=Integer.parseInt(str);
                    str="";
                }
            }
            if(i==arr.length-1 && !str.equals(""))
                answer+=Integer.parseInt(str);
        }
        return answer;
    }
}