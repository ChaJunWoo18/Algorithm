function solution(rank, attendance) {
    let idxArr = rank
        .filter((e,i)=> attendance[i])
        .sort((a,b)=> a-b)
        .map((e)=> rank.findIndex((x)=> x === e))
    return idxArr[0] * 10000 + 100 * idxArr[1] + idxArr[2]
}

//3명 선정, 참여불가학생 있음
/*
1) 등수대로 정렬
2) 
*/