package Entity.Student;

import Entity.Major.Major;
import Entity.Subject.Subject;

import java.util.Collection;

public interface Student {
    String getName();
    Major getMajor();
    Collection<Subject>getSubjectsOfStudent();
    String toString();
    Subject getSubjectOfStudent(Subject subject);
    static Major getMajorStudent(){
        return getMajorStudent();
    }
}
