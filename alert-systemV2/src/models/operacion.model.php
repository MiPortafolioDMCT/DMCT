<?php
class OperacionModel {
    
    function createOperacion($nombre) {
        $conexionModel = new ConexionModel();
        $conexion = $conexionModel->connect();

        $query = "insert into operacion_corte (nombre) values ('$nombre');";
        $stmt = $conexion->prepare($query);
        $stmt->execute();
    }
    // function setIdOperacionDeCorte ($idCorte) {
    //     $idCorteOpe = $idCorte;
    // }

    function readOperacionDeCorte($idCorte) {
        try {
            $conexionModel = new ConexionModel();
            $conexion = $conexionModel->connect();
    
            $query = "SELECT operacion_corte.*
                      FROM operacion_corte
                      JOIN corte_ope ON operacion_corte.id = corte_ope.id_operacion_corte
                      WHERE corte_ope.id_corte = :id";
            $stmt = $conexion->prepare($query);
            $stmt->bindParam(':id', $idCorte, PDO::PARAM_INT);
            $stmt->execute();
    
            $result = $stmt->fetchAll(PDO::FETCH_ASSOC);
    
            $conexion = null;
    
            return $result;
        } catch (PDOException $e) {
            die("Error en la consulta: " . $e->getMessage());
        }
    }
    function readOperacion() {
        try{
            $conexionModel = new ConexionModel();
            $conexion = $conexionModel->connect();

            $query = "SELECT * FROM operacion_corte";
            $stmt = $conexion->prepare($query);
            $stmt->execute();
    
            $result = $stmt->fetchAll(PDO::FETCH_ASSOC);
    
            $conexion = null;
    
            return $result;
        } catch (PDOException $e) {
            die("Error en la consulta: " . $e->getMessage());
        }
    }
    
    function updateOperacion($idOperacion, $nuevosDatos) {
        try {
            $conexionModel = new ConexionModel();
            $conexion = $conexionModel->connect();
    
            // Construir la consulta UPDATE con los campos que deseas actualizar
            $query = "UPDATE operacion_corte 
                      SET nombre = :nombre
                      WHERE id = :id";
            
            $stmt = $conexion->prepare($query);
    
            // Bind de los nuevos valores y el ID de la operación
            $stmt->bindValue(':nombre', $nuevosDatos['nombre']);
            // Agregar más líneas para cada campo que desees actualizar
    
            $stmt->bindParam(':id', $idOperacion, PDO::PARAM_INT);
            
            $stmt->execute();
    
            // Puedes agregar más lógica si es necesario, por ejemplo, manejar relaciones con otras tablas
    
            $conexion = null;
    
            return true;
        } catch (PDOException $e) {
            // Manejar errores si es necesario
            return false;
        }
    }
    

    function deleteOperacion($idOperacion) {
        try {
            $conexionModel = new ConexionModel();
            $conexion = $conexionModel->connect();

            $query = "delete from operacion_corte where id=:id";
            echo "$query";
            $stmt = $conexion->prepare($query);
            $stmt->bindParam(':id', $idOperacion, PDO::PARAM_INT);
            $stmt->execute();

            // Puedes agregar más lógica si es necesario, por ejemplo, manejar relaciones con otras tablas

            $conexion = null;

            return true;
        } catch (PDOException $e) {
            // Manejar errores si es necesario
            return false;
        }
    }

}
?>