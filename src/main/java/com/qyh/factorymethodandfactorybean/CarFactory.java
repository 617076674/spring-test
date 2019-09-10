package com.qyh.factorymethodandfactorybean;

public class CarFactory {
   //非静态方法
   public Car createCar(){
       Car car = new Car();
       car.setBrand("BMW");
       return car;
   }
   
   //静态方法
   public static Car createStaticCar(){
       Car car = new Car();
       return car;
   }
}