package bridges;

import java.util.List;

public class Inspector {
    public String getPayDetails(int userId) {

        BasicSocialWeb facebook = new FacebookSocialWeb();
        ExtendedSocialWeb extendedSocialWeb = new ExtendedSocialWebAdapter(facebook);

        List<String> pays = extendedSocialWeb.getPays(1);

        return "Pays" + pays;
    }
}
