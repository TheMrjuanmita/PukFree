/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenfreestyle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author theju
 */
public class MavenFreeStyleTest {
    
    public MavenFreeStyleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class MavenFreeStyle.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MavenFreeStyle.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of fibonacci method, of class MavenFreeStyle.
     */
    @Test
    public void testFibonacci() {
        System.out.println("fibonacci");
        int a = 1;
        MavenFreeStyle instance = new MavenFreeStyle();
        int expResult = 1;
        int result = instance.fibonacci(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
        
    @Test
       public void testFibonacci2() {
        System.out.println("fibonacci2");
        int a = 10;
        MavenFreeStyle instance = new MavenFreeStyle();
        int expResult = 55;
        int result = instance.fibonacci(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testFibonacci3() {
        System.out.println("fibonacci3");
        int a = 2;
        MavenFreeStyle instance = new MavenFreeStyle();
        int expResult = 1;
        int result = instance.fibonacci(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    
    }
    
}
