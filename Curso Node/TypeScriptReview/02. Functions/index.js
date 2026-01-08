"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function sum(a, b) {
    return a + b;
}
function mathOeration(callback, a, b) {
    return callback(a, b);
}
const result = mathOeration((a, b) => a + b, 5, 5);
console.log(result);
//# sourceMappingURL=index.js.map