function solution(my_string, queries) {
    var answer = '';

    for(let q of queries) {
        answer = my_string.substring(0, q[0])
        let rev = (my_string.substring(q[0], q[1]+1)).split('').reverse().join('')
        let last = my_string.substring(q[1]+1)
        answer += rev + last
        my_string = answer
    }
    return answer;
}