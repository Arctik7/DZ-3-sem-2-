package task1;

public class Circle extends Figure2D{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return 3.14 * radius * radius;
    }

    public double[] getElements(){
        return new double[]{radius};
    }
}
