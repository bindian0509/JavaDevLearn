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
public class SedanCar extends Car
{
    public SedanCar(Location location)
    {
        super(CarType.SEDAN, location);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building SEDAN car");
        //add accessories
    }
}