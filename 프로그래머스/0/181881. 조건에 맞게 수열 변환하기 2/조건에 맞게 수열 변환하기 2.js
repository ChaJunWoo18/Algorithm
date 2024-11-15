function solution(arr) {
    var x =0;
    let pre = [...arr]
    while(true) {
        arr = arr.map((v)=> {
            if(v>=50 && v %2 ===0)
                return v / 2
            else if(v<50 && v %2===1) 
                return v * 2 + 1
            return v
        })
        if(pre.join(',') ==arr.join(',')) return x
        x++
        pre = arr
        
    }
}