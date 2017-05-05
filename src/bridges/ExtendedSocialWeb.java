package bridges;

import java.util.List;

public interface ExtendedSocialWeb {
    String getHistory(int userId, String date);
    List<Integer> getLikes(int userId, boolean showNegative, int messageId);
    List<String> getPays(int userId);
}
