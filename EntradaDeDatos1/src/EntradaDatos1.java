import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EntradaDatos1 {

    public static void main(String[] args) throws IOException {

        System.out.println("Introduce tu nombre:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String izena=reader.readLine();
        System.out.println("Hola " + izena);
    }
}