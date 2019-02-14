package com.javafortesters.chap014JunitExplored.examples;

import com.javafortesters.domainentities.InvalidPassword;
import com.javafortesters.domainentities.User;
import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class JUnitExploredTest {

    @Ignore ("To test @Ignore method. @Before and @After methods should not run when @Ignore is run")
    @Test
    public void thisTestWillNeverFail() {
        System.out.println("method with only sysout");
    }

    @Test(expected = InvalidPassword.class)
    public void expectedInvalidPasswordException() throws InvalidPassword {
        User user = new User("username", "<6");
    }

    @Test (expected = InvalidPassword.class)
    public void constructUserWithException() throws InvalidPassword {
        User aUser = new User("username", "p");
    }

    @Test
    public void createDefaultUserWithNoThrowsInvalidPasswordException() {
        User aUser = new User();
        assertEquals("password", aUser.getPassword());
    }

//    @Test
//    public void createuserWithInvalidPasswordExceptionMessage() {
//        User aUser;
//
//        try{
//            aUser = new User("username", "p");
//            fail("an invalid pwd exception should have been thrown");
//        }catch (InvalidPassword e) {
//            assertTrue(e.getMessage().startsWith("Password must be"));
//        }
//    }

    //    @Test
//    public void canSetPasswordAfterConstructed() {
//
//        User user = new User();
//        try {
//            user.setPassword("PaZZwor6");
//        } catch (InvalidPassword invalidPassword) {
//            invalidPassword.printStackTrace();
//        }
//
//        assertEquals("Setter password expected", "PaZZwor6", user.getPassword());
//
//    }

//    @Test
//    public void setPasswordWithInvalidPasswordExceptionMessages() {
//        User aUser = new User();
//        try{
//            aUser.setPassword("tiny");
//            fail("an invalid exceptoin should have been thrown");
//        } catch (InvalidPassword e){
//            assertTrue(e.getMessage().startsWith("Password must be > 6 chars\"));"));
//        }
//    }

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void invalidPasswordThrown() throws InvalidPassword{

        expected.expect(InvalidPassword.class);
        expected.expectMessage("Password must be > 6 chars");
        User user = new User("username", "<6");
    }

    @BeforeClass
    public static void runOncePerClassBeforeAnyTests() {
        System.out.println("@BeforeClass Method");
    }

    @Before
    public void runBeforeEveryTestMethod() {
        System.out.println("@Before every method");
    }

    @AfterClass
    public static void runOncePerClassAfterAllTests() {
        System.out.println("@After class method");
    }

    @After
    public void runAfterEveryTestMethod() {
        System.out.println("@After every method");
    }
}

