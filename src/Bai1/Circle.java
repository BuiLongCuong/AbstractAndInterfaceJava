package Bai1;

public class Circle extends Shapes implements Resizeable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double areaCircle(){
        double S = Math.PI*radius*radius;
        return S;
    }

    @Override
    public String toString() {
        return "Bai1.Circle: radius= " + radius +", Area: "+areaCircle() ;
    }

    public void resize(double percent){
        this.radius = (percent/100)*this.radius;
    }
}
