package task3;

class VFarenheits implements Converter{
    @Override
    public double convert(double celsius){
        return 9 / 5 * celsius + 32;
    }
}
