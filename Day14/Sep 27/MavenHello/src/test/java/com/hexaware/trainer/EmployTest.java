package com.hexaware.trainer;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

public class EmployTest {

    @Test 
    public void testGettersAndSetters() {
        Employ employ = new Employ();
        employ.setEmpno(1);
        employ.setName("Thejaswini");
        employ.setDept("Java");
        employ.setDesig("Programmer");
        employ.setBasic(88822);

        assertEquals(1, employ.getEmpno());
        assertEquals("Thejaswini", employ.getName());
        assertEquals("Java", employ.getDept());
        assertEquals("Programmer", employ.getDesig());
        assertEquals(88822, employ.getBasic(), 0);
    }
    @Test 
    public void testConstructor() {
        Employ employ = new Employ();
        assertNotNull(employ);
        Employ emp1 = new Employ(1, "Akash", "Java", "Programmer", 88422);
        assertEquals(1, emp1.getEmpno());
        assertEquals("Akash", emp1.getName());
        assertEquals("Java", emp1.getDept());
        assertEquals("Programmer", emp1.getDesig());
        assertEquals(88422, emp1.getBasic(), 0);
    }
}