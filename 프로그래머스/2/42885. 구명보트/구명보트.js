function solution(people, limit) {
    var answer = 0;
    arr = people.sort((a,b)=> a-b)
    let left = 0
    let right = arr.length-1
    
    while(left <= right) {
        if(limit >= arr[left]+arr[right]) {
            left++
        }
        right--
        
        answer++
    }
    return answer;
}