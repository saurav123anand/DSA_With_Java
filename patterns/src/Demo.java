import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Demo {

    static Student student=new Student();

    public static void global(){
        parent1();
       child2();

    }
    // service
    public static void parent1(){
         child();// setting data
        System.out.println("hello world");


    }
    public static void child(){
       Student student1=new Student(1,"scooby",12);
       student=student1;
    }
    public static void child2(){
        System.out.println(student);
    }

    public static void main(String[] args) {
        global();
    }
}
