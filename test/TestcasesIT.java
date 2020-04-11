/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static java.time.Clock.system;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author USMAN
 */
 

public class TestcasesIT {
    public String str1 = "abcabc";
     public String str3 = null;
    public  String str4 = "abcabc";
    public Testcases t= new Testcases();
		
    
    public TestcasesIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
     
    }
    
    @AfterClass
    public static void tearDownClass() {
         				
    }
    
    @Before
    public void setUp() {
        System.out.println("Before method call");
         t=new Testcases();
    }
    
    @After
    public void tearDown() {
        System.out.println("After method call");
        str1="";
        str3="";
    }

    /**
     *
     */
    @RunWith (Parameterized.class)
    public class ParameterizedTest {
        int exp;
        int a;
        int b;
    public ParameterizedTest (int expresult, int a1,int a2) {
        System.out.println("addition parameterized passed");
        exp = expresult;
        a = a1;
        b = a2;
    }
    }
    
    @Parameters
    public Collection<String[]> addition() {
        System.out.println("addition parameterized passed");
        return Arrays.asList(new String[][] { { "3", "1", "2" }, { "5", "2", "3" },
                { "7", "3", "4" }, { "9", "4", "5" }, });
    }
    
    /**
     * Test of addsTRING method, of class Testcases.
     */
    @Test
    public void testequaladdition() {
        
            System.out.println("for equal");
            String res = t.addition(str1);
           assertEquals(str4, res);
    }
    @Test
    public void testtrueaddition() {
          
           System.out.println("for true");
             assertTrue((t.addition(str1) == null ? str4 == null : t.addition(str1).equals(str4)));
           
    }
    @Test
    public void testfalseaddition() {
          
            System.out.println("for false");
           assertFalse(t.addition(str1)=="abcbbc");
    }
    
 
     @Test
    public void testNotNull() {
        //Testcases test = new Testcases();
            System.out.println("Testnotnull");
            assertNotNull(str1);
        
    }
     @Test
    public void testNull() {
        //Testcases test = new Testcases();
            System.out.println("testnull");
        assertNull(str3);
    }
    
     @Test
    public void testsame() {
       //Testcases test = new Testcases();
            System.out.println("testsame");
              assertSame(t.addition(str1), str4);
        
    }
    
    @Test
    public void testnotsame() {
      //  Testcases test = new Testcases();
            System.out.println("testnotsame");
       assertNotSame(t.addition(str1),str3);
        
    }
     @Test
    public void testfail() {
        
            System.out.println("Fail");
      
        
    }
     
}
    
   