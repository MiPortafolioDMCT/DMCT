<?php
class CorteModel {
    
    function createCorte($nombre,$costo) {
        $conexionModel = new ConexionModel();
        $conexion = $conexionModel->connect();

        $query = "insert into corte (nombre, costo) values ('$nombre','$costo');";
        $stmt = $conexion->prepare($query);
        $stmt->execute();
    }
    function readCorte() {
        try{
            $conexionModel = new ConexionModel();
            $conexion = $conexionModel->connect();
            
            $query = "SELECT * FROM corte";
            $stmt = $conexion->prepare($query);
            $stmt->execute();
    
            $result = $stmt->fetchAll(PDO::FETCH_ASSOC);
    
            $conexion = null;
    
            return $result;
        } catch (PDOException $e) {
            die("Error en la consulta: " . $e->getMessage());
        }
    }
    function updateCorte() {}
    function deleteCorte() {}
}
?>