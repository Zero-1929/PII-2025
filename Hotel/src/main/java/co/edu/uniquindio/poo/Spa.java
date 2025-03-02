package co.edu.uniquindio.poo;

class Spa extends Servicio {
    public Spa(String nombre, double costo) {
        super(nombre, costo);
    }

    @Override
    public void solicitarServicio() {
        System.out.println("Servicio de spa solicitado.");
    }

    @Override
    public void consumir() {
        System.out.println("Consumiendo servicio de spa.");
    }
}

