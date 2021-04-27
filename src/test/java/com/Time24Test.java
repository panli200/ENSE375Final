package com;
import static org.junit.Assert.assertEquals;

import com.uregina.app.AmPm;
import com.uregina.app.Time24;

import org.junit.Test;

public class Time24Test {
    @Test
    public void amGetDateCorrect(){
        Time24 time24 = Time24.toTime24(10, 30, AmPm.am);
        String timeString = time24.toString();
        assertEquals("10:30",timeString  );
    }
}
