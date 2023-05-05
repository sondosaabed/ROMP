package Control;

import java.io.IOException;

public class LoginControl {
    private String[] UsernamesArray = {"Mays"};
    private String[] PasswordsArray = {"0000"};

//    if(login.login(name.getText().trim(),pass.getText().trim()) == true) {
//    	
//    } else {
//        name.clear();
//        pass.clear();
//        name.setPromptText("Wrong userName");
//    }
    
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
