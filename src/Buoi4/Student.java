package Buoi4;
import java.util.*;

public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private int score;
    public Student(){

    }

    public Student(int id, String name, int age, String address, int score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.score = score;
    }

    public void setId(int id2){
        id =id2;
    }
    public int getId(){
        return id;
    }
    public void setName( String name2){
        name = name2;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age2){
        age = age2;
    }
    public int getAge(){
        return age;
    }
    public void setAddress( String address2){
        address=address2;
    }
    public String getAddress(){
        return address;
    }
    public void setScore( int score2){
        score=score2;
    }
    public int getScore(){
        return score;
    }

    public static void main(String[] args) {
        Student student=new Student();
        student.setId(2022);
        System.out.println("id=" + student.getId());
        student.setName("Quyen");
        System.out.println(student.getName());
        student.setAddress("Dia chi");
        System.out.println(student.getAddress());
        student.setAge(19);
        System.out.println(student.getAge());
        student.setScore(9);
        System.out.println(student.getScore());
    }

}
