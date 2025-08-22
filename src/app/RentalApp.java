package app;

import java.util.*;

public class SistemaArriendo {

    static class Cliente {
        private String id;
        private String nombre;

        public Cliente(String id, String nombre) {
            this.id = id;
            this.nombre = nombre;
        }

        public String getId() { return id; }
        public void setId(String id) { this.id = id; }

        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }

        @Override
        public String toString() {
            return "Cliente [id=" + id + ", nombre=" + nombre + "]";
        }
    }

    static class Equipo {
        private String codigo;
        private String nombre;
        private boolean disponible;

        public Equipo(String codigo, String nombre) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.disponible = true;
        }

        public String getCodigo() { return codigo; }
        public void setCodigo(String codigo) { this.codigo = codigo; }

        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }

        public boolean isDisponible() { return disponible; }
        public void setDisponible(boolean disponible) { this.disponible = disponible; }

        @Override
        public String toString() {
            return "Equipo [codigo=" + codigo + ", nombre=" + nombre + ", disponible=" + disponible + "]";
        }
    }

    static class Sucursal {
        private String nombre;
        private List<Equipo> listaEquipos;

        public Sucursal(String nombre) {
            this.nombre = nombre;
            this.listaEquipos = new ArrayList<>();
        }

        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }

        public List<Equipo> getListaEquipos() { return listaEquipos; }

        public void agregarEquipo(Equipo eq) {
            listaEquipos.add(eq);
        }

        @Override
        public String toString() {
            return "Sucursal [nombre=" + nombre + ", cantidadEquipos=" + listaEquipos.size() + "]";
        }
    }

    static class Arriendo {
        private Cliente cliente;
        private Equipo equipo;
        private Date fecha;

        public Arriendo(Cliente cliente, Equipo equipo) {
            this.cliente = cliente;
            this.equipo = equipo;
            this.fecha = new Date();
            equipo.setDisponible(false);
        }

        public Cliente getCliente() { return cliente; }
        public Equipo getEquipo() { return equipo; }
        public Date getFecha() { return fecha; }

        @Override
        public String toString() {
            return "Arriendo [cliente=" + cliente.getNombre() + ", equipo=" + equipo.getNombre() + ", fecha=" + fecha + "]";
        }
    }

    public static void main(String[] args) {
        return;
    }
}
