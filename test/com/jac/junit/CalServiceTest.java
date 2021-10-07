package com.jac.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author hp
 */
@RunWith(MockitoJUnitRunner.class)
public class CalServiceTest {
    
    CalService instance;
    
    @Rule
    public MyCustomRule myRule = new MyCustomRule();
    
    public CalServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       ICalculator cal = mock(ICalculator.class); 
       when(cal.add(3,4)).thenReturn(7); 
       instance = new CalService();
       instance.setCal(cal);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAddTwoNum()  {
        System.out.println("addTwoNum"+System.getProperty("os.name"));
        assertEquals("Result", 3+4, instance.addTwoNum(3, 4));
    }
    
    /*@Test(expected=NullPointerException.class)
    public void testAddTwoNum()  {
        System.out.println("addTwoNum"+System.getProperty("os.name"));
        int a=5;
        //skip test
        Assume.assumeTrue(a==5);

        assertEquals(7, instance.addTwoNum(3, 4));
        throw new NullPointerException();
    }*/
    
}
