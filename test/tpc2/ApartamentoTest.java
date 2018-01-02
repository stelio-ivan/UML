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
public class ApartamentoTest {
    
    public ApartamentoTest() {
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
        Imovel instance = new Apartamento(1, 2, 1, 'a', 0, 10, 10, 15000, 1, null, "Porto", null);
        
        
        int expResult = 9900;
        int result = instance.calcularValorEstimado();
        assertEquals(expResult, result);
        System.out.println("Esperava "+expResult+"mas obtive:"+result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
