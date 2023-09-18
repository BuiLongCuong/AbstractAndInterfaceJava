package Bai1;

public class Square extends Shapes implements Resizeable{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double areaSquare(){
        double S = Math.pow(side, 2);
        return S;
    }

    @Override
    public String toString() {
        return "Bai1.Square: side= " + side+", Area: "+areaSquare() ;
    }
    public void resize(double percent){
        this.side = (percent/100)*this.side;
    }

}
