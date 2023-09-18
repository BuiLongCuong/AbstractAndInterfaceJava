package Bai1;
public class Main {
    public static void main(String[] args) {
//        Random r = new Random();
//        Shape[] shapes = new Shape[3];
//        int size =0;
//        shapes[size++] = new Circle(6.7);
//        shapes[size++] = new Square(9);
//        shapes[size++] = new Rectangle(12,26);
//        for (int i = 0; i < size; i++) {
//            if(shapes[i] instanceof Circle){
//
//            }
//        }

        Bai1.Circle a = new Bai1.Circle(6.7);
        System.out.println("Before: "+a);
        a.resize(50);
        System.out.println("After: "+ a);

        System.out.println("----------------------------------------------");

        Bai1.Square b = new Bai1.Square(9);
        System.out.println("Before: "+b);
        b.resize(75);
        System.out.println("After: "+b);

        System.out.println("----------------------------------------------");

        Rectangle c = new Rectangle(12,26);
        System.out.println("Before: "+c);
        c.resize(76);
        System.out.println("After: "+c);

    }
}
