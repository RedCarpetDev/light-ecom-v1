package org.ali.lightecomv1.MockitoTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;



import static org.junit.jupiter.api.Assertions.*;

class CalculTest {

    Calcul calcul;
    ServiceTestExample serviceMock;

    @BeforeEach
    void setUp() {
        calcul = new Calcul();
        serviceMock = mock(ServiceTestExample.class);
        when(serviceMock.getPrix(1)).thenReturn(100);
        when(serviceMock.getTauxTva(1)).thenReturn(30);
       // when(calcul.getResult(1)).thenReturn("Result");
        calcul.setServiceTestExample(serviceMock);
        
    }

    @AfterEach
    void tearDown() {
        calcul = null;
        serviceMock = null;
    }

    @Test
    void getTTC() {
        assertEquals(130,calcul.getTTC(1));
        verify(serviceMock,times(2)).getPrix(1);
    }

    @Test
    public void testPrixTTCEx(){
        Exception exception = assertThrows(IllegalArgumentException.class,()->{
            calcul.getTTC(0);
            fail("exception doit étre levée !");
        });

    }

    @Test
    void getResult() {
        assertEquals("Result",calcul.getResult(1));
    }
}
