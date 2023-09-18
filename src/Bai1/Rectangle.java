package Bai1;

public class Rectangle extends Shapes implements Resizeable {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double areaRectangle(){
        double S = height*width;
        return S;
    }

    @Override
    public String toString() {
        return "Bai1.Rectangle: height= " + height + ", width= " + width + ", Area: "+ areaRectangle();
    }
    public void resize(double percent){
        this.height = (percent/100)* this.height;
        this.width = (percent/100)* this.width;
    }
}
