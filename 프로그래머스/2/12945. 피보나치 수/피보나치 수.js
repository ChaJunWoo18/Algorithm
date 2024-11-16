function solution(n) {
    let arr = [0,1]
    for(let i=2;i<=n;i++) {
        let len = arr.length
        let res = (arr[len-2]%1234567+arr[len-1]%1234567)%1234567
        arr.push(res)
    }
    return arr[arr.length-1];
}