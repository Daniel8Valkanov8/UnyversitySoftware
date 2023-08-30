package Entity.Major;

import Entity.Validation;
import Entity.Subject.Subject;

import java.util.ArrayList;
import java.util.Collection;

public abstract class BaseMajor implements Major {
    private String name;
    private int capacity;
    private Collection<Subject> subjects;

    protected BaseMajor(String name, int capacity) {
        this.setName(name);
        this.setCapacity(capacity);
        this.setSubjects();
    }

    protected void setName(String name) {
        Validation.validationName(name);
        this.name = name;
    }

    protected void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    protected void setSubjects() {
        this.subjects = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public Collection<Subject> getSubjectsInMajor() {
        return this.subjects;
    }

    //todo
    public Subject getSubjectInMajor(){
        Subject subject = null;
        for (Subject s: this.getSubjectsInMajor()) {
            subject = s;

        }
        return subject;
    }
    @Override
    public void printMajorSubjects() {
        for (Subject s: this.getSubjectsInMajor()) {
            System.out.println(s.getName());
        }
    }
}
