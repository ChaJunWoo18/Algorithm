function solution(a, b) {
    var answer = '';
    function val() {
        return (BigInt(a)+BigInt(b)).toString()
    }
    answer = val()
    return answer;
}