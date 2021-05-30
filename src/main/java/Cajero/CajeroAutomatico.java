package Cajero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CajeroAutomatico {
    private int idUltCaj;
    private int idCaj;
    private int [][] billetes;
    private static List<Tarjeta> tarjeta = new ArrayList<>();

    TarjetaCredito tarjetaCredito = new TarjetaCredito();
    TarjetaDebito tarjetaDebito = new TarjetaDebito();

    /* public cajeroAutomatico(){
    } */
    //Metodo constructor con cada uno de sus parametros
    public void setCajeroAutomatico(int idUltCaj, int idCaj){
        this.idUltCaj = idUltCaj;
        this.idCaj = idCaj;
        cajeroAutomatico.billetes = billetes;
    }

    //Getters & Setters
    public int getIdUltCaj() {
        return idUltCaj;
    }

    public void setIdUltCaj(int idUltCaj) {
        this.idUltCaj = idUltCaj;
    }

    public int getIdCaj() {
        return idCaj;
    }

    public void setIdCaj(int idCaj) {
        this.idCaj = idCaj;
    }

    public int[][] getBilletes() {
        return billetes;
    }

    public void setBilletes(int[][] billetes) {
        this.billetes = billetes;
    }

    public static List<Tarjeta> getTarjeta() {
        return tarjeta;
    }
    public static void setTarjeta(List<Tarjeta> tarjeta) {
        CajeroAutomatico.tarjeta = tarjeta;
    }

    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public TarjetaDebito getTarjetaDebito() {
        return tarjetaDebito;
    }

    public void setTarjetaDebito(TarjetaDebito tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }
    public void mostrarTarjeta(){

    } // Nos permitira ver los billetes que se han retirado
    public void mostrarCajero(){
        for(int i= 0; i <getBilletes().length; i++){
            System.out.println(getBilletes()[i][1]+"billetes de " + getBilletes()[i][0] +"€");
        }

    }

    public void numBilletes(int dinero){
        int dineroDisponible = 0;
        for (int i = 0; i < billetes.length; i++) {
            dineroDisponible += billetes[i][0] * billetes[i][1];
        }
        if (dinero > dineroDisponible) {
            System.out.println("El importe solicitado no está disponbile");
            System.out.println("La retirada máxima es de: " + dineroDisponible);
        } else {

            int[][] cuentaDinero= {{500, 0}, {200, 0}, {100, 0}, {50, 0}, {20, 0}, {10, 0}, {5, 0}};

            for (int i = 0; i < getBilletes().length; i++) {
                if (billetes[i][0] <= dinero) {
                    int cuentaTarjeta = dinero / billetes[i][0];
                    if (billetes[i][1] > 0) {
                        cuentaDinero[i][1] = cuentaTarjeta >= billetes[i][1] ? billetes[1][1] : cuentaTarjeta;
                        billetes[i][1] = cuentaTarjeta >= billetes[i][1] ? 0 : billetes[i][1] - cuentaTarjeta;
                        dinero = dinero - (cuentaDinero[i][1] * billetes[i][0]);
                    }
                }
            }
            System.out.println("La cantidad de dinero retira es: ");

            for (int i = 0; i < cuentaDinero.length; i++) {
                if (cuentaDinero[i][1] != 0) {
                    System.out.println(cuentaDinero[i][1] + " billete/s de " + cuentaDinero[i][0] + "€");
                }
            }
        }
    }
    //
    public void sacarDinero(){
        Scanner scanner = new Scanner(System.in); //pedir al usuario que ingrese los datos
        System.out.println("Escribe tu NIF: ");
        String nuevoNIF = scanner.nextLine();
        System.out.println("Escribe tu PIN: ");
        int nuevoPIN= scanner.nextInt();
        int dinero;

        for (int i = 0; i < getTarjeta().size(); i++) {
            if (getTarjeta().get(i).getNIF().equals(nuevoNIF)){
                System.out.println("El NIF es correcto");
                if (getTarjeta().get(i).getPIN().equals(nuevoPIN)) {
                    System.out.println("El PIN es correcto");

                     System.out.println("Introduce la cantidad de dinero que quieres retirar");
                     dinero = scanner.nextInt();
                     //System.out.println
                    //

                    if (getTarjeta().get(i) instanceof TarjetaDebito) {
                        //if (getTarjeta().get(i).getPIN().equals(nuevoPIN))

                        if (((TarjetaDebito) getTarjeta().get(i)).getSaldoDisponible() >= dinero) {
                            ((TarjetaDebito) getTarjeta().get(i)).setSaldoDisponible(dinero);

                            //Billetes(dinero);
                            numBilletes(dinero);
                            break;
                        } else {
                            System.out.println("El cajero no cuenta con suficiente dinero disponible");
                        }

                    } else if (getTarjeta().get(i) instanceof TarjetaCredito) {
                        int calculo = 0;

                        if(dinero % ((TarjetaCredito)
                                getTarjeta().get(i)).getSaldoDisponible() == 0){
                            calculo = dinero;
                        }

                        if (dinero > ((TarjetaCredito)
                                getTarjeta().get(i)).getSaldoDisponible()) {

                            ((TarjetaCredito) getTarjeta().get(i)).setSaldoDisponible(dinero);
                            ((TarjetaCredito) getTarjeta().get(i)).setCreditoDisponible(calculo);

                            numBilletes(dinero);
                        } else if (dinero > ((TarjetaCredito)
                                getTarjeta().get(i)).getSaldoDisponible()
                                && calculo == ((TarjetaCredito)
                                getTarjeta().get(i)).getCreditoDisponible()) {
                            ((TarjetaCredito)
                                    getTarjeta().get(i)).setSaldoDisponible(dinero);
                            ((TarjetaCredito)
                                    getTarjeta().get(i)).setCreditoDisponible(calculo);

                          //else if (dinero =< ((Tarjeta) getTarjeta().get(i)).getTarjeta() && calculo > ((TarjetaCredito) getTarjeta().get(i)).getCreditoDisponible()) {
                            //                            System.out.println(" ");
                            numBilletes(dinero);
                        } else if (dinero > ((TarjetaCredito) getTarjeta().get(i)).getSaldoDisponible() && calculo > ((TarjetaCredito) getTarjeta().get(i)).getCreditoDisponible()) {
                            System.out.println("No hay saldo y crédito suficiente");

                        } else if (dinero == ((TarjetaCredito) getTarjeta().get(i)).getSaldoDisponible()) {
                            ((TarjetaCredito) getTarjeta().get(i)).setSaldoDisponible(dinero);

                            numBilletes(dinero);
                        } else {
                            System.out.println("Incorrecto!");
                        }
                    }
                }
            }
        }



    }

}
