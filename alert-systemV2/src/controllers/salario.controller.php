<?php
class SalarioController
{
    //Funciones para manipular los datos de SALARIO
    function agregarSalario() {}
    function mostrarSalario() {
        $salarioModel = new SalarioModel();
        $salarioModel->readSalario();
        $respuesta = $salarioModel->readSalario();

        if ($respuesta !== 'error') {
            return $respuesta;
        } else {
            return [];
        }
    }
    function modificarSalario() {}
    function eliminarSalario() {}
}
