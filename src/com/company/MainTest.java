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
        assertTrue(Main.verify(1202, 340).equals("Nu este"));
        assertTrue(Main.verify(2, 101).equals("Primul numar e prea mic"));
        assertTrue(Main.verify(100000, 2).equals("Primul numar e prea mare"));
    }
    @Test
    void frontiers(){
        
    }
}