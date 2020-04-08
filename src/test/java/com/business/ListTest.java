package com.business;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void letsMockListSizeMethod() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        assertEquals(2, listMock.size());
    }

    @Test
    public void letsMockListSizeMethod_ReturnMultipleValues() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3);
        assertEquals(2, listMock.size());
        assertEquals(3, listMock.size());
    }

    @Test
    public void letsMockListGetMethod() {
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("my return");
        assertEquals("my return", listMock.get(0));
    }

    @Test
    public void letsMockListGetMethod_WithAnyInt() {
        List listMock = mock(List.class);
        // Argument Matcher
        when(listMock.get(anyInt())).thenReturn("my return");
        assertEquals("my return", listMock.get(0));
        assertEquals("my return", listMock.get(13));
    }

}