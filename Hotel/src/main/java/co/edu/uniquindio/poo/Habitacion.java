package co.edu.uniquindio.poo;

class Habitacion {
    private String numero;
    private TipoHabitacion tipoHabitacion;
    private double precio;

    public Habitacion(String numero, TipoHabitacion tipoHabitacion, double precio) {
        this.numero = numero;
        this.tipoHabitacion = tipoHabitacion;
        this.precio = precio;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
