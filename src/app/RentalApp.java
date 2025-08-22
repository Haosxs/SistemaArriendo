package app;
import java.util.*;

public class RentalApp {

    // ==================== CLASE CLIENTE ====================
    static class Client {
        private String id;
        private String name;

        public Client(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() { return id; }
        public void setId(String id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String toString() {
            return "Cliente [id=" + id + ", nombre=" + name + "]";
        }
    }

    static class Equipment {
        private String code;
        private String name;
        private boolean available;

        public Equipment(String code, String name) {
            this.code = code;
            this.name = name;
            this.available = true;
        }

        public String getCode() { return code; }
        public void setCode(String code) { this.code = code; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public boolean isAvailable() { return available; }
        public void setAvailable(boolean available) { this.available = available; }

        @Override
        public String toString() {
            return "Equipo [codigo=" + code + ", nombre=" + name + ", disponible=" + available + "]";
        }
    }

    // ==================== CLASE SUCURSAL ====================
    static class Branch {
        private String name;
        private List<Equipment> equipments;

        public Branch(String name) {
            this.name = name;
            this.equipments = new ArrayList<>();
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public List<Equipment> getEquipments() { return equipments; }

        public void addEquipment(Equipment eq) {
            equipments.add(eq);
        }

        @Override
        public String toString() {
            return "Sucursal [nombre=" + name + ", equipos=" + equipments.size() + "]";
        }
    }

    static class Rental {
        private Client client;
        private Equipment equipment;
        private Date date;

        public Rental(Client client, Equipment equipment) {
            this.client = client;
            this.equipment = equipment;
            this.date = new Date();
            equipment.setAvailable(false);
        }

        public Client getClient() { return client; }
        public Equipment getEquipment() { return equipment; }
        public Date getDate() { return date; }

        @Override
        public String toString() {
            return "Arriendo [cliente=" + client.getName() + ", equipo=" + equipment.getName() + ", fecha=" + date + "]";
        }
    }
    public static void main(String[] args) {
    	return;
    }
}