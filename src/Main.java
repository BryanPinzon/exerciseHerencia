import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        TarjetaCredito classic = new Classic("Visa", 1200000, "986754", 123, LocalDate.parse("2023-05-02"));
        TarjetaCredito gold = new Gold("MasterCard", 250000, "12848", 654, LocalDate.parse("2026-02-22"));
        TarjetaCredito platinum = new Platinum("American Express", 530000, "9532523", 541, LocalDate.parse("2030-01-23"));
        TarjetaCredito black = new Black("Visa", 700000, "1259129", 991, LocalDate.parse("2027-06-21"));
        System.out.println("Los datos de la tarjeta Classic son: ");
        classic.imprimir();
        System.out.println("=============================");
        System.out.println("Los datos de la tarjeta Gold son: ");
        gold.imprimir();
        System.out.println("=============================");
        System.out.println("Los datos de la tarjeta Platinum son: ");
        platinum.imprimir();
        System.out.println("=============================");
        System.out.println("Los datos de la tarjeta Black son: ");
        black.imprimir();
        System.out.println("=============================");




    }
}