
package labtuan2;


public class Demo1 {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh();
        hs1.input();
        hs1.output();
        
        HocSinh hs2 = new HocSinh(111, "Nguyen Ngoc Lan", 8.5f);
        hs2.output();
        
        HocSinh hs3 = new HocSinh(hs2);
        hs3.output();
        
        hs3.setHoten("Phan Chau Tuan");
        hs3.output();
        
        float max = hs1.getDtb();
        String ht = hs1.getHoten();
        if(max < hs2.getDtb()){
            max = hs2.getDtb();
            ht = hs2.getHoten();
        }
        if(max < hs3.getDtb()){
            max = hs3.getDtb();
            ht = hs3.getHoten();
        }
        System.out.println("Hoc sinh " + ht + " co DTB cao nhat la: " + max);
    }
}
