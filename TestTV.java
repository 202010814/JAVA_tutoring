class TV{
    private int size;
    public TV(int size) { this.size = size; }
    protected int getSize() { return size; }
}
//1번
class ColorTV extends TV {
    private int color;
    ColorTV(int size, int c) {
        super(size);
        this.color = c;
    }
    public void printProperty() {
        System.out.println(getSize()+"인치 "+color+"컬러");
    }
}
//2번
class IPTV extends ColorTV {
    String address;
    IPTV(String a, int size, int c) {
        super(size, c);
        this.address = a;
    }
    public void printProperty() {
        System.out.print("나의 IPTV는 "+ address +" 주소의 ");
        super.printProperty();
    }

}

public class TestTV {
    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048컬러
        iptv.printProperty();
    }

}
