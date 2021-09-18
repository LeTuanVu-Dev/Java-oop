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
public class SANPHAM implements Serializable{
    private String tenSP;
    private String maSP;
    private String loaiSP;
    private int soLuong;
    private float donGia;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        tenSP = sc.nextLine();
        System.out.print("Nhap ma san pham: ");
        maSP = sc.nextLine();
        System.out.print("Nhap loai san pham: ");
        loaiSP = sc.nextLine();
        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextFloat();
        
    }
    public void xuatds()
    {   
        System.out.printf("\n%-30s | %-30s | %-30s | %-30s |%-30s","Ten SP","Ma SP","Loai SP","So luong","Don gia");
    }
    public void xuat() {
        System.out.printf("\n%-30s | %-30s | %-30s | %-30s |%-30s",tenSP,maSP,loaiSP,soLuong,donGia);
//        System.out.printf("%30f", tongTien());
//        System.out.printf("%30s", timkiemSP());
//        System.out.printf("%30s", locSP());
//        System.out.printf("%30s", sapXepSP());
    }
    public float tongTien()
    {
        return soLuong*donGia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    
}
