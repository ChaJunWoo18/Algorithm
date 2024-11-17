function solution(brown, yellow) {
    const total = brown+yellow
    //total = width * height
    //height <= width, height최소값은 3
    for(let height=3;height<=Math.sqrt(total);height++) {
        if(total % height===0) {
            const width = total/height
            if((width-2) * (height-2) === yellow) {
                return [width,height]
            }
        }
    }
}