/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.awt.Color;
import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;

/**
 *
 * @author Luana
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Shape s1 = new Circle(Color.BLACK, 2.0);
        Shape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
        
        System.out.println("Cicle color: " +s1.getColor());
        System.out.println("Circle area: " +String.format("%.3f", s1.area()));
        System.out.println("Rectangle color: " +s2.getColor());
        System.out.println("Rectangle area: " +String.format("%.3f", s2.area()));
    }
    
}
