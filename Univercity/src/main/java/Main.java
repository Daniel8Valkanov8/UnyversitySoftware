import Entity.Teacher.MainTeacher;
import Entity.Teacher.Teacher;
import Entity.Major.MainMajor;
import Entity.Major.Major;
import Entity.Subject.MainSubject;
import Entity.Subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new MainTeacher("Nasko");
        Teacher teacher1 = new MainTeacher("Ivan");
        Subject subject = new MainSubject("Biology",teacher);
        Subject subject1 = new MainSubject("Math",teacher1);
        Major major = new MainMajor("BiologyDegree");
        major.getSubjectsInMajor().add(subject1);
        major.getSubjectsInMajor().add(subject);
        major.printMajorSubjects();

    }

}