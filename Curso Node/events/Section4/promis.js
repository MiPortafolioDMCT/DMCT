const usersDb = [
    {
        id: 1,
        name: "Dulce",
        positionId: 1
    },
    {
        id: 2,
        name: "Maria",
        positionId: 2
    },
    {
        id: 3,
        name: "Sofia",
        positionId: 3
    }
]

const positionsDb = [
    {
        id: 1,
        name: "Jefe"
    },
    {
        id: 2,
        name: "supervisor"
    }
];

const getUserById = (id) => {
    return new Promise((resolve, reject) => {
        const user = usersDb.find((user) => user.id = id);

        if (user) {
            resolve(user);
        } else {
            const error = new Error();
            error.message = 'Usuario no encontrado';
            error.code = 404;
            error.status = 'Not found';

        reject(error);
        }
    });
}

getUserById(11).then(user => {
    console.log(`El usuario es ${user.name}`);
}).catch(error => {
    console.log(error.message);
}).finally();








const books = [
    {
        id: 1,
        name: 'Un saco de huesos',
        author: 1,
        genero: 1
    },
    {
        id: 1,
        name: 'DB',
        author: 2,
        genero: 2
    },
    {
        id: 1,
        name: 'Estructuras de datos I',
        author: 3,
        genero: 3
    }
]
 

const getBookById = (id) => {
    return new Promise((resolve, reject) => {
        const data = books.find((book) => book.id == id);

        if (data) {
            resolve(data);
        } else {
            const error = new Error();
            error.message = 'Libro no encontrado';
            error.code = 404;
            error.status = 'Not found';

            reject(error);
        }
    });
}

getBookById(10).then(book => {
    console.log(`El libro encontrado es ${book.name}`);
}).catch(error => {
    console.log(error.message);
}).finally();