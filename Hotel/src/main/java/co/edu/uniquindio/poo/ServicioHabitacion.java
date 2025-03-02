package co.edu.uniquindio.poo;

class ServicioHabitacion extends Servicio {
    public ServicioHabitacion(String nombre, double costo) {
        super(nombre, costo);
    }

    @Override
    public void solicitarServicio() {
        System.out.println("Servicio de habitación solicitado.");
    }

    @Override
    public void consumir() {
        System.out.println("Consumiendo servicio de habitación.");
    }
}
