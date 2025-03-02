package co.edu.uniquindio.poo;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String id;
    private boolean reservasActivas;
    private List<Reserva> reservas;

    public Cliente(String nombre, String id, boolean reservasActivas) {
        this.nombre = nombre;
        this.id = id;
        this.reservasActivas = reservasActivas;
        this.reservas = new ArrayList<>();
    }

    public void agregarReserva(Reserva reserva) {
        this.reservas.add(reserva);
        this.reservasActivas = true;
    }

    public void cancelarReserva(Reserva reserva) {
        this.reservas.remove(reserva);
        if (this.reservas.isEmpty()) {
            this.reservasActivas = false;
        }
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", reservasActivas=" + reservasActivas +
                ", reservas=" + reservas +
                '}';
    }
}
