package bridges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicSocialWeb implements SocialWeb {

    private DB postgreDB = new PostgreDB();
    private List<String> friends = new ArrayList<>();
    private int money = 0;

    {
        friends.add("Alexey");
        friends.add("Artem");
        friends.add("Maria");
    }

    private List<String> notifications = Arrays.asList(
            "entry1", "entry2", "entry3"
    );

    @Override
    public List<String> getFriends() {
        return postgreDB.getListOfFriends();
    }

    @Override
    public void pay(int value) {
//        money += value;
        money += postgreDB.getMoney() + value;
    }


    @Override
    public List<String> wall() {
        return postgreDB.getWall();
    }
}
