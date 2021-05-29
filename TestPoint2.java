//6번
class ColorPoint2 extends Point{
    private String color;
    public ColorPoint2() {
        super(0, 0);
        this.color = "BLACK";
    }
    public ColorPoint2(int x, int y) {
        super(x, y);
        this.color = "BLACK";
    }
    public void setXY(int x, int y) {
        move(x, y);
    }
    public void setColor(String c) {
        this.color = c;
    }
    public String toString() {
        String res = color+"색의 ("+getX()+","+getY()+") 점";
        return res;
    }
}

public class TestPoint2 {
    public static void main(String[] args) {
        ColorPoint2 zeroPoint = new ColorPoint2(); // (0,0) 위치의 BLACK 색 점
        System.out.println(zeroPoint.toString() + "입니다.");
        ColorPoint2 cp = new ColorPoint2(10, 10); // (10,10) 위치의 BLACK 색 점
        cp.setXY(5,5);
        cp.setColor("RED");
        System.out.println(cp.toString()+"입니다.");
    }

}
