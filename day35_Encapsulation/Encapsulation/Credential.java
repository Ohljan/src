package day35_Encapsulation.Encapsulation;

public class Credential {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() < 8 || password.contains(" ")) {
            System.err.println("Invalid password , please try it again ");
        }
        this.password = password;
    }
/*
    public boolean isStrongPassword() {

        boolean isValid = !(password.length() < 8 || password.contains(" "));
        boolean isUppercase = false;
        boolean isLowercase = false;
        boolean isDigit = false;
        boolean isSpecial = false;}
        /*
        for (int i = 0; i < password.length(); i++) {
            if ()
        }

        }
}
/*
create a class named Credentials
  Variables:
   username, password
 Methods:
   isStrongPassWord(): takes an argument of string and verify if the given string is strong password
   Characteristics of strong passwords are:
  1. Password MUST be at least have 8 characters long, and should not contain space
  2. PassWord should at least contain one letter
  3. Password should at least contain one special characters
  4. Password should at least contain a digit

                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password

                toString():

            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)
 */

}
