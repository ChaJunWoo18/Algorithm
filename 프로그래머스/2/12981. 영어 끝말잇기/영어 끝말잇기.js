function solution(n, words) {
    var answer = [];
    const dup = new Set()//중복 체크용 set
    dup.add(words[0])
    let preLen = 1 
    for(let i=1;i<=words.length-1;i++) {
        dup.add(words[i])
        
        if(preLen >= dup.size) { // 중복이면
            //i번째 값이 몇 번째 번호인지, 몇 번째 사이클인지
            answer.push(i%n+1)
            answer.push(Math.ceil((i+1)/n))
            return answer
        }
        preLen++
        // console.log(preLen,dup.size)
        let el1 = words[i-1].substring(words[i-1].length-1)
        let el2 = words[i].substring(0,1)
        // console.log(el1, el2)
        if(el1!==el2) {
            answer.push(i%n+1)
            answer.push(Math.ceil((i+1)/n))
            return answer
        }
    }
    return [0,0]
}