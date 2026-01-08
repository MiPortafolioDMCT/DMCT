<?php
$host='localhost';
$nombreUsuario='root';
$contraseña='fghj';
$bd='proyecto';
$conn=mysqli_init();
mysqli_real_connect($conn, $host, $nombreUsuario, $contraseña, $bd, 3306)
if(mysqli_connect_errno()){
    die('Falla de conexión '.mysqli_connect_error())
}
?>