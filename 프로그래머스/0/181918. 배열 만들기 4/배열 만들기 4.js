function solution(arr) {
    var stk = [];
    let i=0;
    while(i<arr.length) {
        if(stk.length===0) stk.push(arr[i++])
        else {
            let lastIdx = stk.length-1
            if(stk[lastIdx] < arr[i]) stk.push(arr[i++])
            else stk.pop()
        }
    }
    return stk;
}