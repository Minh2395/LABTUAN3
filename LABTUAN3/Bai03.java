package labtuan2;
import java.util.Scanner;

class Coordinate{
    private float x;
    private float y;
    
    public float getX(){
        return x;
    }
    
    public float getY(){
        return y;
    }
    
    public Coordinate(){
        x = 0.0f;
        y = 0.0f;
    }
    
    public Coordinate(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    public float tong(){
        return x + y;
    }
    
    public Coordinate doiXung(){
        return new Coordinate(-this.x, this.y);
    }
    
    public void xuat(){
        System.out.println("(" + x + "," + y + ")");
    }
}

public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x, y;
        System.out.print("Nhap hoanh do x: ");
        x = sc.nextFloat();
        System.out.print("Nhap tung do y: ");
        y = sc.nextFloat();
        
        Coordinate p1 = new Coordinate(x,y);
        System.out.print("diem ban dau: ");
        p1.xuat();

        Coordinate doiXung = p1.doiXung();
        System.out.print("diem doi xung qua truc hoanh: ");
        doiXung.xuat();

        System.out.println("tong x + y cua diem ban dau la: " + p1.tong());
    }
}
