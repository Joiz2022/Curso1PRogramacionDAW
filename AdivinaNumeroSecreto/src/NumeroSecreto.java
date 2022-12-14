import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {

    int x;
    int numeroIntroducido;
    String respuesta;
    int comparar;


    public NumeroSecreto() {
        this.crearNumero();
    }


    private void crearNumero() {
        Random random = new Random();
        x = random.nextInt(101);


    }


    public int mostrarNumero() {
        return x;
    }


    public void preguntarNumero() {

        do {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Introduce un numero");
            numeroIntroducido = keyboard.nextInt();

            comparar=Math.abs(Integer.compare(x, numeroIntroducido));
        }
        while(numeroIntroducido!=x);


        while (numeroIntroducido==x){
            System.out.println("Has acertado");
            System.out.println("Quieres jugar otra vez?");
            Scanner keyboard = new Scanner(System.in);
            respuesta= keyboard.nextLine();
            if (respuesta=="si") {
                this.preguntarNumero();
            }
            else System.exit(0);



        }

    }
}
