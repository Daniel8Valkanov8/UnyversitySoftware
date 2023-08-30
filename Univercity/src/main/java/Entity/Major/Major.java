package Entity.Major;

import Entity.Subject.Subject;

import java.util.Collection;

public interface Major {
    String getName();
    int getCapacity();
    Collection<Subject> getSubjectsInMajor();
    String toString();
    void printMajorSubjects();



}
