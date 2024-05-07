package Enums;

public class Main {
    // These are enum constants
    // Public, static and final
    // since its final you can create child enums
    // type is Week
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday,Sunday;

        Week(){
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("Hello from interface ");
        }
        // this constructor gets called for every object.. why so?
        // We dont want to create new objects
        // this is not the enum concept, that's why

        // internally: Public static final Week Monday = new Week()
    }


    public static void main(String[] args) {
        Week week;
        week = Week.Sunday;
        week.hello();

        for (Week day: Week.values()){
            System.out.println(day);
        }
        // Prints the position of the obj in enum
        System.out.println(week.ordinal());
    }
}
