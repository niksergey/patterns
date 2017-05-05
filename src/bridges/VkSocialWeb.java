package bridges;

import java.util.Arrays;
import java.util.List;

public class VkSocialWeb extends BasicSocialWeb {
    public String getHistory() {
        return "VKSocialWeb history";
    }

    List<Integer> getLikes(int messageId, boolean shownegatives, int userId) {
        return Arrays.asList(7, 8, 9);
    }

    List<String> getPays(int userId) {
        return Arrays.asList("Likes: 50", "Stickers: 90", "Music: 200");
    }
}
