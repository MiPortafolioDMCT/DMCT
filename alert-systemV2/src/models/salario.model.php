<?php
class SalarioModel
{
    // Funcion para CRUD a la BD de SALARIO
    function createSalario() {}
    function readSalario() {
        try {
            $conexionModel = new ConexionModel();
            $conexion = $conexionModel->connect();

            $query = "SELECT salario.*, persona.nombre AS nombre_persona FROM salario
                      JOIN persona ON salario.persona_id = persona.id";

            $stmt = $conexion->query($query);
            $stmt->execute();
            $resultados = $stmt->fetchAll(PDO::FETCH_ASSOC);

            return $resultados;
        } catch (Exception $e) {
            return 'error';
        }
    }
    function updateSalario() {}
    function deleteSalario() {}
}
?>


