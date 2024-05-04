package Interfaces;

public class Car implements Engine, Brake{

    int a = 200;
    @Override
    public void brake() {
        System.out.println("I brake like a sports car");
    }

    @Override
    public void start() {
        System.out.println("I start like a muscle car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a f1 car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a Hyper car");
    }
}
