function solution(q, r, code) {
    var answer = '';
    let codeArr = code.split('')
    answer = codeArr.filter((v,i)=> {
        return i % q === r
    })
    return answer.join('');
}