package S401TO600;

import Util.Student;

import java.util.ArrayList;
import java.util.List;

public class S455 {
    public Student[] students;
    public S455(int n)
    {
        students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student(i);
        }
    }
}
