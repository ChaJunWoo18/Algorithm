function solution(arr, queries) {
    var answer = [];
    let res = queries.map((e)=>
        arr.slice(e[0], e[1]+1)
        .filter((x)=> x>e[2])
    )
    for(let el of res) {
        let value = el.length==0 ? -1 : Math.min(...el)
        answer.push(value)
    }
    return answer;
}