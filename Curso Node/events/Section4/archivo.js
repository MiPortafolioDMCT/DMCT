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

function getUserById(id, callback) {
    const user = usersDb.find(user => user.id === id);
    if(!user){
        const error = new Error();
        error.message = "User not found!";
        return callback(error);
    }

    callback(null, user);
}

function getPositionById(id, callback) {
    const position = positionsDb.find(position => position.id === id);
    if(! position){
        const error = new Error();
        error.message = "Position not found!";
        return callback(error);
    }

    callback(null, position);
}

getUserById(1, (err, user) => {
    if(err) {
        return console.log(err.message);
    }
    
    getPositionById(user.positionId, (err, position) => {
        if(err){
            return console.log(err.message);
        }
    
        console.log(`este usuario ${user.name} tiene un cargo de  ${position.name}`);
    });

    return console.log(user);
});