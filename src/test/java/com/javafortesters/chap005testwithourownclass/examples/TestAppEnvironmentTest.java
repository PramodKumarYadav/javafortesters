package com.javafortesters.chap005testwithourownclass.examples;

import com.javafortesters.domainobject.TestAppEnv;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically() {

        assertEquals("Returns hard coded URL", "http://192.123.0.3:67", TestAppEnv.getUrl());

    }

    @Test
    public void canGetDomainAndPortStatically() {

        assertEquals("Just the Domain", "192.123.0.3", TestAppEnv.DOMAIN);
        assertEquals("Just the port", "67", TestAppEnv.PORT);

    }
}
