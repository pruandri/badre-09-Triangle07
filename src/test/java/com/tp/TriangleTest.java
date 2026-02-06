package com.tp;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {
    
    @Test
    public void testEquilateral() {
        Triangle t = new Triangle();
        assertEquals("Equilateral", t.typeTriangle(5, 5, 5));
        assertEquals("Equilateral", t.typeTriangle(10, 10, 10));
    }
    
    @Test
    public void testIsocele() {
        Triangle t = new Triangle();
        assertEquals("Isocele", t.typeTriangle(5, 5, 3));
        assertEquals("Isocele", t.typeTriangle(3, 5, 5));
        assertEquals("Isocele", t.typeTriangle(5, 3, 5));
    }
    
    @Test
    public void testScalene() {
        Triangle t = new Triangle();
        assertEquals("Scalene", t.typeTriangle(3, 4, 5));
        assertEquals("Scalene", t.typeTriangle(7, 5, 6));
    }
    
    @Test
    public void testNonValideCoteNegatif() {
        Triangle t = new Triangle();
        assertEquals("Non valide (côtés négatifs ou nuls)", t.typeTriangle(0, 5, 5));
        assertEquals("Non valide (côtés négatifs ou nuls)", t.typeTriangle(-1, 5, 5));
    }
    
    @Test
    public void testNonValideInegaliteTriangulaire() {
        Triangle t = new Triangle();
        assertEquals("Non valide (inégalité triangulaire)", t.typeTriangle(1, 2, 10));
        assertEquals("Non valide (inégalité triangulaire)", t.typeTriangle(10, 2, 1));
    }
}
