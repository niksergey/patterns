package bridges;

import java.util.List;

public class Detective {

    public String getUserDossier(int userId, String date) {

        BasicSocialWeb facebook = new FacebookSocialWeb();
        ExtendedSocialWeb extendedSocialWeb = new ExtendedSocialWebAdapter(facebook);

        String fbHistory = extendedSocialWeb.getHistory(userId, date);
        List<Integer> fbLikes = extendedSocialWeb.getLikes(userId, true, 1);

        BasicSocialWeb vk = new VkSocialWeb();
        ExtendedSocialWeb vkExt = new ExtendedSocialWebAdapter(vk);

        String vkHistory = vkExt.getHistory(userId, date);
        List<Integer> vkLikes = vkExt.getLikes(userId, true, 1);

        return "fb: history " + fbHistory + ";\t likes: " + fbLikes +
                "\nvk: history "+ vkHistory + ";\t likes: " + vkLikes;
    }
}
