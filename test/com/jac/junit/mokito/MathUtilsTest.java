package com.jac.junit.mokito;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author hp
 */
@RunWith(MockitoJUnitRunner.class)
public class MathUtilsTest {

    @Captor 
    ArgumentCaptor<Long> acLong;
    
   

    @Test
    public void test() {
        MathUtils mockMathUtils = mock(MathUtils.class);
        when(mockMathUtils.add(1, 1)).thenReturn(2);
        when(mockMathUtils.isInteger(anyString())).thenReturn(true);

        ArgumentCaptor<Integer> acInteger = ArgumentCaptor.forClass(Integer.class);
        ArgumentCaptor<String> acString = ArgumentCaptor.forClass(String.class);

        assertEquals(2, mockMathUtils.add(1, 1));
        assertTrue(mockMathUtils.isInteger("1"));
        assertTrue(mockMathUtils.isInteger("999"));

        verify(mockMathUtils).add(acInteger.capture(), acInteger.capture());
        List allValues = acInteger.getAllValues();
        assertEquals(List.of(1, 1), allValues);

        verify(mockMathUtils, times(2)).isInteger(acString.capture());
        List allStringValues = acString.getAllValues();
        assertEquals(List.of("1", "999"), allStringValues);
        
        
        
    }
    

    

    @Test
    public void test2() {
        //ArgumentCaptor<Long> acLong = ArgumentCaptor.forClass(Long.class);
        MathUtils mockMathUtils = mock(MathUtils.class);
        when(mockMathUtils.squareLong(2L)).thenReturn(4L);
        assertEquals(4L, mockMathUtils.squareLong(2L));
        verify(mockMathUtils).squareLong(acLong.capture());
        assertTrue(2 == acLong.getValue());
    }
    
}


