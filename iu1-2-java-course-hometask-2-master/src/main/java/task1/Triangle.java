package task1;

public class Triangle extends Figure2D{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area(){
        double p = (a + b + c) / 2;
        return Math.pow(p * (p - a) * (p - b) * (p - c), 0.5);
    }

    public double[] getElements(){
        return new double[]{a , b, c};
    }
}
