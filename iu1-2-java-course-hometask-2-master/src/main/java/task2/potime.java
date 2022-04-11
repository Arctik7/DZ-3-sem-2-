package task2;

public class potime extends base{
    private double zarlataVchas;

    public potime(double zarlataVchas){
        this.zarlataVchas = zarlataVchas;
    }

    public double zarplata(){
        return 20.8 * 8 * zarlataVchas;
    }
}
