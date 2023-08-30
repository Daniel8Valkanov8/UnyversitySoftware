package Entity.Student;
import Entity.Subject.Subject;
import Entity.Validation;
import Entity.Major.Major;


import java.util.ArrayList;
import java.util.Collection;


public abstract class BaseStudent implements Student{
    private String name;
    private Major major;



    protected BaseStudent(String name, Major major) {
        this.setName(name);
        this.setMajor(major);
        for (Subject subject : this.getMajor().getSubjectsInMajor()) {
            subject.getGradesByStudent().put(this, new ArrayList<>());
        }
    }

    protected void setName(String name) {
        Validation.validationName(name);
        this.name = name;
    }

    protected void setMajor(Major major) {
        this.major = major;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Major getMajor() {
        return this.major;
    }

    @Override
    public Collection<Subject> getSubjectsOfStudent() {
        return getMajor().getSubjectsInMajor();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append("Student info:")
                .append(System.lineSeparator())
                .append("Name: ")
                .append(this.getName())
                .append("Major: ")
                .append(this.getMajor());
        return sb.toString();
    }
}
