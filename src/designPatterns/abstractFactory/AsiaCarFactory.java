/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designPatterns.abstractFactory;
import java.lang.Exception;
/**
 *
 * @author bharat
 */
public class AsiaCarFactory
{
    public static Car buildCar(CarType model) throws Exception
    {
        Car car = null;
        switch (model)
        {
            case SMALL:
            car = new SmallCar(Location.ASIA);
            break;
 
            case SEDAN:
            car = new SedanCar(Location.ASIA);
            break;
 
            case LUXURY:
            car = new LuxuryCar(Location.ASIA);
            break;
 
            default:
        Exception exception = new Exception("Unable to cast this type of car");              
            break;
        }
        return car;
    }
}