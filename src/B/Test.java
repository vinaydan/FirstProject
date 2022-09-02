package B;

import A.Student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setGrade(12);
        student.setId(5);
        student.setName("VD");
        System.out.println(student.getGrade()); // to get grade
        System.out.println(student.getId());
        System.out.println(student.getName());

    }
}
