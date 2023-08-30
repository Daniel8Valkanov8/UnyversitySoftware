package Entity.Subject;

import Entity.Grade.Grade;
import Entity.Student.Student;
import Entity.Teacher.Teacher;

import java.util.List;
import java.util.Map;

public interface Subject {
    String getName();
    Teacher getTeacher();
    String getTeacherName();
    String toString();
    String toStringSubject();
    Map<Student, List<Grade>> getGradesByStudent();


}
