/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche_javier;

import junit.framework.TestCase;

/**
 *
 * @author JLV_a
 */
public class CochevenderTest extends TestCase {

    public CochevenderTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of vender method, of class Coche.
     *
     * @throws java.lang.Exception
    */ 
    public void testVenderMin() throws Exception {
        Coche VenderMin = new Coche("Opel", 1000, 45);
        System.out.println("vender");
        int cantidad = -37;
        try {
            VenderMin.vender(cantidad);
            fail("La cantidad min de coches a vender la as excedidio");
        } catch (Exception e) {
            System.out.println(e);
            assertTrue(VenderMin.obtenerStock() == 45);
        }
    }

    /**
     * Test of vender method, of class Coche.
     *
     * @throws java.lang.Exception
     */
    public void testVenderVenta() throws Exception {
        Coche Venta = new Coche("Opel", 1000, 100);
        System.out.println("vender");
        int cantidad = 60;
        int total_cantidad = 40;
        try {
            Venta.vender(cantidad);
            assertTrue(Venta.obtenerStock() == total_cantidad);
        } catch (Exception e) {
             System.out.println(e);
            fail("No se pudo realizar la venta");
        }
    }

    /**
     * Test of vender method, of class Coche.
     *
     * @throws java.lang.Exception
    */ 
    public void testVenderMax() throws Exception {
        Coche VenderMax = new Coche("Opel", 1000, 45);
        System.out.println("vender");
        int cantidad = 100;
        try {
            VenderMax.vender(cantidad);
            fail("La cantidad max de coches a vender la as excedidio");
        } catch (Exception e) {
            System.out.println(e);
            assertTrue(VenderMax.obtenerStock() == 45);
        }
    }

}
