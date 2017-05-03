package prototype;

import java.util.ArrayList;
import java.util.List;

public class Batalon {
    List<Rota> rotas;
    List<Equipment> equipments;

    public Batalon() {
        rotas = new ArrayList<>();
        equipments = new ArrayList<>();
    }

    public void addRota(Rota rota) {
        rotas.add(rota);
    }

    public int getRotaNumber() {
        return rotas.size();
    }

    public void addEquipment(Equipment equipment) {
        equipments.add(equipment);
    }

    public int getEquipmentNumber() {
        return equipments.size();
    }
}
