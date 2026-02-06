package com.tp;

public class Triangle {
    
    /**
     * Détermine le type d'un triangle
     * @param a côté a
     * @param b côté b
     * @param c côté c
     * @return type du triangle
     */
    public String typeTriangle(int a, int b, int c) {
        // Vérification des entrées
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Non valide (côtés négatifs ou nuls)";
        }
        
        // Inégalité triangulaire
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "Non valide (inégalité triangulaire)";
        }
        
        // Détermination du type
        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || b == c || a == c) {
            return "Isocele";
        } else {
            return "Scalene";
        }
    }
    
    /**
     * Méthode main pour tester rapidement
     */
    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println("Triangle (5,5,5): " + t.typeTriangle(5, 5, 5));
        System.out.println("Triangle (5,5,3): " + t.typeTriangle(5, 5, 3));
        System.out.println("Triangle (3,4,5): " + t.typeTriangle(3, 4, 5));
        System.out.println("Triangle (0,5,5): " + t.typeTriangle(0, 5, 5));
    }
}
