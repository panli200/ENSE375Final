package com.uregina.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import com.uregina.exceptions.InvalidDateException;
import com.uregina.exceptions.InvalidTimeException;
import com.uregina.exceptions.MoreThanOneDayException;

import org.junit.Test;

public class DateTimeTest {
    @Test
    public void substractCorrect() throws InvalidDateException, InvalidTimeException{
        Date d1= new Date(1, 1, 2012);
        Time12 t1 = new Time12(11, 30, AmPm.am); 
        DateTime dateTime1 = new DateTime(d1,t1);

        Date d2= new Date(1, 1, 2012);
        Time12 t2 = new Time12(10, 30, AmPm.am); 
        DateTime dateTime2 = new DateTime(d2,t2);

        try {
            assertEquals(60,DateTime.subtract(dateTime1,dateTime2));
        } catch (MoreThanOneDayException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
