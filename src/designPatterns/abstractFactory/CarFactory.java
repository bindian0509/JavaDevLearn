/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designPatterns.abstractFactory;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bharat
 */
public class CarFactory {

    private CarFactory() {
        //Prevent instantiation
    }

    public static Car buildCar(CarType type) {
        Car car = null;
        Location location = Location.ASIA; //Read location property somewhere from configuration
        //Use location specific car factory
        switch (location) {
            case USA:
                car = USACarFactory.buildCar(type);
                break;
            case ASIA: {
                try {
                    car = AsiaCarFactory.buildCar(type);
                } catch (Exception ex) {
                    Logger.getLogger(CarFactory.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            default:
                car = DefaultCarFactory.buildCar(type);
        }
        return car;
    }
}
