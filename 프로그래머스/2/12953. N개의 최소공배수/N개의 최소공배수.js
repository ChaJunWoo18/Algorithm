function solution(arr) {
    var answer = 0;
    function gcd(a,b) { //최대공약수
        while(b!==0) {
            const tmp = b;
            b = a % b 
            a = tmp
        }
        return a
    }
    function lcm(a,b) {
       return a*b / gcd(a,b)
    }
    answer = arr.reduce((a,b)=> lcm(a,b))
    return answer;
}