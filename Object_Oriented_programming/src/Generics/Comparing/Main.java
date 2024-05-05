package Generics.Comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student ronit = new Student(12, 89.76f);
        Student rahul = new Student(5, 99.56f);
        Student amit = new Student(4, 99.0f);
        Student amit1 = new Student(6, 92.0f);
        Student amit2 = new Student(7, 93.0f);
        Student amit3 = new Student(8, 94.0f);


        Student[] arr = {ronit, rahul, amit3, amit2, amit1, amit};

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        // Here java gets confused as the object has two parameters and can't decide which one ot compare -> so throws error
//        if (ronit.compareTo(rahul) < 0){
//            System.out.println("Rahul has more marks");
//        }
    }
}
