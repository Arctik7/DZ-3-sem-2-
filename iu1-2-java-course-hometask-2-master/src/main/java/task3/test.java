package task3;

public class test {
    public static void main(String[] args) {
        double p = new VKelvins().convert(10);
        double q = new VFarenheits().convert(10);
        System.out.println("10 " + p + " " + q);
    }
}
