function solution(k, tangerine) {
    var answer = 0;
    const arr = new Array(10000001).fill(0) 
    for(let i of tangerine) { 
        arr[i] += 1
    }
    arr.sort((a,b)=> b-a)
    for(let el of arr) {
        k-=el
        answer++
        if(k<=0) return answer
    }
    return answer;
}

//서로 다른 종류가 최소
//같은 종류를 많이 담아라