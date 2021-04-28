package com.uregina.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;



import com.uregina.exceptions.InvalidDateException;


import org.junit.Test;
public class DateTest {
    @Test
    public void lessThanCorrect()throws InvalidDateException{

        try{
            Date d1 = new Date(13, 32,2012);
            Date d2 = new Date(6, 15, 2012) ;
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch(InvalidDateException e){

        }
    }

    
    
}
