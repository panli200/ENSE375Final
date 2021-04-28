package com.uregina.app;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import com.uregina.exceptions.InvalidTimeException;

import org.junit.Test;

public class Time12Test {
    @Test
    public void subtractCorrect() throws InvalidTimeException{
        Time12 t1 = new Time12(10, 30, AmPm.pm);
        Time12 t2 = new Time12(10, 30, AmPm.am);  

        assertEquals ( 720, Time12.subtract(t1, t2));
    }

    @Test
    public void subtractWrongFormat() throws InvalidTimeException{
        try{
            Time12 t1 = new Time12(13, 61, AmPm.am);
            Time12 t2 = new Time12(13, 30, AmPm.am); 
            assertEquals ( 31, Time12.subtract(t1, t2));
        }
        catch (InvalidTimeException e){

        }
       
    }

    @Test
    public void subtractWrongFormat2() throws InvalidTimeException{
        try{
            Time12 t1 = new Time12(13, 30, AmPm.pm);
            Time12 t2 = new Time12(10, 30, AmPm.pm); 
            assertNotEquals ( 31, Time12.subtract(t1, t2));
        }
        catch (InvalidTimeException e){

        }
       
    }
    
}
