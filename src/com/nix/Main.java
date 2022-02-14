package com.nix;

import java.util.Scanner;

public class Main {

    private String username, password;
    private Boolean validated;

    public void validate_username(String passed_username) {
        this.validated = passed_username.length() > 5 ? true : false;
    }

    public void validate_password(String passed_password) {
        if(this.validated)
            this.validated = passed_password.length() > 5 && passed_password.chars().allMatch(Character::isLetterOrDigit) ? true : false;
    }

    public String logging_in(){
        if (this.validated) {
            return "Validation: Success";
        } else {
            return "Validation: Failed";
        }
    }

    public static void main(String[] args) {
        Main x = new Main();

        System.out.print("Enter username: ");
        Scanner sc = new Scanner(System.in);
        x.username = sc.next();

        System.out.print("Enter password: ");
        x.password = sc.next();

        x.validate_username (x.username);
        x.validate_password (x.password);

        System.out.println("Username: " + x.username +"\n"+ "Password: " + x.password);
        System.out.println(x.logging_in());
    }
}
