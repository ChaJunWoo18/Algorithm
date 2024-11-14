function solution(arr) {
    row= arr[0].length;
    col = arr.length;
    if(row===col) return arr;
    const maxSize = Math.max(row,col);

    for(let i=0;i<arr.length;i++) {
        while(arr[i].length<maxSize) {
            arr[i].push(0);
        }
    }
    while (arr.length < maxSize) {
        arr.push(new Array(maxSize).fill(0))
    }
    return arr;
}