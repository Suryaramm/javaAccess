package com.Oops;

public class CarMain {
    public static void main(String[] args) {
      
    	Car myCar = new Car();
        
      
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2023;
        
     
        myCar.start();
        myCar.accelerate();
        myCar.brake();
        
    }
}



