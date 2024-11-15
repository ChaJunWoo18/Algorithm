function solution(str_list) {
    let lIdx = str_list.indexOf('l')
    let rIdx = str_list.indexOf('r')
    if(lIdx===-1 && rIdx === -1) return [];
    if(lIdx !== -1 && (rIdx === -1 || lIdx < rIdx)) { //l이 먼저면
        return str_list.slice(0, lIdx)
    } else {
        return str_list.slice(rIdx+1)
    }
}