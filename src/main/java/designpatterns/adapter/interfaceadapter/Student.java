package designpatterns.adapter.interfaceadapter;

public class Student {
    public static void main(String[] args) {
        StudentImpl student = new StudentImpl();
        student.speakAge();
        student.speakLook();
    }
}
