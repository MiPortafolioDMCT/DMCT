<?php
class operarioModel
{
    //funcion para listar operacion y costo de operacion
    function readOperaciones(){
        try{
            $conexionModel = new ConexionModel();
            $conexion = $conexionModel->connect();

            $query = "SELECT * FROM operacion_corte";
            $stmt = $conexion->prepare($query);
            $stmt->execute();
            
            $result = $stmt->fetchAll(PDO::FETCH_ASSOC);

            $conexion = null;

            return $result;
        }catch(PDOException $e){
            die("Error de la consulta: ". $e->getMessage());
        }

        }
    }


?>