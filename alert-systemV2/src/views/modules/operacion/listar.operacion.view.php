<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<div class="col-lg-12 grid-margin stretch-card">
    <div class="card">
        <div class="card-body">
            <h2 class="card-title text-center">Operaciones</h2>
            <p class="card-description"></p>
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">Código</th>
                            <th scope="col">Nombre de operación</th>
                            <th scope="col">Tiempo estandar</th>
                            <th scope="col">Costo</th>
                            <th scope="col">Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <?php
                        $OperacionController = new OperacionController();
                        $datos = $OperacionController->mostrarOperacion();
                        foreach ($datos as $operacion) {
                            echo '<tr>
                                <td>' . $operacion['id'] . '</td>
                                <td>' . $operacion['codigo'] . '</td>
                                <td>' . $operacion['nombre'] . '</td>
                                <td>' . $operacion['tiempo_estandar'] . '</td>
                                <td>' . $operacion['costo'] . '</td>
                                <td>
                                <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal'.$operacion['id'].'">Editar</button>

                                <!-- Modal Editar-->
                                    <div class="modal fade" id="exampleModal'.$operacion['id'].'" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                        <div class="modal-header">
                                            <h1 class="modal-title fs-5" id="exampleModalLabel">Editar Operacion</h1>
                                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                        </div>
                                        <div class="modal-body">

                                        <form action="" method="post">  
                                            <div class="form-group">
                                                <label>Nombre de la operacion: </label>
                                                <input type="text" class="form-control" id="nombre" name="nombre" value="'.$operacion['nombre'].'" required>
                                            </div>

                                            <div class="form-group">
                                                <label>Código: </label>
                                                <input type="text" class="form-control" id="codigo" name="codigo" value="'.$operacion['codigo'].'" required>
                                            </div>

                                            <div class="form-group">
                                                <label>Tiempo estándar: </label>
                                                <input type="date" class="form-control" id="tiempo_estandar" name="tiempo_estandar" value="'.$operacion['tiempo_estandar'].'" required>
                                            </div>

                                            <div class="form-group">
                                                <label>Costo: </label>
                                                <input type="number" id="costo" name="costo" step="0.01" min="0" value="'.$operacion['costo'].'" required>
                                            </div>

                                        
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Cancelar</button>
                                            <button type="button" class="btn btn-success">Guardar Cambios</button>
                                        </div>
                                        </div>
                                    </div>
                                    </div>

                                <button class="btn btn-danger eliminar-operacion" data-id="' . $operacion['id'] . '">Remover</button>
                                </td>
                            </tr>';
                        }
                        ?>
                    </tbody>
                </table>
            </div>
            <button id="btnIrMateriaPrima" class="btn btn-primary">Agregar Nueva Operación</button>
        </div>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<script>
    $(document).ready(function() {
        $('.eliminar-operacion').click(function() {
            var idOperacion = $(this).data('id');

            // Realizar la solicitud AJAX al controlador
            $.ajax({
                url: '/alert-systemv2/src/controllers/operacion.controller.php', // Ajusta la ruta según la ubicación real del controlador
                type: 'POST',
                data: {
                    idOperacion: idOperacion
                },
                dataType: 'json',
                success: function(response) {
                    // Manejar la respuesta del servidor, por ejemplo, mostrar un mensaje de éxito o error
                    if (response.success) {
                        alert('Operación eliminada con éxito.');
                        // Puedes recargar la página o actualizar la lista de operaciones de alguna manera
                    } else {
                        alert('Error al eliminar la operación.');
                    }
                },
                error: function() {
                    alert('Error en la solicitud AJAX.');
                }
            });
        });

        $('.btn-editar').click(function() {
            var idOperacion = $(this).data('id');

            // Obtener los datos de la fila seleccionada
            var codigo = $(this).closest('tr').find('td:eq(1)').text();
            var nombre = $(this).closest('tr').find('td:eq(2)').text();
            var tiempo_estandar = $(this).closest('tr').find('td:eq(3)').text();
            var costo = $(this).closest('tr').find('td:eq(4)').text();

            // Log para verificar si se están obteniendo los datos correctamente
            console.log('Datos obtenidos:', idOperacion, codigo, nombre, tiempo_estandar, costo);

            // Llenar los campos de la ventana modal con los datos actuales
            $('#codigo').val(codigo);
            $('#nombre').val(nombre);
            $('#tiempo_estandar').val(tiempo_estandar);
            $('#costo').val(costo);

            // Mostrar la ventana modal
            $('#exampleModal').modal('show');
        });

        // Función para guardar los cambios
        $('#btnGuardarCambios').click(function() {
            // Log para verificar si se está ejecutando la función
            console.log('Guardando cambios...');

            // Obtener los valores editados desde los campos del formulario
            var idOperacion = $('.btn-editar').data('id');
            var nuevosDatos = {
                codigo: $('#codigo').val(),
                nombre: $('#nombre').val(),
                tiempo_estandar: $('#tiempo_estandar').val(),
                costo: $('#costo').val()
            };

            // Log para verificar si se están obteniendo los datos correctamente
            console.log('Nuevos datos:', idOperacion, nuevosDatos);

            // Realizar la solicitud AJAX al controlador
            $.ajax({
                url: '/alert-systemv2/src/controllers/operacion.controller.php', // Ajusta la ruta según la ubicación real del controlador
                type: 'POST',
                data: {
                    idOperacion: idOperacion,
                    nuevosDatos: nuevosDatos
                },
                dataType: 'json',
                success: function(response) {
                    // Log para verificar la respuesta del servidor
                    console.log('Respuesta del servidor:', response);

                    // Manejar la respuesta del servidor, por ejemplo, mostrar un mensaje de éxito o error
                    if (response.success) {
                        alert('Operación actualizada con éxito.');
                        // Puedes recargar la página o actualizar la lista de operaciones de alguna manera
                    } else {
                        alert('Error al actualizar la operación.');
                    }

                    // Ocultar la ventana modal después de la actualización
                    $('#exampleModal').modal('hide');
                },
                error: function() {
                    alert('Error en la solicitud AJAX.');
                }
            });
        });

        document.getElementById('btnIrMateriaPrima').addEventListener('click', function() {
            window.location.href = '/alert-systemV2/nueva-operacion';
        });
    });
</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
