function solution(l, r) {
    var answer = [];
    
    function generator(value) {
        if(r< value) return answer;
        if(l<=value) answer.push(parseInt(value))
        
        generator(value + '0')
        generator(value + '5')
    }
    
    generator(5)
    answer.sort((a,b)=> a-b)
    
    return answer.length===0? [-1] : answer;
}

//5, 50, 500, 505, 550, 555, 5550, 5555,...
//5이상의 수
//if (l<x && r>x)
