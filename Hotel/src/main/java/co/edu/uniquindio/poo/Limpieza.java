package co.edu.uniquindio.poo;

class Limpieza extends Servicio {
    public Limpieza(String nombre, double costo) {
        super(nombre, costo);
    }

    @Override
    public void solicitarServicio() {
        System.out.println("Servicio de limpieza solicitado.");
    }

    @Override
    public void consumir() {
        System.out.println("Consumiendo servicio de limpieza.");
    }
}
