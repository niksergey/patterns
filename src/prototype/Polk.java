package prototype;

import java.util.ArrayList;
import java.util.List;

public class Polk {
    List<Batalon> batalons;

    public Polk() {
        batalons = new ArrayList<>();
    }

    public void addBatalon(Batalon batalon) {
        batalons.add(batalon);
    }

    public int getBatalonsNumber() {
        return batalons.size();
    }
}
