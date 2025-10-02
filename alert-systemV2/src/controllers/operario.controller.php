<?php
 class operacionesController
 {
    public function mostrarOperaciones(){
        $operarioModel = new operarioModel();
        $operarioModel->readOperaciones();
        $respuesta = $operarioModel->readOperaciones();

        if($respuesta !== 'error'){
            return $respuesta;
        }else{
            return [];
        }
    }

 }

 ?>