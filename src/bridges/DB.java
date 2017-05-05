package bridges;

import java.util.List;

public interface DB {
    List<String> getListOfFriends();

    List<String> getWall();

    int getMoney();
}
