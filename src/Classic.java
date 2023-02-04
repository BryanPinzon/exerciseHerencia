import java.time.LocalDate;

public class Classic extends TarjetaCredito{

    public Classic(String emisor, long cupo, String numeroTarjeta, int cvv, LocalDate fechaVencimiento){
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);

    }
    @Override
    public void imprimir(){
        System.out.println("El emisor de la tarjeta es:" + getEmisor());
        System.out.println("El cupo de la tarjeta es" + getCupo());
        System.out.println("El numero de tarjeta es:" + getNumeroTarjeta());
        System.out.println("El cvv de la tarjeta es:" + getCvv());
        System.out.println("La fecha de vencimiento es :" + getFechaVencimiento());
    }
}
