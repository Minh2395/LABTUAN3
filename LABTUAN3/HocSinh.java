/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtuan2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HocSinh {
    private int maSo;
    private String hoTen;
    private float dtb;
    
    public int getMaso(){
        return maSo;
    }
    
    public void setMaso(int maSo){
        this.maSo = maSo;
    }
    
    public String getHoten(){
        return hoTen;
    }
    
    public void setHoten(String hoTen){
        this.hoTen = hoTen;
    }
    
    public float getDtb(){
        return dtb;
    }
    
    public void setDtb(float dtb){
        this.dtb = dtb;
    }
    
    public HocSinh(){
        this.maSo = 0;
        this.hoTen = null;
        this.dtb = 0f;
    }
    
    public HocSinh(int maSo, String hoTen, float dtb){
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.dtb = dtb;
    }
    
    public HocSinh(HocSinh tmp){
        this.maSo = tmp.maSo;
        this.hoTen = tmp.hoTen;
        this.dtb = tmp.dtb;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma so: ");
        maSo = sc.nextInt();
        System.out.println("Nhap ho ten: ");
        sc.nextLine();
        hoTen = sc.nextLine();
        System.out.println("Nhap diem trung binh: ");
        dtb = sc.nextFloat();
    }
    
    public void output(){
        System.out.println(maSo + " - " + hoTen + " - " + dtb);
    }
    
    public void rank(){
        if(dtb < 5)
            System.out.println("Xep loai yeu");
        else{
            if(dtb >= 5 && dtb < 7)
                System.out.println("Xep loai trung binh");
            else{
                if(dtb >= 7 && dtb < 8)
                    System.out.println("Xep loai kha");
                else{
                    if(dtb >= 8 && dtb < 9)
                        System.out.println("Xep loai gioi");
                    else
                        System.out.println("Xep loai xuat sac");
                }
            }
        }
    }
}
