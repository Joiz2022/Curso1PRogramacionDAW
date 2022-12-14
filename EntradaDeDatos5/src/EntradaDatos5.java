import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EntradaDatos5 {

    public static void main(String[] args) throws IOException {

        System.out.println("Introduce dos numeros:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double num1=Double.parseDouble(reader.readLine());
        double num2=Double.parseDouble(reader.readLine());
        if (num1>num2)
            System.out.println("El número mas grande es: "+num1);
        else
            System.out.println("El número mas grande es: "+num2);
    }
}
