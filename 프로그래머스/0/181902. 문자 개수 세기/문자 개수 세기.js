function solution(my_string) {
    var answer = new Array(52).fill(0);
    let strArr = my_string.split('')
    strArr.forEach((e) => {
        let ascii = e.charCodeAt(0); // 
        if (ascii >= 65 && ascii <= 90) {
          // 대문자 (A-Z)
          answer[ascii - 65]++;
        } else if (ascii >= 97 && ascii <= 122) {
          // 소문자 (a-z)
          answer[ascii - 71]++; // 소문자의 인덱스는 26부터 시작 (97 - 71 = 26)
        }
    })
    return answer;
}