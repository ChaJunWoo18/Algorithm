function solution(s) {
    let sArr = s.split(' ').map(x=> parseInt(x))
    let max = sArr.reduce((a,b)=> Math.max(a,b))
    let min = sArr.reduce((a,b)=> Math.min(a,b))
    return `${min} ${max}`
}