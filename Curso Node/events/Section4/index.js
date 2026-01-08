// //VARIABLES -----------------------------------------
// var catName = "garfield";
// let myAge = 22;
// const PI = 3.1416;

//CONDICIONALES-----------------------------------------
// const age = 45;
// const calification = 40;

// if(calification >= 90 ){
//     console.log("A");
// } else if(calification >= 80 && calification < 90 ){
//     console.log("B");
// }else if(calification >= 70 && calification < 60 ){
//     console.log("C");
// }else {
//     console.log("reproado");
// }

// const operation = "add";
// let n1 = 80;
// let n2 = 60;
// switch(operation) {
//     case "add":
//         console.log(n1 + n2);
//         break;
//     case "subs":
//     console.log(n1 - n2);
//     break;
//     default:
//         console.log(n1 + n2);
//         break;
// }


//OBJETOS--------------------------------------------------
// const person = {}; //objeto persona que se le asigna un objeto vacio

// LOS PROPERTIES DE UN OBJECT VAN SEPARADOS DE UNA COMA
// const person = {
//     name: 'Dulce',
//     lastname: 'Cabrera'
// };

// acceder a las propiedades 
// console.log(person.name);

// let prop = "Dulce Mar";
// const person = {
//     [prop]: 'Dulce',
//     lastname: 'Cabrera'
// };

// console.log(person[prop]);


// const person = {
//     name: "Dulce",
//     lastname: "Cabrera",
//     isStudent:true,
//     getFullName() {
//         return this.name + " " + this.lastname;
//     }
// };

// console.log(person.getFullName());


// ////////////////////////////////////////////////////////

// class Person {
//     constructor(name) {
//         this.name = name;
//     }

//     getName() {
//         return this.name;
//     }
// }

// const person = new Person("Dulce");
// let name = person.getName();
// console.log(name);

// ////////////////////////////////////////////////////////////////

// COLECCIONEES
//ARRAY, TIPO DE COLECCION

//const fruits = new Array() // esto casi no se ve 
// const fruits = [
//     "apple", 
//     "melon", 
//     "mango", 
//     function(){
//         console.log("Hola");
//         return 1;
//     }
// ];

// console.log(fruits[1]);
// console.log(fruits[3]()); //funcion anonima en un array

//SET ---> TIPO DE COLECCION 
//SE USA PARA COLECCIONAR SIN REPETIR EL MISMO VALOR
// const numbers = new Set();
// numbers.add(5);
// numbers.add(5);
// numbers.add(6);

// console.log(numbers); //numbers. y manda a trer funciones que tienen

//MAP ----> TIPO DE COLECCION
//cuando se necesita hacer una coleccion que no se repitan pero que necesiten una key
//admite un key y un value
// const students = new Map();
// students.set("one", "marluan");

// console.log(students.get("one")); 

///////////////////////////////////////////////////////////////////////

//BUCLES

//const fruits = ["apple", "melon", "mango"];

// for(let i = 0; i < fruits.length; i++) {
//     console.log(fruits[i]);
// }

// for(const fruit of fruits) {
//     console.log(fruit);
// }

// const people = [{name: "marluan"}, {name: "hernesto"}];

// for (const person in people){
//     console.log(people[person].name);
// }

// let iterator = 0;
// while (iterator < people.length) {
//     console.log(people[iterator]);
//     iterator++;
// }

// let iterator = 50;
// do {
//     console.log(people[0]);
// } while (iterator < people.length);


///////////////////////////////////////////////////////////////
//FUNCIONES

// function greet() {
//     console.log("Hi");
// }
// // console.log(greet("Marluan"));
// function logGreeting(fn) { //pasa por parametro una funcion
//     fn();
// }

// logGreeting(greet);

// const greetMe = function(name) { //podemos almacenar la funcion en una varable 
//     console.log(`Hola ${name}`); // una forma de concatenar
// };

// greetMe("Juan");

//FUNCIONES DE FLECHA
// const greetMe = name => console.log(`Hola ${name}`); 

// greetMe("Juan");

/////////////////////////////////////////////////////////////////////////////////////7
//CALLBACK
//USO DE CALLBACKS: Muchas de las funciones del core de Node.js estan basadas en callbacks
//no obstante, a partir de la versión ES6 se ha simplificado el código con el uso de las promesas.
//Usa los callbacks lo menos posible para mantener un código limpio

//--VENTAJAS
//SIMPLE: son conceptualmente simples. pasas una funcion que uieras que se ejecute despues
//UNIVERSAL: corren donde sea. no requiere de un transpilador
//--DESVENTAJAS
//COMPOSICION TOSCA: las llamadas anidadas pueden llevar a realizar un codigo con aun mas anudades dentro (callback hell)
//FLUJO POCO INTUITIVO: requieren que te muevas dentro del código para comprender el flujo del mismo

//setTimeout(function, time, arg?) es una funcion que recibe una funcion por parametro, puede o no recibir parametros
// setTimeout(function(){
//     console.log(`Hello world`)
// }, 2000);

// function calculate(n1, n2, operation) {
//     return operation(n1, n2);
// }

// function add(n1, n2) {
//     return n1 + n2;
// }

// const result = calculate(1, 8, add);
// console.log(result);


///////////////////////////////////////////////////////////////////////////////
//PRACTICA CALLBACK

// const booksDb = [
//     {
//         id: 1,
//         title: "Clean Code"
//     },
//     {
//         id: 2,
//         title: "The pragmantic programmer"
//     },
//     {
//         id: 3,
//         title: "Web Development with Node.js"
//     }
// ]

// function getBookById(id, callback) {
//     const book = booksDb.find(book => book.id === id);
//     if(!book){
//         const error = new Error();
//         error.message = "Book not found!";
//         return callback(error);
//     }

//     callback(null, book);
// }

// getBookById(20, (err, book) => {
//     if(err) {
//         return console.log(err.message);
//     }
//     return console.log(book);
// });


////////////////////////////////////////////////////////////////
//CALLBACK HELL

// const booksDb = [
//     {
//         id: 1,
//         title: "Clean Code",
//         authorId: 1
//     },
//     {
//         id: 2,
//         title: "The pragmantic programmer",
//         authorId: 2
//     },
//     {
//         id: 3,
//         title: "Web Development with Node.js",
//         authorId: 3
//     }
// ]

// const authorsDb = [
//     {
//         id: 1,
//         name: "Robert C. Martin"
//     },
//     {
//         id: 2,
//         name: "Steve Forest"
//     }
// ];

// function getBookById(id, callback) {
//     const book = booksDb.find(book => book.id === id);
//     if(!book){
//         const error = new Error();
//         error.message = "Book not found!";
//         return callback(error);
//     }

//     callback(null, book);
// }

// function getAuthorById(id, callback) {
//     const author = authorsDb.find(author => author.id === id);
//     if(!author){
//         const error = new Error();
//         error.message = "Author not found!";
//         return callback(error);
//     }

//     callback(null, author);
// }

// getBookById(1, (err, book) => {
//     if(err) {
//         return console.log(err.message);
//     }
    
//     getAuthorById(book.authorId, (err, author) => {
//         if(err){
//             return console.log(err.message);
//         }
    
//         console.log(`This book ${book.title} was written by ${author.name}`);
//     });

//     return console.log(book);
// });


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//PROMESASSS
//VENTAJAS
//FACILMENTE ENLAZABLE: Se pueden enlazar fácilmente para manejar flujos asincronos complejos 
//sin tener que recurrir a más anidaciones como se requieren en callback
//PODEROSO: Proporcionan una capacidad excepcional para componer operaciones asincronas complejas

//DESVENTAJAS
//EXCEPCIONES QUE DESAPARECEN: Se debe declarar .catch() para manejar errores en lugar del tradicional try/catch

//sincronia- ejefutar codigo linea por linea 
//asincrinoa- se pueden ejecutar varios metodos y tardar su tiempo sin que afecte lo demas 

//el objeto tiene 3 metodos
// .then() //en este viene la data siempre y cuando invoca el resolve
// .catch() // va a venir el error cuando invoca a reject, cuando haya ocurrido un error
// .finally() //siempre se ejecuta haya error o no
// const promese = new Promise(executor); //executor es una funcion callback

// function executor(resolve, reject) {
//     //si funciona 
//     resolve();
//     //si falla
//     reject();
// }

//PRACTICA PROMESAS
// const booksDb = [
//     {
//         id: 1,
//         title: "Clean Code",
//         authorId: 1 
//     },
//     {
//         id: 2,
//         title: "The pragmantic programmer",
//         authorId: 2
//     },
//     {
//         id: 3,
//         title: "Web Development with Node.js",
//         authorId: 3
//     }
// ];

// const authorsDb = [
//     {
//         id: 1,
//         name: "Robert C. Martin"
//     },
//     {
//         id: 2,
//         name: "Steve Forest"
//     }
// ];

// function getBookById(id) {
//     return new Promise((resolve, reject) => {
//         const book = booksDb.find(book => book.id === id);
//         if(!book){
//             const error = new Error();
//             error.message = "Book not found!";
//             reject(error);
//         }

//         resolve(book);
//     });
// }

// function getAuthorById(id) {
//     return new Promise((resolve, reject) => {
//         const author = authorsDb.find(author => author.id === id);
//         if(!author){
//             const error = new Error();
//             error.message = "Author not found!";
//             reject(error);
//         }
//         resolve(author);
//     });    
// }

// getBookById(1)
// .then(book => {
//     return getAuthorById(book.id);  
// })
// .then(author => {
//     console.log(author);
// })
// .catch(error => {
//     console.log(error.message);
// })

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//async y await

const booksDb = [
    {
        id: 1,
        title: "Clean Code",
        authorId: 1 
    },
    {
        id: 2,
        title: "The pragmantic programmer",
        authorId: 2
    },
    {
        id: 3,
        title: "Web Development with Node.js",
        authorId: 3
    }
];

const authorsDb = [
    {
        id: 1,
        name: "Robert C. Martin"
    },
    {
        id: 2,
        name: "Steve Forest"
    }
];

async function getBookById(id) {
    const book = booksDb.find(book => book.id === id);
    if(!book){
        const error = new Error();
        error.message = "Book not found!";
        throw error;
    }

    return book;
}

async function getAuthorById(id) {
    const author = authorsDb.find(author => author.id === id);
    if(!author){
        const error = new Error();
        error.message = "Author not found!";
        throw error;
    }

    return author;
}

async function  main() {
    try{
        const book = await getBookById(1);
        const author = await getAuthorById(10);
        console.log(`This book ${book.title} was written by ${author.name}`);
    }catch(ex){
        console.log(ex.message);
    }
    
}

main();
