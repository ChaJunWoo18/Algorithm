function solution(s){
    var answer = true;
    let arr = s.split('')
    let stack = [];
    for(let x of arr) {
        if(x==='(') stack.push(x)
        else if(x === ')') {
            if( stack.length ===0) 
                return false
            stack.pop()
        }
    } 
    if(stack.length!==0) return false
    return answer;
}