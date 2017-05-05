package bridges;

import java.util.Arrays;
import java.util.List;

public class PostgreDB implements DB {
    @Override
    public List<String> getListOfFriends() {
        return Arrays.asList("Misha",
                "Vanya",
                "Liza");
    }

    @Override
    public List<String> getWall() {
        return Arrays.asList("postgre story1", "Smart thought", "postgre story 3");
    }

    @Override
    public int getMoney() {
        return 150;
    }
}
