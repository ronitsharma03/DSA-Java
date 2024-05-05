package Generics.Comparing;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        // If diff == 0: means both are equal
        // if diff < 1: means o is bigger else o is smaller
        return (int)(this.marks - o.marks);
    }

    @Override
    public String toString() {
        return this.marks+"";
    }
}
