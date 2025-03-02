package co.edu.uniquindio.poo;

class Restaurante extends Servicio {
    public Restaurante(String nombre, double costo) {
        super(nombre, costo);
    }

    @Override
    public void solicitarServicio() {
        System.out.println("Servicio de restaurante solicitado.");
    }

    @Override
    public void consumir() {
        System.out.println("Consumiendo servicio de restaurante.");
    }
}
