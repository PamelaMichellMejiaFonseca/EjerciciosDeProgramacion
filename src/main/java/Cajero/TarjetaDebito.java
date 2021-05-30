package Cajero;

public class TarjetaDebito  extends Tarjeta {

    public int saldoDisponible;


    //Getters & Setters
    public Integer getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(Integer saldoDisponible) {
        int saldoTotal = getSaldoDisponible() - saldoDisponible;
        if(saldoTotal <= 0){
            this.saldoDisponible = 0;
        } else{
            this.saldoDisponible = saldoTotal;
        }

    } //metodo constructor lo mismo que en la tarjeta de credito
    public TarjetaDebito(){} // metodo constructor vacío que debe ir siempre

    public TarjetaDebito(String NIF, int PIN, String nombre, String apellido, int saldoDisponible) {
        super(NIF, PIN, nombre, apellido);
        this.saldoDisponible = saldoDisponible;
    }
    @Override
    public String toString() {
        return "Nombre Apellido: " +getNombre() + " " + getApellido() + "\n" +
                "NIF: " +getNIF() + "\n" +
                "Saldo Disponible:" + getSaldoDisponible();

    }
}
