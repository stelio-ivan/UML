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
public class AgenciaTest {
    
    public AgenciaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    
    @Test
    public void testCalculoValorEstimadoTotal() {
        System.out.println("calculoValorEstimadoTotal");
        Agencia instance = new Agencia();
        Imovel l1= new Loja(0, 10,10 , 4, 1, null, "Lisboa", null);
        
        
        Imovel l2=new Loja(0, 20,20 ,1, 1, null, "Faro", null);
        
       

        
        instance.addImovel(l2);
        instance.addImovel(l1);
        
        int expResult = 10000+18000;
        int result = instance.calculoValorEstimadoTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    
}
