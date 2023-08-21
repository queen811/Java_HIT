package Buoi4;
import java.util.*;

public class Circle {
    private double radius;
    public Circle(){

    }
    public  double getAria(){
        return 3.14 *radius*radius;
    }
    public double getCircumference(){
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {
        Circle circle =new Circle();
        circle.radius = 2;
        System.out.println(circle.getAria());
        System.out.println(circle.getCircumference());


    }
}
