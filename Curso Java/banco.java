abstract class Persona {
    String nombre;
    String apePat;
    String apeMat;
    int edad;

    Persona(String n, String ap, String am, int e) {
        nombre = n;
        apePat = ap;
        apeMat = am;
        edad = e;
    }

    public abstract Cuenta crearCuenta(String tipo, double saldo, boolean estado, String noCuenta);
}

class Cliente extends Persona {
    Cuenta [] cuentas;

    Cliente(String nombre, String apePat, String apeMat, int edad){
        super(nombre, apePat, apeMat, edad);
        cuentas = new Cuenta[4];
    }

    @Override
    public Cuenta crearCuenta(String tipo, double saldo, boolean estado, String noCuenta) {
        Cuenta nuevaCuenta = new Cuenta(tipo, saldo, estado, noCuenta);
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] == null) {
                cuentas[i] = nuevaCuenta;
                System.out.println(nombre + " ha creado una cuenta de " + cuentas[i].tipo);
                break;
            }
        }
        return nuevaCuenta;
    }

    void depositar(Cliente clienteD, Cuenta cuentaO, Cuenta cuentaD, double cantidad){ 

        cuentaO.setSaldo(cuentaO.getSaldo() - cantidad);
        cuentaD.setSaldo(cuentaD.getSaldo() + cantidad);

        System.out.println(nombre + " con cuenta " + cuentaO.noCuenta + " ha transferido a " + clienteD.nombre + " con cuenta " + cuentaD.noCuenta);
        System.out.println("La transferencia fue de: $" + cantidad);
    }

    void abonar(Cuenta cuenta, double cantidad){
        cuenta.setSaldo(cuenta.getSaldo() + cantidad);
        System.out.println("Se ha abonado $" + cantidad + " a tu cuenta " + cuenta.noCuenta);
        System.out.println("El saldo actual de " + nombre + " es de: $" + cuenta.getSaldo());
    }

    void retirar(Cuenta cuenta, double cantidad){
        cuenta.setSaldo(cuenta.getSaldo() - cantidad); 
        System.out.println("Se ha retirado $" + cantidad + " a tu cuenta " + cuenta.noCuenta);
        System.out.println("El saldo actual de " + nombre + " es de: $" + cuenta.getSaldo());
    }

    void consultarSaldo(String noCuenta){
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] != null && cuentas[i].noCuenta.equals(noCuenta)) {
                System.out.println("Saldo actual de la cuenta " + noCuenta + " es de: $" + cuentas[i].getSaldo());
                break; 
            }
        }
    }
}

class Cuenta {
    String tipo; 
    private double saldo; 
    boolean estado; //activo o inactivo
    String noCuenta;

    Cuenta(String t, double s, boolean e, String noC){
        tipo = t;
        saldo = s;
        estado = e;
        noCuenta = noC;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}

class Banco  {
    String nombre;

    Cliente [] clientes;

    Banco(String nom) {
        nombre = nom;
        clientes = new Cliente[4];
    }
    Cliente crearCLiente(String nombre, String apePat, String apeMat, int edad) {
        Cliente nuevoCliente = new Cliente(nombre, apePat, apeMat, edad);
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = nuevoCliente;
                System.out.println("BBVA tiene un nuevo cliente llamado " + clientes[i].nombre + " " + clientes[i].apePat + " " + clientes[i].apeMat);
                break;
            }
        }
        return nuevoCliente;
    }
    
    void listarClientesConCuenta(){
        System.out.println("Nombre de clientes con sus cuentas: ");
        for (int i = 0; i < clientes.length; i++) {
            Cliente cliente = clientes[i];
            if (cliente != null) {
                for (int j = 0; j < cliente.cuentas.length; j++) { 
                    Cuenta cuenta = cliente.cuentas[j];
                    if (cuenta != null) {
                        System.out.println("Cliente: " + cliente.nombre + " Cuenta de " + cuenta.tipo + " No. Cuenta: " + cuenta.noCuenta);
                    }
                }
            }
        }
    }

    void abrir(){
        System.out.println("Banco " + nombre + " ha sido abierto");
    }

}

class Programa {
    public static void main(String [] args) { 
        
        Banco bbva = new Banco("BBVA");
        bbva.abrir();

        Cliente cliente1 = bbva.crearCLiente("Dulce", "Cabrera", "Teotan", 22);
        Cuenta cuenta1 = cliente1.crearCuenta("cheque", 50.00, true, "41523134528815");

        Cliente cliente2 = bbva.crearCLiente("Maria", "Cabrera", "Teotan", 24);
        Cuenta cuenta2 = cliente2.crearCuenta("ahorro", 70.00, true, "42513134528815");


        cliente1.consultarSaldo("41523134528815");
        cliente2.consultarSaldo("42513134528815");

        cliente1.depositar(cliente2, cuenta1, cuenta2, 30.00);

        cliente1.consultarSaldo("41523134528815");
        cliente2.consultarSaldo("42513134528815");

        cliente1.abonar(cuenta1, 50);
        cliente2.retirar(cuenta2, 40);

        bbva.listarClientesConCuenta();

    }
}  