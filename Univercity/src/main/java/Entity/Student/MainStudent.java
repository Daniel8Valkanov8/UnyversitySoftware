package Entity.Student;

import Entity.Major.Major;
import Entity.Subject.Subject;

public class MainStudent extends BaseStudent{
    protected MainStudent(String name, Major major) {
        super(name, major);
    }

    @Override
    public Subject getSubjectOfStudent(Subject subject) {
        return null;
    }
}
