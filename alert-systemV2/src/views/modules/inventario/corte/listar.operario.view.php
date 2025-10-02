<div class="col-lg-12 grid-margin stretch-card">
    <div class="card">
        <div class="card-body">
            <h1 class="text-center">Usuario-Operario</h1>
            <div class="d-flex flex-column"> 
                <div class="d-flex justify-content-between mb-3"> 
                    <div class="card text-bg-dark mr-2" style="max-width: 18rem;">
                        <div class="card-header"><b>Produccion al momento</b></div>
                        <div class="card-body">
                            <input style="border:none" type="text" value="25"> pz
                        </div>
                    </div>

                    <div class="card text-bg-dark" style="max-width: 18rem;">
                        <div class="card-header"><b>Retraso</b></div>
                        <div class="card-body">
                            <input style="border:none" type="text" value="-5"> pz
                            <br>
                            <b>Total:</b> <input style="border:none" type="text" value="25-30">
                        </div>
                    </div>
                </div> 
               
            </div> 
        </div>
    </div>
</div>

<style>
    .new-card-container {
        display: flex;
        justify-content: flex-end;
    }
</style>


<div class="col-lg-12 grid-margin stretch-card">
    <div class="card">
        <div class="card-body">
            <div class="d-flex flex-column"> 
                <div class="d-flex justify-content-between mb-3"> 
                <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>Retraso</th>
                            <th>Operacion</th>
                            <th>Costo</th>
                            <th>N.piezas</th>
                            <th>Salario Real</th>
                            <th>Inc.</th>
                            <th>Salario con insentivo</th>
                        </tr>
                       <?php
                       $operacionesController = new operacionesController();
                       $datos = $operacionesController->mostrarOperaciones();
                       foreach ($datos as $operacionesController){
                        $costo = $operacionesController['costo'];
                            $piezas = $operacionesController['piezasprod'];
                            $salarioReal = $costo * $piezas;

                            $suledoconinsentivo=$operacionesController['porcentaje_incremento'];
                            $salarioFinal = ($salarioReal * $suledoconinsentivo / 100);

                        echo '<tr>
                                <td>'.$operacionesController['id'].'</td>
                                <td>'.$operacionesController['nombre'].'</td>
                                <td>'.$operacionesController['costo'].'</td>
                                <td>'.$operacionesController['piezasprod'].'</td>
                                <td>'.$salarioReal.'</td>
                                <td>'.$operacionesController['porcentaje_incremento'].'%'.'</td>
                                <td>'.$salarioFinal.'</td>
                        </tr>';
                       }

                       ?>
                </table>
            </div>
                </div> 
            </div> 
        </div>
    </div>
</div>