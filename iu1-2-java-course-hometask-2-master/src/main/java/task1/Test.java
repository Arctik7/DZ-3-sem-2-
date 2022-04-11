package task1;

public class Test {
    public static void main(String[] args) {
        Trapezoid trap = new Trapezoid(5, 10, 3, 7);
        System.out.println(trap.area());
        Circle circle = new Circle(10);
        System.out.println(circle.area());
        Rectangular rectangular = new Rectangular(2, 3);
        System.out.println(rectangular.area());
        Triangle triangle = new Triangle(2, 3, 4);
        System.out.println(triangle.area());

        Prism prisma = new Prism(trap, 10);
        System.out.println(prisma.volume());
        System.out.println(prisma.surfaceArea());
    }
}
