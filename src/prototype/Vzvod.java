package prototype;

import java.util.ArrayList;
import java.util.List;

public class Vzvod implements Cloneable {
    List<Podrazdelenie> podrazdelenies;

    public Vzvod() {
        podrazdelenies = new ArrayList<>();
    }

    @Override
    public Vzvod clone() throws CloneNotSupportedException {
        return (Vzvod)super.clone();
    }

    public void addPodrazdelenie(Podrazdelenie podrazdelenie) {
        podrazdelenies.add(podrazdelenie);
    }

    public int getPodrazdelenieNumber() {
        return podrazdelenies.size();
    }
}
