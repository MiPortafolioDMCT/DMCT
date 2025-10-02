<div class="col-lg-12 grid-margin stretch-card">
    <div class="card">
        <div class="card-body">
            <h2 class="card-title text-center">Nombre de operarios
            </h2>
            <p class="card-description"></p>
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">Nombre de operario</th>
                        </tr>
                    </thead>
                    <tbody>
                        <?php
                        $UsuarioController= new UsuarioController();
                        $datos=$UsuarioController->mostrarUsuarioNombre();
                        foreach($datos as $UsuarioController){
                            echo '<tr>
                            <td>'.$UsuarioController['id_usuario'].'</td>
                            <td>'.$UsuarioController['nombre'].'</td>
                            <td>'.$UsuarioController['apellido_paterno'].'</td>
                            <td>'.$UsuarioController['apellido_materno'].'</td> 
                            <td>
                            <form action="/alert-systemV2/corte" method="post">
                                    
                            
                                <a>
                                <a href=#" class="btn btn-success" data-bs-toggle="modal" data-bs-target="#modalEditar">Registar progreso</a>
                                <button type="submit" class="btn btn-success" data-bs-toggle="modal" data-bs-target="#modalDetalles">Ver detalles</button>
                                </a>
                                <br>    
                            </form>
                            </td>
                            </tr>';
                        }
                        ?>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>