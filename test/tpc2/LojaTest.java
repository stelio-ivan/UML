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
public class LojaTest {
    
    public LojaTest() {
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
        Imovel instance = new Loja(0, 10, 10, 2, 0, null, "Maputo", null);
        int expResult = 7500;
        int result = instance.calcularValorEstimado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
