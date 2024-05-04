package Properties.inheritance;

public class Boxweight extends Box{
    double weight;
    public Boxweight(){
        this.weight = -1;
    }
    Boxweight (Boxweight old){
        super(old);
        this.weight = old.weight;
    }

    Boxweight(double l, double h, double w, double weight){
//        super(l, h, w); // Syntax to call the parent class constructor
        System.out.println(super.h);
        this.weight = weight; // If any of the parameters are private in the super class base class cannot access it
    }

    Boxweight(double side, double weight){
        super(side);
        this.weight = weight;
    }

//    Boxweight box3 = new Boxweight();
static void greeting(){
    System.out.println("I am in Box class . greeting()");
}

}
