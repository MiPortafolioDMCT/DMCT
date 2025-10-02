<?php
class UsuarioModel {
    
    function createUsuario() {
    }
    function readUsuario() {
    }
    function readUsuarioNombre() {
        try {
            $conexionModel = new ConexionModel();
            $conexion = $conexionModel->connect();
    
            $query = "SELECT usuario.id AS id_usuario, persona.nombre, persona.apellido_paterno, persona.apellido_materno
            FROM usuario JOIN persona ON usuario.id=persona.id;";
            $stmt = $conexion->prepare($query);
            $stmt->execute();
    
            $result = $stmt->fetchAll(PDO::FETCH_ASSOC);
    
            // Cerrar la conexión (opcional, PDO lo cerrará automáticamente al finalizar el script)
            $conexion = null;
    
            return $result;
        } catch (PDOException $e) {
            die("Error en la consulta: " . $e->getMessage());
        }
    }
    function updateUsuario() {}
    function deleteUsuario() {}
}
?>