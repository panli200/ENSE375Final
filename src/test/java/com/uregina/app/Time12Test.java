package com.uregina.app;
import static org.junit.Assert.assertEquals;

import com.uregina.exceptions.InvalidTimeException;

import org.junit.Test;

public class Time12Test {
    @Test
    public void subtractCorrect() throws InvalidTimeException{
        Time12 t1 = new Time12(10, 30, AmPm.pm);
        Time12 t2 = new Time12(10, 30, AmPm.am);
       
        assertEquals ( 720, Time12.subtract(t1, t2));

    }
    
}
