package Cajero;

public class Tarjeta {
    private String NIF;
    private Integer PIN;
    private String nombre;
    private String apellido;
    private boolean estadoTarjeta ;

    //Getters & Setters
    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public Integer getPIN() {
        return PIN;
    }

    public void setPIN(Integer PIN) {
        this.PIN = PIN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEstado(boolean estado) {
        this.estadoTarjeta = estado;
    }
    public Tarjeta(){

    }
    // se permite el retorno de un mensaje en el cual se envia si la tarjeta esta activa
    // o no en el sistema
    public String estadoTarjeta() {
        if(estadoTarjeta){
            return "Tarjeta activa";
        } else {
            return "Tarjeta inactiva";
        }

    }
    //metodo constructor
    public Tarjeta(String NIF, Integer PIN, String nombre, String apellido, boolean estado) {
        this.NIF = NIF;
        this.PIN = PIN;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoTarjeta = estadoTarjeta;
    }

        //terminada

    //nos permite recorrer cada uno de los diferentes listas de tarjetas
        public static void mostrarTarjeta() {
            System.out.println("Tarjetas disponibles en el sistema: ");
            for (int i = 0; i < cajeroAutomatico.getRegistroTarjeta().size(); i++) {
                System.out.println(cajeroAutomatico.getRegistroTarjeta().get(i).toString());
            }

        }
//metodo override para mostrar los datos del cliente,
    //donde se mostrara el nombre, apellido y estado de la tarjeta de ese usuario
    @Override
    public String toString() {
        return
                "NIF=" + getNIF() +
                        "Nombre y apellido=" + getNombre() + " " + getApellido() + "\n" +
                        "CardStatus=" + estadoTarjeta();
    }
}
