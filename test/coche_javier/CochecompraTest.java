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
public class CochecompraTest extends TestCase {

    public CochecompraTest(String testName) {
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
     * Test of comprar method, of class Coche.
     */
    public void testComprarAdquirir() throws Exception {
        System.out.println("Test comprar para los metodos aninados");
        int cantidad = 100;
        Coche adquirir = new Coche("Opel", 12000, 300);
        try {
            adquirir.comprar(cantidad);
            assertTrue(adquirir.obtenerStock() == 400);

        } catch (Exception e) {
            System.out.println(e);
            fail("El metodo Comprar ha fallado ");
        }

    }

    public void testComprarError() throws Exception {
        System.out.println("Test para Comprar (Valores Validos)");
        int cantidad = -4;
        int total_cantidad = 30;
        Coche error = new Coche("Opel", 2000, 26);
        try {
            error.comprar(cantidad);
            assertTrue(error.obtenerStock() == total_cantidad);

        } catch (Exception e) {
            System.out.println(e);
            fail("El metodo compra ha fallado no se a comprado");
        }

    }
}
