package bridges;

import java.util.Arrays;
import java.util.List;

public class FacebookSocialWeb extends BasicSocialWeb  {
    String getHistory(String date) {
        return "FacebookSocialWeb history";
    }

    List<Integer> getLikes(int userId, int messageId) {
        return Arrays.asList(1, 2, 3);
    }

    List<String> getPays(int userId) {
        return Arrays.asList("Games: 100", "Stickers: 120", "Games: 200");
    }
}
