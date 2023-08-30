package Entity.Grade;

import Entity.Teacher.Teacher;

public class Grade {
        private double value;
        private Teacher teacher;

        public Grade(double value, Teacher teacher) {
            this.value = value;
            this.teacher = teacher;
        }

        public double getValue() {
            return value;
        }

        public Teacher getTeacher() {
            return teacher;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public void setTeacher(Teacher teacher) {
            this.teacher = teacher;
        }
    }

