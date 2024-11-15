function solution(n) {
    let index = [0,0]
    let direction = [[0,1], [1,0], [0,-1], [-1,0]]
    let dIdx = 0 //direction 인덱스 상하좌우
    let value = 1
    var answer = Array.from({ length: n},()=>new Array(n).fill(0))
    //초기값 설정 완료
    function rotate() {
        dIdx = (dIdx + 1) % 4;
    }
    function moveAndInsert() {
        answer[index[0]][index[1]] = value++;
        let next = index.map((v,i)=>v+direction[dIdx][i])
        //범위 밖으로 나가면
        if(next[0] < 0 || next[0] >= n || next[1] < 0 || next[1] >= n || 
            answer[next[0]][next[1]] !== 0) {
            rotate()
            next = index.map((v,i)=>v+direction[dIdx][i])
        }
        index = next
    }
    
    while(value<=n*n)
        moveAndInsert()
    
    return answer;
}

//move(이동불가능 시 우하좌상으로 방향 변경)
//fill
    
/*
0,0  0,1  0,2
1,0  1,1  1,2
2,0  2,1  2,2
*/