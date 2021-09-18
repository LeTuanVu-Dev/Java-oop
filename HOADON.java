/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class HOADON {
     private String maHD,ngayLap,dcg;
    Scanner sc= new Scanner(System.in);
    DsKhachHang ds=new DsKhachHang();
    public void nhapHD ()
    {
        System.out.println("Nhập mã hóa đơn");
        maHD=sc.nextLine();
        System.out.println("Nhập ngày lập");
        ngayLap=sc.nextLine();
        System.out.println("Nhập địa chỉ giao");
        dcg=sc.nextLine();
    } 
    
    public void xuatds()
    {
//        System.out.printf("\n%-20s | %\n-20s | %-20s | ","Mã HD","Ngày lập","Dia chi giao");
//        System.out.printf("\n%-20s | %\n-20s | %-20s |%-20s | %\n-20s | %-20s | ","Mã HD:",maHD,"Ngày lập:",ngayLap,"Dia chi giao:",dcg);
        System.out.println("\nMa HD:"+maHD);
        System.out.println("\nNgay lap:"+ngayLap);
        System.out.println("\nDia chi giao:"+dcg);
        
    }
    
//    public void xuatHD()
//    {
//        System.out.printf("\n%-20s | %\n-20s | %-20s | ",maHD,ngayLap,dcg);
//    }
}
