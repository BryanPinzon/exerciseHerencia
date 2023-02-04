import java.time.LocalDate;

public class TarjetaCredito {
    private String emisor;
    private long cupo;
    private String numeroTarjeta;
    private int cvv;

    private LocalDate fechaVencimiento;

    public TarjetaCredito(){}
    public TarjetaCredito(String emisor, long cupo, String numeroTarjeta, int cvv, LocalDate fechaVencimiento){
        this.emisor =emisor;
        this.cupo =cupo;
        this.numeroTarjeta=numeroTarjeta;
        this.cvv = cvv;
        this.fechaVencimiento = fechaVencimiento;
    }

    //Create a getters and setters for every attributes

    //getters of every attribute.
    public String getEmisor(){
        return this.emisor;
    }
    public long getCupo(){
        return this.cupo;
    }
    public String getNumeroTarjeta(){
        return this.numeroTarjeta;

    }

    public int getCvv() {
        return this.cvv;
    }

    public LocalDate getFechaVencimiento(){
        return this.fechaVencimiento;
    }

    //setters of every attribute.


    public String setEmisor(String emisor) {
        this.emisor = emisor;
        return emisor;
    }

    public long setCupo(long cupo){
        this.cupo = cupo;
        return cupo;
    }

    public String setNumeroTarjeta(String numeroTarjeta){
        this.numeroTarjeta = numeroTarjeta;
        return numeroTarjeta;
    }

    public int setcvv(int cvv){
        this.cvv=cvv;
        return cvv;
    }

    public LocalDate setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
        return fechaVencimiento;
    }


    //method imprimir()

    public void imprimir(){

    }

}
