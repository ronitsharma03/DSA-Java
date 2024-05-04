package abstractDemo;

public class Daughter extends parent{
    public Daughter(int age){
        super(age);
    }
    @Override
    void career(){
        System.out.println("I want to be a Doctor");
    }

    @Override
    void partner(){
        System.out.println("I love Iron man");
    }
}
