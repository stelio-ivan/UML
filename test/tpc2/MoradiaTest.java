/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpc2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeje
 */
public class MoradiaTest {
    
    public MoradiaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

  
    @Test
    public void testCalcularValorEstimado() {
        System.out.println("calcularValorEstimado");
        Imovel instance = new Moradia(1, 1, 2, 0, 20, 10, 1, 1, null, "Lisboa", null);
        
        int expResult = 10500;
        int result = instance.calcularValorEstimado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
