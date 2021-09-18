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
public class NVVP implements Serializable{
    private String hoten,ngaysinh,sodt,truso;
    private int sanpham;
    private final double lcb=4000000;
    private final double hs=5000;
    public NVVP()
    {
        
    }
    public void nhapNVVP()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập họ và tên");
        hoten=sc.nextLine();
        System.out.println("Nhập ngày sinh");
        ngaysinh=sc.nextLine();
        System.out.println("Nhập số điện thoại");
        sodt=sc.nextLine();
//        System.out.println("Nhập khu vực giao hàng");
//        khuvuc=sc.nextLine();
        System.out.println("Nhập trụ sở");
        truso=sc.nextLine();
        System.out.println("Nhập số sản phẩm đã giao");
        sanpham=sc.nextInt();
        System.out.println("");
        
    }
    public void xuatds()
    {
        System.out.printf("\n%-20s | %-20s | %-20s | %-20s | %-20s |","Họ tên","Ngay sinh","SĐT","Tru so","Lương");
    }
    public void xuatNVVP()
    {
        System.out.printf("\n%-20s | %-20s | %-20s | %-20s | %-20s |",hoten,ngaysinh,sodt,truso,luong());
    }


    public NVVP(String hoten, String ngaysinh, String sodt, String truso) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.sodt = sodt;
        this.truso = truso;
    }
    

    public String getHoten() {
        return hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getSodt() {
        return sodt;
    }

    public String getTruso() {
        return truso;
    }

    public int getSanpham() {
        return sanpham;
    }
    public double luong(){
        return lcb+sanpham*hs;
    }
    
}
