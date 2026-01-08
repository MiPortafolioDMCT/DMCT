//NUESTRO PROPIO EMISOR DE EVENTOS
// const Emitter = require('./emitter');
// const emitter = new Emitter();
// emitter.on("save", () => {
//     console.log("On save activated 1");
// });
// emitter.on("save", () => {
//     console.log("On save activated 2");
// });
// emitter.emit("save");

const { EventEmitter } = require("events");
const { SAVE } = require("./events-names");

const emitter = new EventEmitter();

emitter.on("save", () => {
    console.log("On save activated 1");
});

emitter.on("save", () => {
    console.log("On save activated 2");
});

emitter.emit("save");