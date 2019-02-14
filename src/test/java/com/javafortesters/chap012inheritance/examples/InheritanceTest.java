package com.javafortesters.chap012inheritance.examples;

import com.javafortesters.domainentities.AdminUser;
import com.javafortesters.domainentities.Print2DArray;
import com.javafortesters.domainentities.ReadOnlyUser;
import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InheritanceTest {

    @Test
    public void emptyUserExampleTest() {
        Print2DArray.EmptyUser enu = new Print2DArray.EmptyUser();
        assertEquals("username", enu.getUsername());
        assertEquals("password", enu.getPassword());
    }

    @Test
    public void emptyUserWithExtendedTestAppEnvClassExampleTest() {
        Print2DArray.EmptyUser enu = new Print2DArray.EmptyUser();
        assertEquals("username", enu.getUsername());
        assertEquals("password", enu.getPassword());
        assertEquals("http://192.123.0.3:67", enu.getUrl());
    }

    @Test
    public void aUserHasNormalPermissions() {
        User aUser = new User();
        assertEquals("Normal", aUser.getPermission());
    }

    @Test
    public void anAdminUserDefaultConstructor() {
        AdminUser adminuser = new AdminUser();

        assertEquals("adminuser", adminuser.getUsername());
        assertEquals("password", adminuser.getPassword());
        assertEquals("Elevated", adminuser.getPermission());
    }

    @Test
    public void anAdminUserHasElevatedtConstructor() {
        AdminUser adminuser = new AdminUser("admin","paffword");

        assertEquals("admin", adminuser.getUsername());
        assertEquals("paffword", adminuser.getPassword());
        assertEquals("Elevated", adminuser.getPermission());
    }

    @Test
    public void readOnlyUserConstructor() {
        ReadOnlyUser readOnlyUser = new ReadOnlyUser();

        assertEquals("username", readOnlyUser.getUsername());
        assertEquals("password", readOnlyUser.getPassword());
        assertEquals("ReadOnly", readOnlyUser.getPermission());
    }
}
