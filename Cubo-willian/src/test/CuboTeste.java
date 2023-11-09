package test;

import calcula.Cubo; 
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CuboTeste {

    @Test
    public void testVolume() {
        Cubo cubo = new Cubo(); 
        assertEquals(27, cubo.volume(3)); // resultado: 27
        assertEquals(64, cubo.volume(4)); // resultado: 64
    
    }

    @Test
    public void testAreaFace() {
        Cubo cubo = new Cubo();
        assertEquals(9, cubo.areaFace(3)); // resultado: 9
        assertEquals(16, cubo.areaFace(4)); // resultado: 16
       
    }

    @Test
    public void testAreaTotal() {
        Cubo cubo = new Cubo();
        assertEquals(54, cubo.areaTotal(3)); // resultado: 54
        assertEquals(96, cubo.areaTotal(4)); // resultado: 96
        
    }

    @Test
    public void testDiagonalFace() {
        Cubo cubo = new Cubo();
        assertEquals(4, cubo.areaDiagonalFace(2)); //resultado: 4
        
    }

    @Test
    public void testDiagonalInterna() {
        Cubo cubo = new Cubo();
        assertEquals(3, cubo.diagonalinterna(1)); //resultado : 3
        assertEquals(6, cubo.diagonalinterna(2)); //resultado : 6
        
    }

    @Test
    public void testComprimentoTotalArestas() {
        Cubo cubo = new Cubo();
        assertEquals(12, cubo.totalaresta(2)); //resultado: 12
        assertEquals(24, cubo.totalaresta(4)); //resultado: 24
        
    }
}