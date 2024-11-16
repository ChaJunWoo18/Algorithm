function solution(s)
{
    var answer = 0;
    let arr = s.split('')
    let stack = []
    for(let i=0;i<arr.length;i++) {
        if(stack.length >0 && (arr[i]===stack[stack.length-1])) {
            stack.pop()
        } else{
            stack.push(arr[i])
        }
    }
    if(stack.length===0) return 1
    return answer;
}