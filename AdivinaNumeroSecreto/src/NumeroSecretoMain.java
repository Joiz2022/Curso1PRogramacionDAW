import java.util.Random;
import java.util.Scanner;

public class NumeroSecretoMain {


    private static boolean respuesta = true;

    @SuppressWarnings("resource")
    public static void main(String[] args)  {

        Random rand = new Random();

        int numeroIntroducido;
        int x = rand.nextInt(101);
        int a=10;



        //		int[] lista= {1,2,3};


        do{
            System.out.println("Se ha creado un numero X aleatorio entre el 1 y el 100, intenta adivinarlo");



            do{

                Scanner keyboard1 = new Scanner(System.in);
                System.out.println("Intentos restantes "+a);
                a--;
                numeroIntroducido = keyboard1.nextInt();
                int comparacion=Math.abs(numeroIntroducido-x);

                if (comparacion>39) {
                    System.out.println("Estas muy muy lejos");
                }

                if (comparacion<40&&comparacion>19) {
                    System.out.println("Estas muy lejos");
                }

                if (comparacion<20&&comparacion>9) {
                    System.out.println("Estas lejos");
                }

                if (comparacion<10&&comparacion>4) {
                    System.out.println("Estas cerca");
                }

                if (comparacion<5&&comparacion>0) {
                    System.out.println("Estas muy cerca");
                }

                if (numeroIntroducido<x) {
                    System.out.println("El numero introducido es menor que X");
                }

                if (numeroIntroducido>x) {
                    System.out.println("El numero introducido es mayor que X");
                }

                if (a==0) {
                    System.out.println("Has perdido");
                    System.exit(0);
                }

                if (numeroIntroducido==x) {
                    System.out.println("Has ganado!, intentos restantes "+a);
                    System.out.println("Quieres jugar otra vez?");
                    a=10;
                    Scanner keyboard11 = new Scanner(System.in);

                    String seguirJugando = keyboard11.nextLine();
                    x = rand.nextInt(101);

                    if (seguirJugando.equalsIgnoreCase("no")) {

                        respuesta=false;
                    }
                }

            }while(numeroIntroducido!=x);




        }
        while(respuesta);

    }

}
