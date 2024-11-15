function solution(order) {
    var answer = 0;
    for(let o of order) {
        if(o.indexOf('cafe')!== -1) answer+= 5000
        else answer += 4500
        
    }
    return answer;
}