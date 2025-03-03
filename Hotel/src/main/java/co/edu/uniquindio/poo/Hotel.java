package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

        private String nombre;
        private List<Habitacion> habitaciones;
        private List<Cliente> clientes;
        private List<Servicio> servicios;

        public Hotel(String nombre) {
            this.nombre = nombre;
            this.habitaciones = new ArrayList<>();
            this.clientes = new ArrayList<>();
            this.servicios = new ArrayList<>();
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void agregarHabitacion(Habitacion habitacion) {
            this.habitaciones.add(habitacion);
        }

        public void registrarCliente(Cliente cliente) {
            this.clientes.add(cliente);
        }

        public void agregarServicio(Servicio servicio) {
            this.servicios.add(servicio);
        }

        public List<Habitacion> getHabitaciones() {
            return habitaciones;
        }

        public List<Cliente> getClientes() {
            return clientes;
        }

        public List<Servicio> getServicios() {
            return servicios;
        }

        @Override
        public String toString() {
            return "Hotel{" +
                    "nombre='" + nombre + '\'' +
                    ", habitaciones=" + habitaciones +
                    ", clientes=" + clientes +
                    ", servicios=" + servicios +
                    '}';
        }
    }

