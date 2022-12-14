public class Persona {

    private String nombre;
    private String genero;
    private String fechanacimiento;
    private int edad;
    private double peso;
    private double altura;
    private double IMC;



    public Persona(String n,String g, int e,double p, double a)
    { nombre=n;genero=g;peso=p;altura=a;edad=e;
    }
    public Persona(String n,String g)
    { nombre=n;genero=g;
    }
    public Persona(String n)
    { nombre=n;
    }
    public boolean esMayordeEdad() {
        if (edad >=18)
            return (true);
        else
            return(false);
    }
    public boolean esMujer() {
        if (genero == "Mujer")
            return(true);
        else
            return (false);
    }
    public boolean esHombre() {
        if (genero == "Hombre")
            return (true);
        else
            return (false);
    }
    public boolean otroGenero() {
        if (genero =="Hombre"||genero=="Mujer")
            return (false);
        else
            return (true);
    }
    public void cambiarPeso(double d) {
        peso += d;
    }
    public void crecer(int crecimiento) {
        altura=altura+(crecimiento/100);
    }
    public double calcularIMC() {
        return (IMC=peso/(altura*altura));    // Math.pow(altura,2);
    }
    public boolean enForma() {
        if (IMC <24.9 ||IMC >18.5)
            return (true);
        else
            return (false);
    }
    public String mostrarForma() {
        if (IMC < 18.5)
            return "Delgado";
        if (IMC >18.5 && IMC <24.9)
            return "En Forma";
        else
            return "Sobrepeso";
    }
    public void cambiarGenero(String nuevogenero) {
        genero=nuevogenero;
    }
    public void cambiarNombre(String nuevonombre) {
        nombre=nuevonombre;
    }
    public void cumpleanos() {
        edad++;
    }
    public int mostrarEdad() {
        return edad;
    }








}
