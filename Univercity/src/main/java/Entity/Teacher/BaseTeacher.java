package Entity.Teacher;

import Entity.Grade.Grade;
import Entity.Student.Student;
import Entity.Subject.Subject;
import Entity.Validation;

import java.util.ArrayList;

public abstract class BaseTeacher implements Teacher {
    private String name;
    protected BaseTeacher(String name) {
        this.setName(name);
    }

    private void setName(String name) {
        Validation.validationName(name);
        this.name = name;
    }

    public void addGrade(Student student, Grade grade){
        for (Subject subject : Student.getMajorStudent().getSubjectsInMajor()) {
            subject.getGradesByStudent().computeIfAbsent(student, k -> new ArrayList<>()).add(grade);
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

   @Override
    public void printTeach() {
        String infoTeacher = "Teacher info:"
                + System.lineSeparator()
                + "Name: %s";
        System.out.printf(infoTeacher, this.getName());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append("Teacher info:")
                .append(System.lineSeparator())
                .append("Name: ")
                .append(this.getName());
        return sb.toString();
    }
}
