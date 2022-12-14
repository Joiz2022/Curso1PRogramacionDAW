public class cuentas {

    public static void main(String[] args) {

        CuentaBancaria cuenta1;
        cuenta1= new CuentaBancaria("Francisca Pérez",300.0);
        cuenta1.ingresar(500.0);
        System.out.println(cuenta1.obtenerSaldo());
        cuenta1.retirar(720.75);
        System.out.println(cuenta1.saldoNegativo());
        System.out.println("El saldo de "+cuenta1.obtenerTitular()+" es de "+cuenta1.obtenerSaldo());



        CuentaBancaria cuenta2;
        cuenta2= new CuentaBancaria("Mikel Agirre",5.33);
        cuenta2.retirar(200.0);
        System.out.println(cuenta2.saldoNegativo());
        cuenta2.cambiarTitular("June Agirre");
        cuenta2.ingresar(800.0);
        System.out.println("El saldo de "+cuenta2.obtenerTitular()+" es de "+cuenta2.obtenerSaldo());



        CuentaBancaria cuenta3;
        cuenta3= new CuentaBancaria("Ainhoa González",1500.0);
        System.out.println(cuenta3.saldoNegativo());
        System.out.println("El saldo de "+cuenta3.obtenerTitular()+" es de "+cuenta3.obtenerSaldo());
        cuenta3.cambiarTitular("Elon Musk");
        cuenta3.ingresar(5000000000.0);
        System.out.println(cuenta3.obtenerSaldo());


    }

}
