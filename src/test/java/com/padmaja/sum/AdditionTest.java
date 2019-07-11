package com.padmaja.sum;

import org.junit.Test;
import main.java.com.padmaja.sum.Addition;
import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    //we can replace sum
    public void test_sum_2_4() {
        //create object to the class Addition
        Addition myaddition = new Addition();
        //By using object we will call the method of that class
        int result = myaddition.sum(2,4);
        int expResult = 6;
        assertEquals(expResult, result);
    }
    @Test
    //we can replace sum
    public void test_sum_6_7() {
        //create object to the class Addition
        Addition myaddition = new Addition();
        //By using object we will call the method of that class
        int result = myaddition.sum(6,7);
        int expResult = 13;
        assertEquals(expResult, result);
    }


}