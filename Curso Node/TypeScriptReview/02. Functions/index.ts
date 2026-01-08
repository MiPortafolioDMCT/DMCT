function sum(a: number, b: number): number {
    return a + b;
}

function mathOeration(callback: Function, a: number, b: number): number {
    return callback(a, b);
}

const result: number = mathOeration
((a: number, b: number): number => a + b, 5, 5);

console.log(result);