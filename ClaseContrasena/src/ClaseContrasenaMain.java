import java.util.Scanner;

public class ClaseContrasenaMain {
    public static void main(String[] args) {
        ClaseContrasena contrasena1;

        //Crea el objeto pass1 de tipo Contrasena de una longitud de 6 caracteres.
        contrasena1 = new ClaseContrasena("12345s");

        //Mostrar la contraseña en pantalla.
        System.out.println("La contraseña es: " + contrasena1.mostrarContrasena());

        //Comprobar si la contraseña es “fuerte” o no.
        System.out.println("¿La contraseña es fuerte? " + contrasena1.esFuerte());

        //Cambiar la contraseña a una que contenga 12 caracteres.
        contrasena1.cambiarContrasena("1234567890s");

        //Mostrar la contraseña en pantalla.
        System.out.println("La contraseña es: " + contrasena1.mostrarContrasena());

        //Comprobar si la contraseña es “fuerte” o no.
        System.out.println("¿La contraseña es fuerte? " + contrasena1.esFuerte());

        //Pedir contraseña por teclado y comprobar si coincide con la contraseña de pass1.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la contraseña: ");
        String contrasena = sc.nextLine();
        if (contrasena.equals(contrasena1.mostrarContrasena())) {
            System.out.println("La contraseña es correcta");
        } else {
            System.out.println("La contraseña es incorrecta");
        }

        System.out.println(contrasena1.generarContrasena1());
        System.out.println(contrasena1.generarContrasena2(5));

    }
    JO
}
