package Interfaces;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.acc();
        myCar.brake();
        myCar.stop();
        System.out.println(myCar.a); // It can also access everything specified in the object reference variable
        // but the object type will point out which version of it should be accessed



        NiceCar car = new NiceCar();
        car.start();
        car.stop();
        car.startMusic();
        car.upgradeEngine();
        car.start();
        car.stop();
        car.stopMusic();
    }
}
