package prototype;

import java.util.ArrayList;
import java.util.List;

public class Rota {
    List<Vzvod> vzvods;
    List<Ammunition> ammunitions;

    public Rota() {
        vzvods = new ArrayList<>();
        ammunitions = new ArrayList<>();
    }

    public void populateRota() {
        Vzvod prot = new Vzvod();
        try {
            addVzvod(prot.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public void addVzvod(Vzvod vzvod) {
        vzvods.add(vzvod);
    }

    public void addAmunitions(Ammunition ammunition) {
        ammunitions.add(ammunition);
    }

    public int getVzvodNumber() {
        return vzvods.size();
    }

    public int getAmmunitions() {
        return ammunitions.size();
    }
}
