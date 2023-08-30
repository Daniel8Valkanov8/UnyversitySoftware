package Engine;

import Repository.MainRepository;

import java.util.Random;

public class University {
    private Random rand;
    private MainRepository uniRepository;
    public University(){
        this.uniRepository = new MainRepository();
    }
    public static void method1(){
        University uni = new University();
    }
    public MainRepository getUniRepository(){
        return this.uniRepository;
    }

}
