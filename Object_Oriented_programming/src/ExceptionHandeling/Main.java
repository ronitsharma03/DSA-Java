package ExceptionHandeling;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try{
//            divide(a, b);
            String name="Ronit";
            if(name.equals("Ronit")){
                throw new CustomException("My custom exception");
            }
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a/b;
    }
}
