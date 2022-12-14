public class Ejercicio2 {
    //PAR o IMPAR
    public static void main(String[] args) {

        int x = 40;
        int resultado = x % 2;

        if (resultado == 0)
            System.out.println("El numero" + " " + x + " " + "es par");
        else
            System.out.println("El numero" + " " + x + " " + "no es par");

    //POSITIVO o NEGATIVO

        int z = -1;

        if (z > 0)
            System.out.println("Es positivo.");
        else if (z < 0)
            System.out.println("Es negativo.");
        else
            System.out.println("El numero es igual a 0");

    //ES DIVISIBLE

        int num1=40, num2=20;
        int resultado2= num1 % num2;

        if (resultado2 == 0)
            System.out.println("El primer número es divisible por el segundo");
        else
            System.out.println("El primer número no es divisble por el segundo");
    }

}








