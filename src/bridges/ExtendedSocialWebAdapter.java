package bridges;

import java.util.List;

public class ExtendedSocialWebAdapter implements ExtendedSocialWeb
{
    private BasicSocialWeb basicSocialWeb;

    public ExtendedSocialWebAdapter(BasicSocialWeb extendedSocialWeb) {
        this.basicSocialWeb = extendedSocialWeb;
    }

    @Override
    public String getHistory(int userId, String date) {
        if (basicSocialWeb instanceof VkSocialWeb) {
            return new VkSocialWeb().getHistory();
        }
        if (basicSocialWeb instanceof FacebookSocialWeb) {
            return new FacebookSocialWeb().getHistory("May 4");
        }
        return null;
    }

    @Override
    public List<Integer> getLikes(int userId, boolean showNegative, int messageId) {
        if (basicSocialWeb instanceof VkSocialWeb) {
            return new VkSocialWeb().getLikes(messageId, showNegative, userId);
        }
        if (basicSocialWeb instanceof FacebookSocialWeb) {
            return new FacebookSocialWeb().getLikes(userId, messageId);
        }
        return null;
    }

    @Override
    public List<String> getPays(int userId) {
        if (basicSocialWeb instanceof VkSocialWeb) {
            return new VkSocialWeb().getPays(userId);
        }
        if (basicSocialWeb instanceof FacebookSocialWeb) {
            return new FacebookSocialWeb().getPays(userId);
        }
        return null;
    }
}
