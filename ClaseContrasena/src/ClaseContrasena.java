import java.util.Random;
import java.util.Scanner;

public class ClaseContrasena {

    //ATRIBUTOS
    private String contrasena;

    //Constructor
    public ClaseContrasena(String c) {
        contrasena = c;
    }

    //Metodo
    public boolean esFuerte() {
        if (contrasena.length() >= 8)
            return true;
        else {
            return false;
        }
    }
    //esFuerte(): devuelve true si la contraseña es de al menos 8 caracteres, false en caso contrario.
    public void cambiarContrasena(String nuevaContrasena){
        contrasena = nuevaContrasena;
    }
    //cambiarContrasena(): cambiará la contraseña por otra nueva. Dos maneras de llamar a este método:
//Sin parámetros: se generará una contraseña aleatoria de 8 caracteres y se asignará.
    public String generarContrasena1(){
        Random r = new Random();
        String contrasena = "";
        for (int i = 0; i < 8; i++) {
            int numero = r.nextInt(10);
            contrasena += numero;
        }
        return contrasena;
    }
    //Con un número como parámetro: se creará una nueva contraseña de esa longitud indicada en el parámetro, y se asignará.
    public String generarContrasena2(int longitud){
        Random r = new Random();
        String contrasena = "";
        for (int i = 0; i < longitud; i++) {
            contrasena = contrasena + (char) (r.nextInt(26) + 'a');
        }
        return contrasena;
    }

    //mostrar contraseña
    public String mostrarContrasena(){
        return contrasena;
    }
}