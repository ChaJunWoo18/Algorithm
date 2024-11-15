function solution(arr, queries) {
    var answer = [];
    for(let q of queries) {
        let [s, e, k] = q;
        for(let i=s;i<=e;i++) {
            if(i % k == 0)
                arr[i] += 1
        }
        
    }
    return arr;
}