package com.javafortesters.domainentities;

public class ReadOnlyUser extends User {
    public ReadOnlyUser() {
        this("readonlyuser", "password");
    }

    public ReadOnlyUser(String username, String password){
        super("username", "password");
    }

    @Override
    public String getPermission() {
        return "ReadOnly";
    }
}
