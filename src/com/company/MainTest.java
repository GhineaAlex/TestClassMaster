package com.company;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MainTest {
    @Test
    void verifyTrue(){
        assertTrue(Main.verify(99, 101).equals("Par"));
    }
    @Test
    void verifyFalse(){
        assertTrue(Main.verify(102, 101).equals("Impar"));
    }
    @Test
    void testEquivalenceClasses(){
        assertTrue(Main.verify(505, 909).equals("Par"));
        assertTrue(Main.verify(1202, 330).equals("Impar"));
        assertTrue(Main.verify(2, 101).equals("Eroare"));
        assertTrue(Main.verify(100000, 2).equals("Eroare"));
    }
    @Test
    void frontiers(){
        assertTrue(Main.verify(100, 100).equals("Par"));
        assertTrue(Main.verify(100, 101).equals("Impar"));
        assertTrue(Main.verify(10000, 10000).equals("Eroare"));
        assertTrue(Main.verify(101, 99).equals("Eroare"));
        assertTrue(Main.verify(101,100000).equals("Eroare"));
        assertTrue(Main.verify(999999, 543).equals("Eroare"));
        assertTrue(Main.verify(3,2).equals("Eroare"));
    }
    @Test
    void graphEffect(){
        assertTrue(Main.verify(123, 1231).equals("Impar"));
        assertTrue(Main.verify(12, 123).equals("Eroare"));
        assertTrue(Main.verify(1230, 123).equals("Par"));
    }
}
