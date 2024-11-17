function solution(arr) {
    var answer = 0;
    function gcd(a, b) {
        while(b!==0) {
            const tmp = b;
            b=a%b;
            a=tmp;
        }
        return a;
    }
    function lcm(a,b) {
        return a*b / gcd(a,b)
    }
    return arr.reduce((a,b)=> lcm(a,b))
}

//최소공배수 : a*b / (a,b의 최대공약수)