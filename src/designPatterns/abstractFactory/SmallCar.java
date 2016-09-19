/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designPatterns.abstractFactory;

/**
 *
 * @author bharat
 */
public class SmallCar extends Car
{
    public SmallCar(Location location)
    {
        super(CarType.SMALL, location);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building SMALL car");
        //add accessories
    }
}