package com.javafortesters.chap010introducingcollections.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class MapTest {

    @Test
    public void mapMethod() {
        Map<String, String> nameMap = new HashMap<>();

        nameMap.put("key1","value1");
        nameMap.put("key2","value2");
        nameMap.put("key3","value3");

        nameMap.put("key1","newvalue1");

        assertEquals(3, nameMap.size());
        assertEquals("newvalue1", nameMap.get("key1"));
    }

    @Test
    public void getmapMethod() {
        Map<String, String> nameMap = new HashMap<>();

        nameMap.put("key1","value1");
        nameMap.put("key2","value2");
        nameMap.put("key3","value3");

        assertEquals(3, nameMap.size());
        assertEquals("value1", nameMap.get("key1"));
        assertEquals("value2", nameMap.get("key2"));
        assertEquals("value3", nameMap.get("key3"));
        assertEquals(null, nameMap.get("key4"));
    }

    @Test
    public void removemapMethod() {
        Map<String, String> nameMap = new HashMap<>();

        nameMap.put("key1","value1");
        nameMap.put("key2","value2");
        nameMap.put("key3","value3");

        nameMap.remove("key1");
        nameMap.remove("key5"); // Key doesn't exist , no impact.

        assertEquals(2, nameMap.size());

        assertEquals("value2", nameMap.get("key2"));
        assertEquals("value3", nameMap.get("key3"));
        assertEquals(null, nameMap.get("key4"));
    }

    @Test
    public void clearmapMethod() {
        Map<String, String> nameMap = new HashMap<>();

        nameMap.put("key1","value1");
        nameMap.put("key2","value2");
        nameMap.put("key3","value3");

        nameMap.clear();

        assertEquals(0, nameMap.size());
        assertTrue(nameMap.isEmpty());
    }

    @Test
    public void containsmapMethod() {
        Map<String, String> nameMap = new HashMap<>();

        nameMap.put("key1","value1");
        nameMap.put("key2","value2");
        nameMap.put("key3","value3");

        assertTrue(nameMap.containsKey("key1"));
        assertTrue(nameMap.containsKey("key2"));
        assertFalse(nameMap.containsKey("key23"));

        assertTrue(nameMap.containsValue("value1"));
        assertTrue(nameMap.containsValue("value2"));
        assertFalse(nameMap.containsValue("value33"));
    }

    @Test
    public void putAllMapMethod() {
        Map<String, String> nameMap = new HashMap<>();
        Map<String, String> newMap = new HashMap<>();

        nameMap.put("key1","value1");
        nameMap.put("key2","value2");
        nameMap.put("key3","value3");

        newMap.put("key1", "someone");
        newMap.put("key4", "value4");

        nameMap.putAll(newMap);

        assertEquals(4, nameMap.size());
        assertEquals("someone", nameMap.get("key1"));

        Collection<String> values = nameMap.values();
        System.out.println(values);

        Set<String> keys = nameMap.keySet();
        System.out.println(keys);

        Set<Map.Entry<String,String>> entries = nameMap.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            entry.setValue("bob");
        }

        System.out.println(entries);
    }

    @Test
    public void mapOfUserObjects() {
        Map<String, User> users = new HashMap<>();

        User user01 = new User("admin1", "password1");
        User user02 = new User("admin1", "password2");

        users.put("Key1", user01);
        users.put("Key1", user02);

        assertEquals(1, users.size());
    }
}

