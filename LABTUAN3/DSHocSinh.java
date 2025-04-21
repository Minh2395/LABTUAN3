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
public class DSHocSinh {
    private HocSinh ds[];
    private int soLuong;
    
    public void nhapDS(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong hoc sinh: ");
        soLuong = sc.nextInt();
        sc.nextLine();
        ds = new HocSinh[soLuong];
        
        for(int i = 0; i < soLuong; i++){
            ds[i] = new HocSinh();
            ds[i].input();
        }
    }
    
    public void xuatDS(){
        System.out.println("Danh sach hoc sinh la: \n");
        for(int i = 0; i < soLuong; i++)
            ds[i].output();
    }
    
    public void sapXep(){
        for(int i = 0; i < soLuong - 1; i++){
            for(int j = i + 1; j < soLuong; j++){
                if(ds[i].getDtb() < ds[j].getDtb()){
                    HocSinh temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }
    }
}
