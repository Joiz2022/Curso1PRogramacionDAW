import java.nio.channels.AsynchronousChannelGroup;
import java.util.Scanner;

public class ClaseElectrodomesticoMAin {
    public static void main(String[] args) {

        ClaseElectrodomestico frigo1;
        ClaseElectrodomestico lavadora1;

        frigo1 = new ClaseElectrodomestico(660,"A",50,"Blanco");
        lavadora1 = new ClaseElectrodomestico(400,"A",30,"Blanco");

        System.out.println("Ejercicios Frigorifico: ");
        /*Acciones con frigo1:
        1. Mostrar en pantalla los precios con y sin IVA.
        2. Comprobar si está catalogado como “eficiente”.
        3. Cambiar el color a “negro”.
        4. Hacer oferta de un 12%.
        5. Mostrar en pantalla los precios con y sin IVA.*/

        System.out.println("1. El precio con IVA es = " + frigo1.obtenerPrecioFinal() + "€ y sin IVA es = " + frigo1.precioSinIVA() +"€");
        System.out.println("2. EL consumo energético de este electrodoméstico es: " + frigo1.obtenerConsumo());
        frigo1.cambiarColor("Negro");
        System.out.println("3. El color del frigorifico ha cambiado a: " + frigo1.mostrarColor());
        System.out.println("4. La lavadora tiene una oferta del " + frigo1.hacerOferta(12) + "%");
        System.out.println("5. El precio con IVA es: " + frigo1.obtenerPrecioFinal() +"€ y sin IVA es : " + frigo1.precioSinIVA() + "€\n");

        System.out.println("Ejercicios lavadora: ");
       /* 1. Mostrar en pantalla todos los atributos del electrodoméstico, también el precio con
        IVA.
        2. Comprobar cuanto de más o de menos pesa respecto a frigo1.
        3. Hacer oferta del 50%.
        4. Mostrar en pantalla todos los atributos del electrodoméstico, también el precio con
        IVA.*/
        System.out.println("1. Los atributos de la lavadora son : precio sin IVA: " + lavadora1.precioSinIVA() + "€, consumo energético: " + lavadora1.obtenerConsumo() +", peso: " + lavadora1.obtenerPeso() + "Kg, color: " + lavadora1.obtenerColor() + " y su precio con IVA es: " + lavadora1.obtenerPrecioFinal() + "€");
        System.out.println("2. La lavadora pesa: " + (lavadora1.obtenerPeso()-frigo1.obtenerPeso()) + "kg. respecto al frigorifico");
        System.out.println("3. La lavadora tiene una oferta del " + lavadora1.hacerOferta(50) + "%, su precio es:  " + lavadora1.devolverOferta() + "€");
        System.out.println("4. Los atributos de la lavadora son : precio sin IVA: " + lavadora1.devolverOferta() + "€, consumo energético: " + lavadora1.obtenerConsumo() +", peso: " + lavadora1.obtenerPeso() + "Kg, color: " + lavadora1.obtenerColor() + " y su precio con IVA es: " + lavadora1.obtenerPrecioFinal() + "€");

    }
}