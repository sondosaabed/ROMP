
import java.io.IOException;
/* 
    This class is used to make a login into the program using password
*/
public class Login {
    private String[] UsernamesArray = {"Mays"};
    private String[] PasswordsArray = {"0000"};

    public boolean login(String username, String password) throws IOException {
        @SuppressWarnings("unused")
		int z = 0;
        for (int i = 0; i < UsernamesArray.length; i++) {
            if (username.equalsIgnoreCase(UsernamesArray[i])) {
                if (password.equalsIgnoreCase(PasswordsArray[i])) {
                    return true;
                }
            }
            z++;
        }
        return false;
    }

}

