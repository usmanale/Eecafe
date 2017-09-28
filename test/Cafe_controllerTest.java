/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author baou usman
 */
public class Cafe_controllerTest {
    
    public Cafe_controllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setfooditems method, of class Cafe_controller.
     */

    
    @Test
    public void testCalculate_Bill_count() {
        System.out.println("Calculate_Bill_count");
        int prize_index = 0;
        Cafe_model c=new Cafe_model();
        Cafe_view v=new Cafe_view();
        Cafe_controller instance = new Cafe_controller(c,v);
        c.Item_Prizes.add(5);
        int expResult = 5;
        int result = instance.Calculate_Bill_count(prize_index);
        assertEquals(expResult, result);
    }

    /**
     * Test of Order_time method, of class Cafe_controller.
     */
    @Test
    public void testOrder_time() {
        System.out.println("Order_time");
        Cafe_model c=new Cafe_model();
        Cafe_view v=new Cafe_view();
        Cafe_controller instance = new Cafe_controller(c,v);
        boolean expResult = true;
        boolean result = instance.Order_time();
        assertEquals(expResult, result);
    }
    
}
