public class EjercicioMath {


    public static void main(String[] args) {
    //PI
        double pi = Math.PI;

        double radio = 50;

        double resultado = (pi * (radio * radio));

        System.out.println("El área es"+" "+resultado);

    //MAXIMO
        int num1 = 10;
        int num2 = 20;
        int maximo = Math.max(num1, num2);

        System.out.println("El numero mayor es"+" "+maximo);

    //MINIMO
        int x=1;
        int y=13;
        int resultado2=Math.min(x,y);
        System.out.println(resultado);

    //RAIZ CUADRADA
        double num3=25;
        double resultado3=Math.sqrt(num3);
        System.out.println(resultado3);

    //POTENCIA
        double num4=2;
        double num5=3;
        double resultado4=Math.pow(num4,num5);
        System.out.println(resultado4);

    //RANDOM
        int num6=(int)(Math.random()*6)+1;
        System.out.println(num6);

    //REDONDEO
        double num7=5.5;
        double resultado5=Math.round(num7);
        System.out.println(resultado5);

    //CONTADOR
        int num8=0;
        for (int i=0; i<10; i++){
            num8++;
            System.out.println(num8);
        }

    //RAMDOM SIN REPETIR NUMERO

        int num9=(int)(Math.random()*(80)+1);
        int num10=(int)(Math.random()*(80)+1);
        while (num9==num10) {

            num9=(int)(Math.random()*(80)+1);
            num10=(int)(Math.random()*(80)+1);
        }
        System.out.println(num9);
        System.out.println(num10);

    //REDONDEO

        float num11=(float) 6.3;
        System.out.println(Math.round(num11));

    //GRADOS A RADIANES

        double num12=90;
        double resultado6=Math.toRadians(num12);
        System.out.println(resultado6);




    }

}
