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
public class Square implements Shape{
    @Override
    public  void draw() {
        System.out.println("Inside Square->draw() ");
    }
}
