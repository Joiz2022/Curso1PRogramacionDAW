import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int x = 4, y = 10;
        int resultado = x + y;

        System.out.println("El resultado de" + " " + x + " " + "mas" + " " + y + " " + "es" + " " + resultado);

//FACTORIAL
        int factorial2 = 1;
        for (int i = 1; i < 20; i++) {
            factorial2 = factorial2 * i;
            System.out.println(factorial2);
        }


        int num9 = 0;
        int num10 = 1;
        int num11 = 0;
        for (int i = 0; i < 20; i++) {
            num11 = num9 + num10;
            num9 = num10;
            num10 = num11;
            System.out.println(num11);


            int negativos = 0;
            int positivos = 0;
            int suma = 0;
            int[] lista = new int[10];
            System.out.println("Introduce 10 numeros");
            Scanner sc = new Scanner(System.in);

            for (int j = 0; j < 10; j++) {

                lista[i] = sc.nextInt();
                if (lista[i] > 0) {
                    positivos++;
                }
                if (lista[i] < 0) {
                    negativos++;
                }
                suma += lista[i];
            }
            System.out.println(positivos);
            System.out.println(negativos);
            System.out.println(suma);
        }
    }
}

