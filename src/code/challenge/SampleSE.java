package code.challenge;

import java.util.*;

public class SampleSE {

    public static void main (String[] args) {
        List<Integer> list = Arrays.asList(new Integer[]{1,2,3,4,1});
        Set<Integer> uniqueSet = new HashSet<>();
        for(int e : list) {
            if(uniqueSet.contains(e)) {
                uniqueSet.remove(e);
            } else {
                uniqueSet.add(e);
            }
        }
        System.out.println(list);
        System.out.println(uniqueSet.iterator().next());
        Collections.sort(list);
        Shape[] shapes = new Shape[2];
        Circle circle = new Circle();
        Ambiguous ambiguous = new Ambiguous();

        shapes[0] = circle;
        shapes[1] = ambiguous;

        for (Shape s : shapes) {
            s.printMe();
            System.out.println(s.computeArea());
        }
    }

    public abstract static class Shape {
        public void printMe(){
            System.out.println("I am Shape");
        }
        public abstract double computeArea();
    }

    public static class Circle extends Shape {
        private double rad = 5;

        public void printMe() {
            System.out.println("I am a Circle");
        }
        public double computeArea() {
            return rad * rad * 3.15;
        }
    }

    public static class Ambiguous extends Shape {
        private double area = 10;
        public double computeArea() {
            return area;
        }
    }
}


/*Students: StudentID*, StudentName
Courses: CourseID*, CourseName, TeacherID
StudentCourses: CourseID*, StudentID*

Implement a query to get a list of all students and how many courses each student is enrolled in

SELECT Students.StudentName, count(*)
FROM Students INNER JOIN StudentCourses
ON Students.StudentID = StudentCourses.StudentID
GROUP BY Students.StudentID*/
