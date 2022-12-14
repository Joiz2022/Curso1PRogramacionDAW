
public class Personas {

    public static void main(String[] args) {

        Persona persona1;
        persona1= new Persona("Sara","Mujer",16,52.0,1.68);

        System.out.println(persona1.calcularIMC());



        Persona persona2;
        persona2= new Persona("Jonh","Hombre",14,76.0,1.72);
        System.out.println(persona2.calcularIMC());
        System.out.println(persona2.mostrarForma());
        persona2.cambiarGenero("Mujer");
        persona2.cambiarNombre("Jessica");
        persona2.cambiarPeso(-4.0);
        System.out.println(persona2.calcularIMC());
        System.out.println(persona2.mostrarForma());
    }

}
