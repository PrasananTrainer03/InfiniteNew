package com.hexaware.trainer;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;


import static org.junit.Assert.assertArrayEquals;

public class DemoTest {

    static Demo obj;
    
    @BeforeClass
    public static void setUp() {
        obj = new Demo();
    }

    @AfterClass
    public static void cleanUp() {
        obj = null;
    }

    @Before
    public void showInfo() {
        System.out.println("Test Case Getting Executed...");
    }

    @After
    public void endNoteInfo() {
        System.out.println("Test Case Executed Successfully...");
    }
    @Test 
    public void testNullDemo() {
        Demo obj1 = new Demo();
        assertNotNull(obj1);
        Demo obj2 = null;
        assertNull(obj2);
    }
    @Test 
    public void testCheck() {
    //    Demo obj = new Demo();
        assertTrue(obj.check(4));
        assertFalse(obj.check(5));
    }
    @Test 
    public void testArrayDemo() {
        int[] a = new int[]{1,5,33,77,34};
        int[] b = new int[]{1,5,33,77,34};
        assertArrayEquals(a, b);
    }
    @Test 
    public void testMinArray() {
        int[] a = new int[]{-1,6,33,8,4,32,66};
      //  Demo obj = new Demo();
        assertEquals(-1, obj.minArray(a));
    }
    @Test 
    public void testMax3() {
        // Demo obj = new Demo();
        assertEquals(5, obj.max3(5,3,2));
        assertEquals(5, obj.max3(3,5,2));
        assertEquals(5, obj.max3(2,3,5));
    }
    @Test 
    public void testSum() {
       // Demo obj = new Demo();
        assertEquals(5, obj.sum(2,3));
    }
    @Test 
    public void testSayHello() {
       // Demo obj = new Demo();
        assertEquals("Welcome to Junit...", obj.sayHello());
    }
}