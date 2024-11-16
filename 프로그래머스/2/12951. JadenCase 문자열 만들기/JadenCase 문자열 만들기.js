function solution(s) {
    var answer = '';
    s = s.toLowerCase()
    let words = s.split(' ')
    let arr = words.map((word)=>{
        return word ? word[0].toUpperCase() + word.slice(1).toLowerCase() : ''
    })
    return arr.join(' ');
}