// let number = 0;
// number++;
// console.log("logger" + number);

function greet(name){
    console.log('Hola '+ name )
}

//module.exports = greet; //exporta
module.exports = {
    greet,
    number: 10
};