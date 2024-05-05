package Generics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

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
        // Arrays.sort() method can take another parameter for comparison
        // this will sort it according to their marks
        // Now it is sorting it according to increasing order to sort it in decreasing order add - to return
//        Arrays.sort(arr, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int) (o1.marks - o2.marks);
//                // to sort it in descending order
////                return -(int) (o1.marks - o2.marks);
//            }
//        });

        // In the form of lambda expressions -> easy and less syntax code
        Arrays.sort(arr, (o1, o2) -> {
            return (int) (o1.marks - o2.marks);
            // to sort it in descending order
//                return -(int) (o1.marks - o2.marks);
        });
        System.out.println(Arrays.toString(arr));


        // Here java gets confused as the object has two parameters and can't decide which one ot compare -> so throws error
//        if (ronit.compareTo(rahul) < 0){
//            System.out.println("Rahul has more marks");
//        }
    }
}
