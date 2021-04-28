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
    @Test
    public void subtractWrongFormat3() throws InvalidTimeException{
        try{
            Time12 t1 = new Time12(10, 30, AmPm.pm);
            Time12 t2 = new Time12(13, 30, AmPm.pm); 
            assertNotEquals ( 31, Time12.subtract(t1, t2));
        }
        catch (InvalidTimeException e){
        } 
    }
    @Test
    public void subtractWrongFormat4() throws InvalidTimeException{
        try{
            Time12 t1 = new Time12(10, 30, AmPm.am);
            Time12 t2 = new Time12(10, 61, AmPm.pm); 
            assertNotEquals ( 31, Time12.subtract(t1, t2));
        }
        catch (InvalidTimeException e){
        } 
    }
    @Test
    public void subtractWrongFormat5() throws InvalidTimeException{
        try{
            Time12 t1 = new Time12(10, 61, AmPm.pm);
            Time12 t2 = new Time12(10, 30, AmPm.am); 
            assertNotEquals ( 31, Time12.subtract(t1, t2));
        }
        catch (InvalidTimeException e){
        } 
    }
    @Test
    public void subtractWrongFormat6() throws InvalidTimeException{
        try{
            Time12 t1 = new Time12(13, 30, AmPm.am);
            Time12 t2 = new Time12(10, 61, AmPm.pm); 
            assertNotEquals ( 31, Time12.subtract(t1, t2));
        }
        catch (InvalidTimeException e){
        } 
    }
    @Test
    public void subtractWrongFormat7() throws InvalidTimeException{
        try{
            Time12 t1 = new Time12(13, 30, AmPm.pm);
            Time12 t2 = new Time12(13, 30, AmPm.am); 
            assertNotEquals ( 31, Time12.subtract(t1, t2));
        }
        catch (InvalidTimeException e){
        } 
    }
    @Test
    public void subtractWrongFormat8() throws InvalidTimeException{
        try{
            Time12 t1 = new Time12(13, 30, AmPm.pm);
            Time12 t2 = new Time12(10, 30, AmPm.pm); 
            assertNotEquals ( 31, Time12.subtract(t1, t2));
        }
        catch (InvalidTimeException e){
        } 
    }
    @Test
    public void subtractWrongFormat9() throws InvalidTimeException{
        try{
            Time12 t1 = new Time12(13, 61, AmPm.am);
            Time12 t2 = new Time12(10, 30, AmPm.pm); 
            assertNotEquals ( 31, Time12.subtract(t1, t2));
        }
        catch (InvalidTimeException e){
        } 
    }
    @Test
    public void subtractWrongFormat10() throws InvalidTimeException{
        try{
            Time12 t1 = new Time12(13, 30, AmPm.am);
            Time12 t2 = new Time12(13, 61, AmPm.pm); 
            assertNotEquals ( 31, Time12.subtract(t1, t2));
        }
        catch (InvalidTimeException e){
        } 
    }
    @Test
    public void subtractWrongFormat11() throws InvalidTimeException{
        try{
            Time12 t1 = new Time12(10, 30, AmPm.am);
            Time12 t2 = new Time12(13, 30, AmPm.pm); 
            assertNotEquals ( 31, Time12.subtract(t1, t2));
        }
        catch (InvalidTimeException e){
        } 
    }
    @Test
    public void subtractWrongFormat12() throws InvalidTimeException{
        try{
            Time12 t1 = new Time12(10, 61, AmPm.am);
            Time12 t2 = new Time12(10, 61, AmPm.am); 
            assertNotEquals ( 31, Time12.subtract(t1, t2));
        }
        catch (InvalidTimeException e){
        } 
    }
    @Test
    public void subtractWrongFormat13() throws InvalidTimeException{
        try{
            Time12 t1 = new Time12(10, 61, AmPm.am);
            Time12 t2 = new Time12(13, 30, AmPm.pm); 
            assertNotEquals ( 31, Time12.subtract(t1, t2));
        }
        catch (InvalidTimeException e){
        } 
    }
}
