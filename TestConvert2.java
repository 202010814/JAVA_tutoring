//4번
class Km2Mile extends Converter {
    public Km2Mile(double r) {
        this.ratio = r;
    }
    protected double convert(double src) {
        return src/ratio;
    }
    protected String getSrcString() { return "Km"; }
    protected String getDestString() { return "mile"; }
}

public class TestConvert2 {
    public static void main(String args[]) {
        Km2Mile toMile = new Km2Mile(1.6); // 1 마일은 1.6km
        toMile.run();
    }
}
