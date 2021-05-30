package Cajero;

public class TarjetaCredito extends Tarjeta {
    public int saldoDisponible;
    public int creditoDisponible;

    //Getters & Setters

    public Integer getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        int saldoTotal = getSaldoDisponible() - saldoDisponible;
        if(saldoTotal <= 0 ){
            this.saldoDisponible = 0;
        }else{
            this.saldoDisponible = saldoTotal;
        }

    }
    public int getCreditoDisponible() {
        return creditoDisponible;
    }

    public void setCreditoDisponible(int creditoDisponible) {
        int saldoTotal = getCreditoDisponible() - creditoDisponible;
        if(saldoTotal <= 0){
            this.creditoDisponible = 0;
        }else{
            this.creditoDisponible = getCreditoDisponible() - creditoDisponible;
        }

    }
    public TarjetaCredito() {
    }
    //Metodo constructor con parametros
    public TarjetaCredito(String NIF, int PIN, String nombre, String apellido, int saldoDisponible, int creditoDisponible) {
        super(NIF, PIN, nombre, apellido);
        this.saldoDisponible = saldoDisponible;
        this.creditoDisponible = creditoDisponible;
    }

    @Override
    public String toString() {
        return "Nombre Apellido: " +getNombre() + " " + getApellido() + "\n" +
                "NIF: " +getNIF() + "\n" +
                "Saldo Disponible:" + getSaldoDisponible() + "\n"+
                "Credito Disponible: "  + getCreditoDisponible();

    }

}
