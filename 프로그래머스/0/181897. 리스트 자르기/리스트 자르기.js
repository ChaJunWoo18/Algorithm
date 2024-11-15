function solution(n, slicer, num_list) {
    var answer = [];
    if(n===1) {
        return num_list.slice(0, slicer[1]+1)
    } else if(n===2) {
        return num_list.slice(slicer[0])
    } else if(n===3) {
        return num_list.slice(slicer[0], slicer[1]+1)
    }
    return num_list.slice(slicer[0], slicer[1]+1).filter((x,i)=> {if(i%2==0) return x});
}