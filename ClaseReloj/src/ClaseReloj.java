public class ClaseReloj{

    private int hora;
    private int minuto;
    private int segundo;


    public ClaseReloj () {
        hora=0;minuto=0;segundo=0;
    }

    public ClaseReloj (int hora, int minuto, int segundo) {
        this.convertirHora(hora, minuto, segundo);
    }

    public void mostrarReloj() {
        System.out.println("«"+hora+":"+minuto+":"+segundo+"»");
    }


    public void mostrarReloj1() {

        if (hora==24 ||( hora>00 && hora<=12)) {
            System.out.println(+hora+":"+minuto+":"+segundo+"AM");
        }
        if (hora>12 && hora<23)
            hora=hora-12;
        System.out.println("«"+hora+":"+minuto+":"+segundo+"PM");
    }

    private void convertirHora(int hora, int minuto, int segundo) {


        while (23<hora) {
            hora=hora-24;
        }
        while (59<minuto) {
            hora++;
            minuto=minuto - 60;
        }
        while (59<segundo) {
            minuto++;
            segundo=segundo - 60;
        }
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
}