package edu.sdsu.cs160l.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * TDD for StringFormat
 *
 * Notice how every method tests a specific behavior
 */
class StringFormatTest {
    private StringFormat stringFormat;

    @BeforeEach
    public void init(){
        stringFormat = new StringFormat();
    }

    @Test
    public void throwAnExceptionIfInputIsNull(){
       assertThrows(IllegalArgumentException.class,()->stringFormat.phoneNumberFormat(null));
    }

    @Test
    public void throwAnExceptionIfInputIsEmpty(){
        assertThrows(IllegalArgumentException.class,()->stringFormat.phoneNumberFormat(""));
    }

    @Test
    public void throwAnExceptionIfInputLessThan10Char(){
        assertThrows(IllegalArgumentException.class,()->stringFormat.phoneNumberFormat("123456789"));
    }

    @Test
    public void throwAnExceptionIfInputMoreThan10Char(){
        assertThrows(IllegalArgumentException.class,()->stringFormat.phoneNumberFormat("12345678901"));
    }

    @Test
    public void validConversion(){
        assertEquals("+1 (123) 456-7890", stringFormat.phoneNumberFormat("1234567890"));
    }


}