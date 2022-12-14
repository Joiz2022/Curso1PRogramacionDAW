
public class ClaseJavaClass {

    public static void main(String[] args) {

        double suma = 0;
        double division = 0;

        double tabla[] = new double[]{87,22,4,12,-2399,77,0,36,102327,-78,-99};
        double numero1=tabla[0];
        double numero2=tabla[0];



        for(int i=0 ; i<tabla.length ; i++) {

            suma += tabla[i];

            division=suma/tabla.length;
        }



        System.out.println("Suma: "+suma);
        System.out.println("Media: "+division);

        for(int i=0 ; i<tabla.length ; i++) {


            if (tabla[i]>numero1) {
                numero1=tabla[i];
            }
            if (tabla[i]<numero2) {
                numero2=tabla[i];
            }


        }

        System.out.println(numero1);
        System.out.println(numero2);









//	            System.out.println("Elemento " + (i+1) + " : "+ tabla[i]);
//		 
//		 
//		 int x=1;								
//		 
//		 while(x>=1) {
//			 System.out.println(x++);
//		 }
//		 
//		 
//		 for(x=0;x>=0;x++) {
//			 System.out.println(x);
//		 }




    }}
	