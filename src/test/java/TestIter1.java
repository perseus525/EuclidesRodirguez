/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marclo
 */
public class TestIter1 {
    
    public TestIter1() {
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

    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
 public void test3Ciencias1(){

     
     assertEquals(21 , MCD.mcdIter(756,525));
     assertEquals(12 , MCD.mcdIter(1032,180));
     

}
 
     @Test
    public void euclidesRecursivoTest(){
        assertEquals(21, MCD.mcdRecursivo(756, 525));
        assertEquals(12, MCD.mcdRecursivo(1032, 180));
    }
}
