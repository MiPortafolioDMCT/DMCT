//Types
let framework: string = "angular";
const isProduction: boolean = true;
const PORT: number = 3000;
const styles: Array<string> = ["./css/style.css"];

const sayHello: Function = (name: string): string => `Hello ${name}`;
const value: string = sayHello("Dulce");
console.log(value);