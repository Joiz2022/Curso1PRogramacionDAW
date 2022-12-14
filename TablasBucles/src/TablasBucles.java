public class TablasBucles {

    public static void main(String[] args) {
        int i;
        double suma=0;
        double division=0;
        double cantidad=0;
        double cantidadinpar=0;
        double mayorque=0;
        double mayorque2=0;
        double nummax=0;
        double nummin=0;
        double suma2=0;
        double tabla[] = new double[]{68,21,90,21,22,22,13,10,3,3};
        double tabla2[] = new double[10];
        double tabla3[] = new double[tabla2.length];
        double maximo=tabla[0];
        double minimo=tabla[0];
        double maximo2=tabla[0];







        for(i=0 ; i<tabla.length ; i++) {

            suma += tabla[i];   //Formula suma

            division=suma/tabla.length;  //Formula division
        }

        System.out.println("La suma total es: "+suma);   //Suma

        System.out.println("La media total es: "+division);   //Division

        for(i=0 ; i<tabla.length ; i++) {


            if (tabla[i]>maximo) {
                maximo=tabla[i];   //Formula maximo
                nummax=i;
            }


            if (tabla[i]<minimo) {
                minimo=tabla[i];      //Formula minimo
                nummin=i;
            }
        }

        System.out.println("El numero maximo es "+maximo+" y su posicion en la tabla es "+nummin);   //Maximo
        System.out.println("El numero minimo es "+minimo+" y su posicion en la tabla es "+nummax);   //Minimo

        for(i=0 ; i<tabla.length ; i++) {
            if(tabla[i]%2==0) {                //Formula par
                cantidad++;

            }
            if(tabla[i]%2==1) {             //Formula inpar
                cantidadinpar++;

            }
        }

        System.out.println("La cantidad de numeros pares es "+cantidad);   //Cantidad pares
        System.out.println("La cantidad de numeros inpares es "+cantidadinpar);   //Cantidad inpares


        for(i=0 ; i<tabla.length ; i++) {


            if (tabla[i]>=18) {      //Formula mayor de 18
                mayorque++;
            }


            if (tabla[i]>=18&&tabla[i]<=64) {     //Formula entre 18 y 64
                mayorque2++;
            }
        }


        System.out.println("La cantidad de numeros mayor y igual a 18 es "+mayorque);  //Mayor 18
        System.out.println("La cantidad de numeros entre 18 y 64 es "+mayorque2);  //Entre 18 y 64



        for(i=0 ; i<tabla.length ; i++) {

            if (tabla[i]>=20 && tabla[i]<=39) {   //Formula entre 20 y 39

                suma2+=tabla[i];
            }}

        System.out.println("La suma de los numeros entre 20 y 39 es "+suma2);




        for(i=0 ; i<tabla.length ; i++) {


            if (tabla[i]>maximo2&&tabla[i]<maximo) {

                maximo2=tabla[i];
                //Formula segundo maximo
            }}

        System.out.println("El segundo numero maximo es "+maximo2);




        for (i = 0; i < tabla2.length; i++) {
            tabla2[i] =(int) (Math.random()*100)+1;



            //Formula segunda tabla aleatoria y numero superior o igual a 50

            if (tabla2[i]>=50) {



                tabla3[i]=tabla2[i];
                tabla2[i]=0;
            }



            if (tabla2[i]>0) {
                System.out.println("El numero en la posicion "+i+" es "+tabla2[i]);}


            if (tabla3[i]>0) {
                System.out.println("El numero superior o igual a 50 en la posicion "+i+" es "+tabla3[i]);}

        }

        /**
         * Varios
         */

        for(double cadena :tabla) {
            System.out.println(cadena);
        }


        int nota = 7;
        System.out.println((nota > 5 ? "has aprobado" : "has suspendido"));




    }}