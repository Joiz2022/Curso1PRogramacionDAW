import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EntradaDatos2 {

    public static void main(String[] args) throws IOException {

        System.out.println("Introduce un número:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double num=Double.parseDouble(reader.readLine());
        System.out.println(2*num);
    }
}
