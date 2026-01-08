<!DOCTYPE html>
<?php
include('conexion.php');
if(isset($_POST['enviar'])){
    $insert="insert into venta(producto,cantidadCompra,tipoPago) values ('" .$_POST ['producto']."'), '" .$_POST ['cantidadCompra']."','" .$_POST ['tipoPago']."')";
    echo $insert
}
?>
<html lang="es">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
        <link rel="stylesheet" href="css/hojaEstilo.css">
        <title>Página de inicio</title>
    
</head>
<header>
    <h1>Page</h1>
    <img id="banner" src="img/michi.jpg" >
</header>

<body>

    <form method="post"> <!--indica que se van a enviar los datos al servidor-->
        <p class="datoForm">Selecciona una opción </p>
        <select class="form-select" id="producto" name="producto">
            <option selected>Seleccione...</option>
            <option value="Ensalada">Ensaladas</option>
            <option value="Postre">Postres</option>
            <option value="Dulces">Dulces</option>
        </select>

        <p class="datoForm">Ingresa la cantidad de Compra</p>
            <input type="number" class="form-control" id="cantidad" name="cantidadCompra">

        <p class="datoForm">Tipo de pago</p>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="tipoPago" id="efectivo" value="efectivo"checked>
            <label class="form-check-label" for="flexRadioDefault1">
                Pago en Efectivo
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="tipoPago" id="transferencia" value="transferencia">
            <label class="form-check-label" for="flexRadioDefault2">
                Transferencia
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="tipoPago" id="tarjeta" value="tarjeta">
            <label class="form-check-label" for="flexRadioDefault2">
                Pago con Tarjeta
            </label>
        </div>
        <button class="btn btn-primary" type="submit" onclick=calcularTotal(); name="enviar">Comprar</button>
    </form>

    <script>
        function calcularTotal() {
            var prod = document.getElementById("producto").value;
            var cantidad = document.getElementById("cantidad").value;
            var precio;
            var cantidadInicial = 5000;
            switch (prod) {
                case "Ensalada":
                    precio = 30;
                    break;
                case "Postre":
                    precio = 50;
                    break;
                case "Dulces":
                    precio = 60;
                    break;
            }


            var total = cantidad * precio;
            var saldoRestante = cantidadInicial - total;
                if (document.getElementById("efectivo").checked) {
                    alert("Pago en efectivo por: " + total)
            } else if (cantidadInicial >= total) {
            if (document.getElementById("transferencia").checked) {
                alert("Se realizo una tranferencia por: " + total)
            } else if (document.getElementById("tarjeta").checked) {
                var descuento = total * .10
                total = total - descuento
                alert("Se realizo un pago con tarjeta por: $" + total + " con un descuento de: $" + descuento)
            }
            alert("Tu saldo disponible es de : " + saldoRestante)
        } else {
            alert("Saldo Insuficiente");}

            //var tipoPago = document.getElementById("");
            //alert ("Producto Seleccionado: " + prod + " Cantidad: " + cantidad);
            /*alert('Total a pagar = ' + total);
            if (total < 50) {
                alert("Compra sin Descuento")
                for (var contador = 0; contador < 2; contador++) {
                    alert('Gracias por tu compra');
                }
            }
            else {
                alert('Compra con 10% de descuento')
                var contadro2 = 0;
                while (contadro2 <= 2) {
                    alert('Muchas gracias por su compra');
                    contadro2++;
                };
            }

            switch (tipoPago) {
                case 'efectivo': alert('Tu pago es en efectivo');
                    break;
                case 'Tarjeta de credito': alert('Tu pago fue a credito');
                    break;
                case 'Transferencia': alert('Hiciste una transferencia');
                    break;
                default:
                    alert('Pago rechazado');
            }*/
        }
    </script>
    <footer>
        <div class="container text-center">
            <div class="row row-cols-6">
                <div class="col">
                    <a href="AvisoLegal.html">
                        <img class= ".imgFooter" src="img/avisoLegal.jpg" alt="Aviso" width="30" height="24" class="d-inline-block align-text-top">
                    </a>Aviso legal
                </div>
                <div class="col">
                    <a href="contacto.html">
                        <img class= ".imgFooter" src="img/logo.png" alt="Logo" width="30" height="24" class="d-inline-block align-text-top">
                    </a>Contactanos
                </div>
                <div class="col">
                    <a href="https://es-la.facebook.com/">
                        <img class= ".imgFooter" src="img/fb.png" alt="Facebook" width="30" height="24"
                            class="d-inline-block align-text-top">
                    </a>
                    Facebook
                </div>
                <div class="col">
                    <a href="https://api.whatsapp.com/send/?phone=2761008973">
                        <img class= ".imgFooter" src="img/wa.png" alt="Whatsapp" width="30" height="24"
                            class="d-inline-block align-text-top">
                    </a>
                    WhatsApp
                </div>
                <div class="col">
                    <a href="https://www.instagram.com">
                        <img class= ".imgFooter" src="img/ig.png" alt="Instagram" width="30" height="24"
                            class="d-inline-block align-text-top">
                    </a>
                    Instagram
                </div>
                <div class="col">
                    <a href="https://outlook.live.com/owa/">
                        <img class= ".imgFooter" src="img/gm.png" alt="Correo Electronico" width="30" height="24"
                            class="d-inline-block align-text-top">
                    </a>
                    Correo Electronico
                </div>
            </div></div>
    </footer>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>

</body>

</html>