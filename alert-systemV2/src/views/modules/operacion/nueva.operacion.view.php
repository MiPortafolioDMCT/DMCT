<div class="col-lg-12 grid-margin stretch-card">
    <div class="card">
        <div class="card-body">
        <h4 class="card-title">Agregar nueva operación</h4>
        <form action="" method="post">  
        <div class="form-group">
            <label>Nombre de la operacion: </label>
            <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre" required>
        </div>

        <div class="form-group">
            <label>Código: </label>
            <input type="text" class="form-control" id="codigo" name="codigo" placeholder="Codigo" required>
        </div>

        <div class="form-group">
            <label>Tiempo estándar: </label>
            <input type="date" class="form-control" id="tiempo_estandar" name="tiempo_estandar" placeholder="tiempo_estandar" required>
        </div>

        <div class="form-group">
            <label>Costo: </label>
            <input type="number" id="costo" name="costo" step="0.01" min="0" placeholder="0.00" required>
        </div>

        <div class="form-group">
            <label>: </label>
            <input type="text" class="form-control" id="codigo" name="codigo" placeholder="Codigo" required>
        </div>

		<button type="submit" class="btn btn-primary" name="btnGuardar">Guardar</button>
        
        <button id="btnCancelar" class="btn btn-primary">Cancelar</button>
        <script>
            document.getElementById('btnCancelar').addEventListener('click', function() {
                window.location.href = '/alert-system/operaciones';
            });
        </script>
        <?php
            $OperacionController = new OperacionController();
            $OperacionController->agregarOperacion();
        ?>
	</form>
        </div>
    </div>
</div>
</div>