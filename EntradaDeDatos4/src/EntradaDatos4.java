import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EntradaDatos4 {

    public static void main(String[] args) throws IOException {

        System.out.println("Introduce dos numeros:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double num1=Double.parseDouble(reader.readLine());
        double num2=Double.parseDouble(reader.readLine());
        System.out.println("La división del primero por el segundo: "+(num1/num2));
    }
}
