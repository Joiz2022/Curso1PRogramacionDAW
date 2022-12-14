import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EntradaDatos6 {

    public static void main(String[] args) throws IOException {

        System.out.println("Introduce un número: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double radio=Double.parseDouble(reader.readLine());
        double area=Math.PI*radio*radio;
        System.out.println("El área es: "+area);
    }
}

		
	