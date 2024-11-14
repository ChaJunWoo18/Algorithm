function solution(picture, k) {
    var answer = [];
    
    for (let row of picture){
        tmpStr = ''
        for(let e of row) {
            tmpStr+= e.repeat(k)
        }
        for(let i=0;i<k;i++)
            answer.push(tmpStr)
    }
    
    
    return answer;
}