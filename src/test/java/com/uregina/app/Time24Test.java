package com.uregina.app;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Time24Test {
    @Test
    public void amGetDateCorrect(){
        Time24 time24 = Time24.toTime24(10, 30, AmPm.am);
        String timeString = time24.toString();
        assertEquals("10:30",timeString  );
    }

    @Test
    public void pmGetDateCorrect(){
        Time24 time24 = Time24.toTime24(10, 30, AmPm.pm);
        String timeString = time24.toString();
        assertEquals("22:30",timeString  );
    }

    @Test
    public void pm12GetDateCorrect(){
        Time24 time24 = Time24.toTime24(12, 30, AmPm.pm);
        String timeString = time24.toString();
        assertEquals(" 0:30",timeString  );
    }
}
