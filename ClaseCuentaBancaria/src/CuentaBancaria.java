
public class CuentaBancaria {

    private String id_titular; // Nombre y apellido
    private double id_saldo; // Saldo de la cuenta

    //Metodos y funciones
    public CuentaBancaria() {
        id_titular="Persona desconocida";
        id_saldo=0.00;
    }
    public CuentaBancaria (String nuevoTitular) //Metodo constructor
    {id_titular=nuevoTitular;
    }

    public CuentaBancaria(String a,double b) { //Metodo constructor
        id_titular=a;
        id_saldo=b;
    }

    public CuentaBancaria(double b,String a) { //Metodo constructor
        id_titular=a;
        id_saldo=b;
    }

    public String obtenerTitular()
    {return id_titular;
    }

    public double obtenerSaldo()
    {return id_saldo;
    }

    public boolean saldoNegativo() {
        if(id_saldo<0)
            return (true);
        else return (false);
    }


    public void ingresar(double ingreso)
    {id_saldo = id_saldo + ingreso;  // id_saldo+=ingreso
    }

    public void retirar(double retiro){
        id_saldo = id_saldo - retiro;

//id_saldo-=retirar
    }

    public String cambiarTitular(String nuevoTitular)
    {return id_titular = nuevoTitular;
    }




}