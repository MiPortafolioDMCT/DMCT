const peras = [
    {id: 1, nombre: 'Pera'},
    {id: 2, nombre: 'Pera2'},
    {id: 3, nombre: 'Pera3'},
];

function getPeraById (id, callback) {
    const pera = peras.find((pera) => pera.id === id);

    if (!pera) {
        const error = new Error();
        error.code = 404;
        error.message = 'No se econtró la pera';

        callback(error, null);
    } else {
        callback(null, pera);
    }
}

getPeraById(10, (err, data) => {
    if (err) {
        console.log(err.message);
    } else {
        console.log(data.nombre);
    }
});