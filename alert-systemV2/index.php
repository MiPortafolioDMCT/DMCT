<?php
// Sesion config
session_start();
//session_destroy();
// Models
require_once "src/models/auth.model.php";
require_once "src/models/inventario.model.php";
require_once "src/models/corte.model.php";
require_once "src/models/operacion.model.php";
require_once "src/models/operario.model.php";
require_once "src/models/persona.model.php";
require_once "src/models/salario.model.php";
require_once "src/models/usuario.model.php";

// controllers
require_once "src/controllers/template.controller.php"; //para importar una vez
require_once "src/controllers/inventario.controller.php"; 
require_once "src/controllers/operario.controller.php"; 
require_once "src/controllers/auth.controller.php"; //para importar una vez
require_once "src/controllers/salario.controller.php"; //para importar una vez
require_once "src/controllers/operacion.controller.php";
require_once "src/controllers/corte.controller.php";
require_once "src/controllers/usuario.controller.php";

$instanciaTemplate = new Template();
$instanciaTemplate->obtenerTemplate(); 
?>