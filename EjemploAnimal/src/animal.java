public class animal
{
    private String raza;
    private String nombre;
    private int edad;

    public animal(String nuevoNombre)
    {
        nombre = nuevoNombre; //Se le da un nombre al animal
    }

    //Método para obtener la edad del animal
    public int getEdad()
    {
        return edad;
    }

    //Método para establecer la edad del animal
    public void setEdad(int nuevaEdad)
    {
        edad = nuevaEdad;
    }

    //Método para obtener el nombre del animal
    public String getNombre()
    {
        return nombre;
    }

    public animal (String n, String r,int e) {

        nombre=n;
        raza=r;
        edad=e;
    }



}
