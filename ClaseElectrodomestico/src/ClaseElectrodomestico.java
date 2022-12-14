import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ClaseElectrodomestico { //Atributos

    private String obtenerConsumo;
    private double peso;
    private String color; //consultar problema con char!!!!!!!!
    private double precio;
    private double oferta;


    public ClaseElectrodomestico(double p, String e, double kg, String c) { //Constructor
        precio = p;
        obtenerConsumo = e;
        peso = kg;
        color = c;
    }
    public double precioSinIVA() {
        return precio;
    }
    public double obtenerPeso() {
        return peso;
    }
    public String obtenerColor() {
        return color;
    }
    public String obtenerConsumo() {
        return obtenerConsumo;
    }
    public String esEficiente() {
        if (obtenerConsumo.equals("A") || obtenerConsumo.equals("B")) {
            return ("muy eficiente");
        }
        if (obtenerConsumo.equals("C") || obtenerConsumo.equals("D")) {
            return ("eficiente");
        } else {
            return ("deficiente");
        }
    }
    public double obtenerPrecioFinal() {
        double a=(precio * (100-oferta)/100 *1.21);
        if (oferta==0)
            return precio * 1.21;
        else {
            BigDecimal bd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
            double val2 = bd.doubleValue();
            return val2;
        }


    }
    public void cambiarColor(String newColor) {
        color = newColor;
    }

    public double mostrarOferta( double oferta1){
        return oferta1;
    }
    public double hacerOferta(double o) {
        oferta = o;
        return o;
    }
    public double devolverOferta() {
        double preciooferta = precio * (100-oferta)/100;
        return  preciooferta;
    }
    public String mostrarColor() {
        return color;
    }
}

