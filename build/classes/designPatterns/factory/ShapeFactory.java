/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designPatterns.factory;

/**
 *
 * @author bharat
 */
public class ShapeFactory {
    
    // use getShape method to get desired output for object
    public Shape getShape (String shapeType) {        
        if(shapeType == null) {
            return null;            
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
                
        return null; 
    }
}
