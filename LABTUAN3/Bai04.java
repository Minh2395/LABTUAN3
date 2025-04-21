package labtuan2;
import java.util.Scanner;

class NhanVien{
    private int maSo;
    private String hoTen;
    private float luongCB;
    private int heSL;
    private float soLuong;
    
    public int getMaSo(){
        return maSo;
    }
    
    public void setMaSo(int maSo){
        this.maSo = maSo;
    } 
    
    public String getHoTen(){
        return hoTen;
    }
    
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    
    public int getHeSL(){
        return heSL;
    }
    
    public void setHeSL(int heSL){
        this.heSL = heSL;
    }
    
    public NhanVien(){
        maSo = 0;
        hoTen = null;
        luongCB = 0.0f;
        heSL = 0;
        soLuong = 0.0f;
    }
    
    public NhanVien(int maSo, String hoTen, float luongCB, int heSL, float soLuong){
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.luongCB = luongCB;
        this.heSL = heSL;
        this.soLuong = soLuong;
    }
    
    public NhanVien(NhanVien nv){
        this.maSo = nv.maSo;
        this.hoTen = nv.hoTen;
        this.luongCB = nv.luongCB;
        this.heSL = nv.heSL;
        this.soLuong = nv.soLuong;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma so: ");
        maSo = sc.nextInt();
        System.out.println("Nhap ho ten: ");
        sc.nextLine();
        hoTen = sc.nextLine();
        System.out.println("Nhap luong co ban: ");
        luongCB = sc.nextFloat();
        System.out.println("Nhap he so luong: ");
        heSL = sc.nextInt();
    }
    
    public void output(){
        System.out.println(maSo + " - " + hoTen + " - " + luongCB + " - " + heSL);
    }
    
    public float tinhLuong(){
        return (luongCB * heSL) - 1000000; 
    }
    
    public void xuatLuong(){
        System.out.println("Luong cua nhan vien la: " + tinhLuong());
    }
}

class DSNhanVien {
    private NhanVien ds[];
    private int soLuong;
    
    public void nhapDS(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong nhan vien: ");
        soLuong = sc.nextInt();
        sc.nextLine();
        ds = new NhanVien[soLuong];
        
        for(int i = 0; i < soLuong; i++){
            ds[i] = new NhanVien();
            ds[i].input();
        }
    }
    
    public void xuatDS(){
        System.out.println("Danh sach nhan vien la: \n");
        for(int i = 0; i < soLuong; i++)
            ds[i].output();
    }
    
    public void count() {
        System.out.println("So luong nhan vien trong danh sach: " + soLuong);
    }
}

public class Bai04 {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        nv1.input();
        nv1.output();
        
        NhanVien nv2 = new NhanVien(111, "Nguyen Ngoc Lan", 4200000f, 4, 0);
        nv2.output();
        
        NhanVien nv3 = new NhanVien(nv2);
        nv3.output();
        
        nv3.setHoTen("Phan Chau Tuan");
        nv3.output();
        
        int max = nv1.getHeSL();
        if(max < nv2.getHeSL()){
            max = nv2.getHeSL();
        }
        if(max < nv3.getHeSL()){
            max = nv3.getHeSL();
        }
        System.out.println("Nhan vien co he so luong cao nhat la: " + max);
        DSNhanVien dsnv = new DSNhanVien();
        dsnv.count();
    }
}
