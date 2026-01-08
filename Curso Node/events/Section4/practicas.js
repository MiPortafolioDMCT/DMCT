//base de datos de calzado
const calzadoDb = [
    {
        id: 1,
        nombre: "tenis"
    },
    {
        id: 2,
        nombre: "zapatillas"
    },
    {
        id: 3,
        nombre: "chanclas"
    }
];

//base de datos de personas
const personaDb = [
    {
        id: 1,
        nombre: "Dulce",
        apePat: "Cabrera",
        apeMat: "Teotan"
    },
    {
        id: 2,
        nombre: "Maria",
        apePat: "Caabrera",
        apeMat: "Teeotan"
    }
];

function obtenerPersona (id, callback) {
    const persona = personaDb.find(persona => persona.id === id);
    if(!persona) {
        const error = new Error();
        error.message = "no esta la persona";
        return callback(error);
    }
    callback(null, persona);
}

obtenerPersona(20, (err, persona) => {
    if(err) {
        return console.log(err.message);
    }
    return console.log(persona);
})