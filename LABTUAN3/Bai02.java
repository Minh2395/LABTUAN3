package labtuan2;
import java.util.Scanner;

class PhanSo{
        private int tu;
        private int mau;
        
        public int getTu(){
            return tu;
        }
    
        public void setTu(int tu){
            this.tu = tu;
        }
        
        public int getMau(){
            return mau;
        }
    
        public void setMau(int mau){
            this.mau = mau;
        }
        
        public PhanSo(){
            tu = 0;
            mau = 1;
        }
        
        public PhanSo(int tu, int mau){
            this.tu = tu;
            this.mau = mau;
        }
        
        public PhanSo(PhanSo p){
            this.tu = p.tu;
            this.mau = p.mau;
        }
        
        public void nhapPhanSo(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap tu so: ");
            tu = sc.nextInt();
            System.out.println("Nhap mau so: ");
            mau = sc.nextInt();
        }
        
        public void xuatPhanSo(){
            System.out.println(tu + "/" + mau);
        }
        
        private int UCLN(int a, int b){
            if(a == b)
                return a;
            else if(a > b)
                return UCLN(a - b, b);
            else 
                return UCLN(a, b - a);
        }
        
        private void rutGon(){
            int ucln = UCLN(tu, mau);
            tu = tu / ucln;
            mau = mau / ucln;
        }
        
        public PhanSo cong(PhanSo p){
            PhanSo kq = new PhanSo();
            
            kq.mau = mau * p.mau;
            kq.tu = tu * p.mau + p.tu * mau;
            
            kq.rutGon();
            return kq;
        }
        
        public PhanSo nhan(PhanSo p){
            PhanSo kq = new PhanSo();
            
            kq.mau = mau * p.mau;
            kq.tu = tu * p.tu;
            
            kq.rutGon();
            return kq;
        }
    }

public class Bai02 {
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo();
        p1.nhapPhanSo();
        p1.xuatPhanSo();
        
        PhanSo p2 = new PhanSo(4, 16);
        p2.xuatPhanSo();
        
        int t, m;
        t = 5;
        m = 10;
        PhanSo p3 = new PhanSo(t, m);
        p3.xuatPhanSo();
        
        PhanSo p4 = p1.cong(p2);
        System.out.println("Tong cua phan so 1 va 2 la: ");
        p4.xuatPhanSo();
        
        PhanSo p5 = p4.nhan(p3);
        System.out.println("Tich cua ket qua phan so 1, 2 va 3: ");
        p5.xuatPhanSo();
    }
}