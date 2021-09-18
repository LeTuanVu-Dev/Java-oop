/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Khachhang implements Serializable{
    private String hoten;
       private double dienthoai;
       private String ngaysinh;
       private String diachi;
//       private  DSSP ds =new DSSP() ;
       public void nhapKH(){
           Scanner sc=new Scanner(System.in);
           System.out.println("Nhap ho ten khach hang:");
           hoten=sc.nextLine();
//           sc.nextLine();
           System.out.println("Nhap so dien thoai khach hang:");
           dienthoai=sc.nextDouble();
           System.out.println("nhap ngay sinh khach hang:");
           sc.nextLine();
           ngaysinh=sc.nextLine();
           System.out.println("Nhap dia chi khach hang:");
           diachi=sc.nextLine();
//           ds.nhap();//nhap danh sach san pham
//           System.out.println("Nhap so luong san pham");
//           int n; 
//           n=sc.nextInt();
//           dssp=new SANPHAM[n];
//           for(int i=0;i<n;i++)
//           {
//               dssp[i]=new SANPHAM();
//               dssp[i].nhap();
//           }
       }
       public void xuatds()
    {
        System.out.printf("\n%-20s | %-20s | %-20s | %-20s |","Họ tên","Dien thoai","Ngay Sinh","Dia Chi");
    }
       public void xuat(){
       
//           System.out.printf("%20s ",hoten);
//           System.out.printf("%15s",dienthoai);
//           System.out.printf("%20s",ngaysinh);
//           System.out.printf("%20s",diachi);
//           System.out.printf("%20s",timkiemKH());
//           System.out.printf("%20s",locKH());
//           System.out.printf("%20s",sapxepKH());
           
           System.out.printf("\n%-20s | %-20s | %-20s | %-20s |",hoten,dienthoai,ngaysinh,diachi);
//           ds.xuat();
       }
       public String timkiemKH(){
           return hoten+dienthoai+ngaysinh+diachi;
       }
       public String locKH(){
           return timkiemKH();
       }
       public String sapxepKH(){
           return hoten;
       }
       public String gethoten(){
           return hoten;
       }
       public Double getdienthoai(){
           return dienthoai;
           
       }
       public String getngaysinh(){
           return ngaysinh;
       }
       public String getdiachi(){
           return diachi;}
       
}
