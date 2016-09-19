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
public class LuxuryCar extends Car
{
    public LuxuryCar(Location location)
    {
        super(CarType.LUXURY, location);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building luxury car");
        //add accessories
    }
}