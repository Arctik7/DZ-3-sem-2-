package task1;

public class Trapezoid extends Figure2D{
    private double a;
    private double b;
    private double c;
    private double d;

    public Trapezoid(double a, double b, double c, double d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double area(){
        double k = ((b - a) * (b - a) + c * c - d * d) / (2 * (b - a));
        return (a + b) / 2 * Math.sqrt(c * c - k * k);
    }

    public double[] getElements(){
        return new double[]{a , b, c, d};
    }
}
