package oop;

import java.io.Console;
import java.util.Base64;

public class User {
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = verfyPwd(password);
        System.out.println(this.password + " test");
    }

    private String getPassword() {
        return this.password;
    }

    private String setPassword(String password) {
        this.password = password;
        return this.password;
    }

    public String login(String password, String userName) {
        if (this.getPassword().equals(Base64.getEncoder().encodeToString(password.getBytes()))) {

            return "Herzlich Willkommen " + userName;
        }
        return "Username oder Password nicht gefunden";
    }

    public void changePassword(String oldPwd, String newPwd, String repeatedPwd) {
        if (this.getPassword().equals(Base64.getEncoder().encodeToString(oldPwd.getBytes()))) {
            if (newPwd.equals(repeatedPwd)) {
                System.out.println("Passwords are equal");
                verfyPwd(newPwd);
            }
        }
    }

    // minlänge 8
    // sonderzeichen 32-47 && 58-64
    // zahlen 48-57
    // großbuchstabe 65-90
    // kleinbuchstabe 97-122
    // string.codePointAt()

    public String verfyPwd(String pwd) {
        boolean specialCharacter = false;
        boolean number = false;
        boolean upperCase = false;
        boolean lowerCase = false;
        String msg = "";
        if (pwd.length() >= 8) {
            for (int i = 0; i < pwd.length(); i++) {
                if ((pwd.codePointAt(i) >= 32 && pwd.codePointAt(i) <= 47) ||
                        (pwd.codePointAt(i) >= 58 && pwd.codePointAt(i) <= 64)) {
                    specialCharacter = true;
                }
                if (pwd.codePointAt(i) >= 48 && pwd.codePointAt(i) <= 57) {
                    number = true;
                }
                if (pwd.codePointAt(i) >= 65 && pwd.codePointAt(i) <= 90) {
                    upperCase = true;
                }
                if (pwd.codePointAt(i) >= 97 && pwd.codePointAt(i) <= 122) {
                    lowerCase = true;
                }

            }
            if (specialCharacter == true && number == true && upperCase == true && lowerCase == true) {
                msg = setPassword(Base64.getEncoder().encodeToString(pwd.getBytes()));
            } else {
                msg = "Requirements not satisfied";
            }

        } else {
            msg = "Password to short";
            Console console = System.console();
            String pwdString = console.readLine("Enter your pwd again and again again: ");
            System.out.println(pwdString);
            return verfyPwd(pwdString);

        }
        return msg;
    }
}
