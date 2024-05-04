package Properties.inheritance;

public class Box {
    double h;
    double l;
    double w;
    static void greeting(){
        System.out.println("I am in Box class . greeting()");
    }


    // For cube
    Box(double side){
        this.h = side;
        this.w = side;
        this.l = side;
    }

    //For Square
    Box(double side1, double side2){
        this.l = side1;
        this.w = side2;
    }
    Box(double side1, double side2, double side3){
        this.l = side1;
        this.h = side2;
        this.w = side3;
    }

    //default Box
    Box(){
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }

    //Box with another box
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

}
