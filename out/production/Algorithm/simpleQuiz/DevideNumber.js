function solution(arr, divisor) {
    const answer = arr.filter(el => el % divisor === 0);
    return answer.length ? answer.sort((p, c) => p - c) : [-1];
}

console.log(solution([5,9,7,10], 5));