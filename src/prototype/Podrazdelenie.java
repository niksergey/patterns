package prototype;

import java.util.ArrayList;
import java.util.List;

public class Podrazdelenie {
    private List<Trooper> troopers;

    public Podrazdelenie() {
        troopers = new ArrayList<>();
    }

    public void addTrooper(Trooper trooper) {
        troopers.add(trooper);
    }

    public int getTroopersNumber() {
        return troopers.size();
    }
}
