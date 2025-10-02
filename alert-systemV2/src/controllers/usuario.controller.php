<?php
class UsuarioController {
    function agregarUsuario() {
    }
    function mostrarUsuario() {
    }
    function mostrarUsuarioNombre() {
        $UsuarioModel = new UsuarioModel();
        $UsuarioModel->readUsuarioNombre();
        $respuesta = $UsuarioModel->readUsuarioNombre();

        if ($respuesta !== 'error') {
            return $respuesta;
        } else {
            return [];
        }
    }
    function modificarUsuario() {}
    function eliminarUsuario() {}
}
?>