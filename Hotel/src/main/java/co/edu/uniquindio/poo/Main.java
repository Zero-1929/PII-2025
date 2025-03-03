package co.edu.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un hotel
        Hotel hotel = new Hotel("Hotel Paraíso");

        // Crear habitaciones
        Habitacion habitacion1 = new Habitacion("101", TipoHabitacion.SIMPLE, 100.0);
        Habitacion habitacion2 = new Habitacion("102", TipoHabitacion.DOBLE, 150.0);
        hotel.agregarHabitacion(habitacion1);
        hotel.agregarHabitacion(habitacion2);

        // Crear clientes
        Cliente cliente1 = new Cliente("Juan Pérez", "12345", false);
        Cliente cliente2 = new Cliente("María Gómez", "67890", false);
        hotel.registrarCliente(cliente1);
        hotel.registrarCliente(cliente2);

        // Crear reservas
        Reserva reserva1 = new Reserva(LocalDate.of(2025, 3, 10), LocalDate.of(2025, 3, 15));
        Reserva reserva2 = new Reserva(LocalDate.of(2025, 4, 1), LocalDate.of(2025, 4, 5));
        cliente1.agregarReserva(reserva1);
        cliente2.agregarReserva(reserva2);

        // Crear servicios
        Servicio servicioHabitacion = new ServicioHabitacion("Servicio de Habitación", 50.0);
        Servicio restaurante = new Restaurante("Restaurante Gourmet", 30.0);
        Servicio limpieza = new Limpieza("Limpieza Express", 20.0);
        Servicio spa = new Spa("Spa Relax", 80.0);

        hotel.agregarServicio(servicioHabitacion);
        hotel.agregarServicio(restaurante);
        hotel.agregarServicio(limpieza);
        hotel.agregarServicio(spa);

        // Menú interactivo
        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Mostrar información del hotel");
            System.out.println("2. Mostrar clientes");
            System.out.println("3. Mostrar habitaciones");
            System.out.println("4. Mostrar reservas de un cliente");
            System.out.println("5. Solicitar servicio");
            System.out.println("6. Consumir servicio");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(hotel);
                    break;
                case 2:
                    for (Cliente c : hotel.getClientes()) {
                        System.out.println(c);
                    }
                    break;
                case 3:
                    for (Habitacion h : hotel.getHabitaciones()) {
                        System.out.println("Habitación: " + h.getNumero() + ", Tipo: " + h.getTipoHabitacion() + ", Precio: $" + h.getPrecio());
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el ID del cliente: ");
                    String idCliente = scanner.next();
                    for (Cliente c : hotel.getClientes()) {
                        if (c.getId().equals(idCliente)) {
                            System.out.println("Reservas de " + c.getNombre() + ": " + c.getReservas());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Seleccione el servicio a solicitar:");
                    System.out.println("1. Servicio de Habitación\n2. Restaurante\n3. Limpieza\n4. Spa");
                    int servicioOpcion = scanner.nextInt();
                    switch (servicioOpcion) {
                        case 1 -> servicioHabitacion.solicitarServicio();
                        case 2 -> restaurante.solicitarServicio();
                        case 3 -> limpieza.solicitarServicio();
                        case 4 -> spa.solicitarServicio();
                        default -> System.out.println("Opción no válida");
                    }
                    break;
                case 6:
                    System.out.println("Seleccione el servicio a consumir:");
                    System.out.println("1. Servicio de Habitación\n2. Restaurante\n3. Limpieza\n4. Spa");
                    int consumirOpcion = scanner.nextInt();
                    switch (consumirOpcion) {
                        case 1 -> servicioHabitacion.consumir();
                        case 2 -> restaurante.consumir();
                        case 3 -> limpieza.consumir();
                        case 4 -> spa.consumir();
                        default -> System.out.println("Opción no válida");
                    }
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 7);

        scanner.close();
}
