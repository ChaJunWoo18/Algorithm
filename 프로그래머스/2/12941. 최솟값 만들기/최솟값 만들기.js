function solution(A,B){
    var answer = 0;
    A.sort((a,b)=> a-b)
    B.sort((a,b)=> b-a)
    let len = [...A]
    for(let i in A) {
        answer += A[i] * B[i]
    }
    
    return answer;
}

//가장 작은값과 가장 큰값이 만나도록