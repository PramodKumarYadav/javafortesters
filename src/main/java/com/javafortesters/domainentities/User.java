package com.javafortesters.domainentities;

import com.javafortesters.domainobject.TestAppEnv;

public class User extends TestAppEnv {

    public String publicusername;
    
    private String username;
    private String password;

    public User()  {

        this("username", "password" );
    }

    public User(String username, String password)  {
        this.username = username;
        setPassword(password);

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

//    public void setPassword(String password) throws InvalidPassword {
//        if(password.length()<7){
//            throw new InvalidPassword("Password must be > 6 chars");
//        }
//        this.password = password;
//    }

    public void setPassword(String password)  {
        if (password.length() < 7) {
            throw new IllegalArgumentException("Password must be > 6 chars");
        }
        this.password = password;
    }

    public String getPermission() {

        return "Normal";
    }
}
