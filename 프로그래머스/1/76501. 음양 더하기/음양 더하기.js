function solution(absolutes, signs) {
    let sum = 0;
    let i = 0;
    for(const sign of signs) {
        if(sign) {
            sum += absolutes[i++];
        } else {
            sum -= absolutes[i++];
        }
    }
    return sum;
}