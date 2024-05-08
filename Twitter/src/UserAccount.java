import java.util.ArrayList;
import java.util.List;

public class UserAccount {
    private String alias;
    private String email;
    private List<UserAccount> following;
    private List<UserAccount> followers;
    private List<Tweet> tweets;
    private List<Tweet> timeline;

    public UserAccount(String alias, String email) {
        if (!Utils.isValidAlias(alias)) {
            System.out.println("El alias no es válido.");
            this.alias = "";
        } else {
            this.alias = alias;
        }

        if (!Utils.isValidEmail(email)) {
            System.out.println("El email no es válido.");
            this.email = "";
        } else {
            this.email = email;
        }

        this.following = new ArrayList<>();
        this.followers = new ArrayList<>();
        this.tweets = new ArrayList<>();
        this.timeline = new ArrayList<>();
    }

    public String toString() {
        return "Nombre de usuario: " + alias + ", Correo electrónico: " + email;
    }
}

class Utils {
    public static boolean isValidEmail(String email) {
        return email.contains("@");
    }

    public static boolean isValidAlias(String alias) {
        return alias.matches("[a-zA-Z0-9]+");
    }
}
