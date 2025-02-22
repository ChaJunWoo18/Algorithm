function solution(n) {
    var answer = 0;
    for(let x=2;x<n;x++) {
        answer = n % x;
        if(answer ===1){
            return x;
        }
    }
    return answer;
}