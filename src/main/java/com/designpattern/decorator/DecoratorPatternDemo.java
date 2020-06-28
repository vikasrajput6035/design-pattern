package com.designpattern.decorator;

public class DecoratorPatternDemo {

    public static void main(String[] args) throws Exception{
        
        // Car includes accessories like Airbags and RearParking Camera
        Car carA = new BaseModelCar();
        carA = new AirBags(carA);
        carA = new RearParkingCamera(carA);
        System.out.println("Car A with Accessories : "+carA.accessories());
        System.out.println("Car A with Total Cost : "+carA.cost());
        
        // Car includes accessories like Dual Airbags, RearParking Camera and Cruize Control
        Car carB = new BaseModelCar();
        carB = new AirBags(carB);
        carB = new AirBags(carB);
        carB = new RearParkingCamera(carB);
        carB = new CruizeControl(carB);
        System.out.println("Car B with Accessories : "+carB.accessories());
        System.out.println("Car B with Total Cost : "+carB.cost());
    }

}
