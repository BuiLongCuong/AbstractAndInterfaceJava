package Bai2;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(10.5);
        System.out.println("Before change: " + circle.getRadius());
        circle.resize(50);
        System.out.println("After change: " + circle.getRadius());
    }
}
