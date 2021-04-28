package com.uregina.app;

import static org.junit.Assert.assertEquals;

import com.uregina.exceptions.InvalidDateException;


import org.junit.Test;
public class DateTest {

    @Test
    public void wrongFormat1()throws InvalidDateException{

        try{
            Date d1 = new Date(13, 32,2012);
            Date d2 = new Date(6, 15, 2012) ;
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch(InvalidDateException e){
        }
    }
    @Test
    public void wrongFormat2()throws InvalidDateException{

        try{
            Date d1 = new Date(13, 15, 2012);
            Date d2 = new Date(13, 15, 2012) ;
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch(InvalidDateException e){
        }
    }
    @Test
    public void wrongFormat3()throws InvalidDateException{

        try{
            Date d1 = new Date(6, 15,2012);
            Date d2 = new Date(6, 32, 2012) ;
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch(InvalidDateException e){
        }
    }

    @Test
    public void wrongFormat4()throws InvalidDateException{

        try{
            Date d1 = new Date(6, 32,2012);
            Date d2 = new Date(13, 15, 2012) ;
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch(InvalidDateException e){
        }
    }


    @Test
    public void wrongFormat5()throws InvalidDateException{

        try{
            Date d1 = new Date(13, 15,2012);
            Date d2 = new Date(6, 32, 2012) ;
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch(InvalidDateException e){
        }
    }
    @Test
    public void wrongFormat6()throws InvalidDateException{

        try{
            Date d1 = new Date(6, 32,2012);
            Date d2 = new Date(6, 15, 2012) ;
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch(InvalidDateException e){
        }
    }
    @Test
    public void wrongFormat8()throws InvalidDateException{

        try{
            Date d1 = new Date(6, 15, 2012);
            Date d2 = new Date(13, 32, 2012) ;
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch(InvalidDateException e){
        }
    }
    @Test
    public void wrongFormat9()throws InvalidDateException{

        try{
            Date d1 = new Date(12, 31, 1811);
            Date d2 = new Date(6,15, 2012) ;
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch(InvalidDateException e){
        }
    }

    @Test
    public void lessThanCorrect()throws InvalidDateException{

        try{
            Date d1 = new Date(1, 1,1812);
            Date d2 = new Date(6, 15, 2012) ;
            assertEquals(true, Date.lessThan(d1, d2));
        }
        catch(InvalidDateException e){

        }
    }
    public void lessThanFalse()throws InvalidDateException{

        try{
            Date d1 = new Date(12, 31,2212);
            Date d2 = new Date(6, 15, 2012) ;
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch(InvalidDateException e){

        }
    }
    @Test
    public void wrongFormat10()throws InvalidDateException{

        try{
            Date d1 = new Date(1, 1, 2213);
            Date d2 = new Date(6,15, 2012) ;
            assertEquals(false, Date.lessThan(d1, d2));
        }
        catch(InvalidDateException e){
        }
    }
    
}
