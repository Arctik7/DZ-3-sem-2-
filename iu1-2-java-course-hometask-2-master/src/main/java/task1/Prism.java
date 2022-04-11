package task1;

public class Prism {
    private Figure2D base;
    private double h;

    public Prism(Figure2D base, double h) {
        this.base = base;
        this.h = h;
    }

    // метод вычисления объема
    public double volume() {
        return base.area() * h;
    }

    // площадь поверхности
    public double surfaceArea() {
        double area = 0;
        if(base.getElements().length == 1){
            double[] elements = base.getElements();
            area = 2 * 3.14 * h * elements[0] + 2 * base.area();
        } else {
            for(int i = 0; i < base.getElements().length; i++){
                double[] elements = base.getElements();
                area += elements[i] * h;
            }
            area += 2 * base.area();
        }

        return area;
    }
}
