<?php



class OperacionController {
    function agregarOperacion() {
        if(isset($_POST['btnGuardar'])){
            $nombre = $_POST['nombre'];

            echo "Se ha agregado la nueva operación: " . $nombre;
            $OperacionModel = new OperacionModel();
            $datos = $OperacionModel->createOperacion($nombre);
        }
    }    

    //Muestra todas las operaciones que existen
    function mostrarOperacion() {
        $OperacionModel = new OperacionModel();
        $OperacionModel->readOperacion();
        $respuesta = $OperacionModel->readOperacion();
        
        if ($respuesta !== 'error') {
            return $respuesta;
        } else {
            return [];
        }
    }
    //Funcion para monstrar las operaciones que corresponden a cada corte 
    function mostrarOperacionDeCorte() {
        if ($_SERVER['REQUEST_METHOD'] === 'POST') {
            if (isset($_POST['id']) && isset($_POST['nombre'])) {
                $idCorte = $_POST['id'];
    
                $OperacionModel = new OperacionModel();
                $respuesta = $OperacionModel->readOperacionDeCorte($idCorte);
    
                if ($respuesta !== 'error') {
                    return $respuesta;
                } else {
                    return [];
                }
            } else {
                echo 'No se proporcionó un ID de corte válido.';
            }
        } else {
            echo 'Método de solicitud no válido.';
        }
    }
    function modificarOperacion() {
        
    }

    function eliminarOperacion($idOperacion) {
        $OperacionModel = new OperacionModel();
        $eliminacionExitosa = $OperacionModel->deleteOperacion($idOperacion);
    
        // Manejar el resultado de la eliminación y devolver una respuesta al cliente
        $response = ['success' => $eliminacionExitosa];
    
        //header('Content-Type: application/json');


        if ($eliminacionExitosa) {
            echo json_encode(['success' => true]);
        } else {
            echo json_encode(['success' => false, 'error' => 'Mensaje de error']);
        }
    }
    
}
?>