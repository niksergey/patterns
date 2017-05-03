package prototype;

import java.util.ArrayList;
import java.util.List;

public class Division {
    List<Polk> polks;

    public Division() {
        polks = new ArrayList<>();
    }

    public void addPolk(Polk polk) {
        polks.add(polk);
    }

    public int getPolksNumber() {
        return polks.size();
    }
}
