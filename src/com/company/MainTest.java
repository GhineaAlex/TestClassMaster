package com.company;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MainTest {
    @Test
    void verifyTrue(){
        assertTrue(Main.verify(99, 101).equals("Este"));
    }
    @Test
    void verifyFalse(){
        assertTrue(Main.verify(102, 101).equals("Nu este"));
    }
    @Test
    void testEquivalenceClasses(){
        assertTrue(Main.verify(505, 909).equals("Este"));
        assertTrue(Main.verify(1202, 330).equals("Nu este"));
        assertTrue(Main.verify(2, 101).equals("Eroare"));
        assertTrue(Main.verify(100000, 2).equals("Eroare"));
    }
    @Test
    void frontiers(){
        assertTrue(Main.verify(100, 100).equals("Este"));
        assertTrue(Main.verify(100, 101).equals("Nu este"));
        assertTrue(Main.verify(10000, 10000).equals("Eroare"));
        assertTrue(Main.verify(101, 202).equals("Este"));
        assertTrue(Main.verify(999999, 543).equals("Eroare"));
        assertTrue(Main.verify(3,2).equals("Eroare"));
    }
    @Test
    void graphEffect(){
        
    }
}
