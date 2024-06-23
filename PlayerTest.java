package com.swiggy.assignment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PlayerTest {
    
    @Test
    public void testAttack() {
        Player player = new Player(50, 5, 5);
        int attackRoll = player.attack();
        assertTrue("Attack roll should be between 1 and 6", attackRoll >= 1 && attackRoll <= 6);  
    }
    
    @Test
    public void testDefend() {
        Player player = new Player(100, 5, 10);
        int defenseRoll = player.defend();
        assertTrue("Defense roll should be between 1 and 6", defenseRoll >= 1 && defenseRoll <= 6);
    }
    @Test
    public void testReduceHealth() {
        Player player = new Player(100, 10, 5);
        
        // Reduce health by 20
        player.reduceHealth(20);
        assertEquals("Health should be reduced by 20", 80, player.getHealth());
        
        // Attempt to reduce health by 90 (more than current health)
        player.reduceHealth(90);
        assertEquals("Health should not go below zero", 0, player.getHealth());
    }

    
    @Test
    public void testisAlive() {
        // Arrange: Create a player with initial health, strength, and attack
        Player player = new Player(100, 10, 5);
        
        // Act & Assert: Verify initial state
        assertTrue("Player should be alive initially", player.isAlive());
        
        // Act: Reduce player's health to zero
        player.reduceHealth(100);
        
        // Assert: Verify player is no longer alive
        assertFalse("Player should not be alive after health drops to zero", player.isAlive());
    }
}

