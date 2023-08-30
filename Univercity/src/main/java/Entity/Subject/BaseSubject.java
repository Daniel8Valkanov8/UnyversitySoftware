package Entity.Subject;
import Entity.Grade.Grade;
import Entity.Student.Student;
import Entity.Teacher.Teacher;
import Entity.Validation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public abstract class BaseSubject implements Subject {
    private String name;
    private Teacher teacher;
    private Map<Student, List<Grade>> gradesByStudent;
    protected BaseSubject(String name, Teacher teacher) {
        this.setName(name);
        this.setTeacher(teacher);
        this.gradesByStudent = new HashMap<>();
    }

    public Map<Student, List<Grade>> getGradesByStudent() {
        return gradesByStudent;
    }

    public void addGradeToStudent(Student student, Grade grade, Teacher teacher) {
        if (teacher.equals(this.getTeacher())) {
            gradesByStudent.computeIfAbsent(student, k -> new ArrayList<>()).add(grade);
        }
    }

    public void removeGradeFromStudent(Student student, Grade grade, Teacher teacher) {
        if (teacher.equals(this.getTeacher())) {
            List<Grade> grades = gradesByStudent.get(student);
            if (grades != null) {
                grades.remove(grade);
            }
        }
    }

    public List<Grade> getGradesForStudent(Student student) {
        return gradesByStudent.getOrDefault(student, new ArrayList<>());
    }

    protected void setName(String name) {
        Validation.validationName(name);
        this.name = name;
    }
    protected void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public Teacher getTeacher() {
        return this.teacher;
    }

    @Override
    public String getTeacherName() {
        return this.teacher.getName();
    }

    @Override
    public String toString() {
        String subjectInfo = "Subject Name: %s"
                +System.lineSeparator()
                +"%s";
        return String.format(subjectInfo,this.getName(),this.getTeacher().toString());
    }

    @Override
    public String toStringSubject() {
        String subjectInfo = "Subject Name: %s";
        return String.format(subjectInfo,this.getName());
    }
}
