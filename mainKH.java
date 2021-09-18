/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class mainKH {
//         public final static void clearConsole()
//{
//    try
//    {
//        final String os = System.getProperty("os.name");
//
//        if (os.contains("Windows"))
//        {
//            Runtime.getRuntime().exec("cls");
//        }
//        else
//        {
//            Runtime.getRuntime().exec("clear");
//        }
//    }
//    catch (final Exception e)
//    {
//        //  Handle any exceptions.
//    }
//}
       public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException 
    {
        
//        DsKhachHang x =new DsKhachHang();
//        HOADON hd= new HOADON();
//        x.nhapDsKH();
////        System.out.println("\n===================================");
////        x.xuat();
////        System.out.println("\n===================================");
////        x.timkiemKH();
//   
//        x.xuatDsKH();
//        
//        System.out.println("\n=====================================================================================================================================================");
//        hd.nhapHD();
//        x.timkiemKH();
//        hd.xuatds();
////  
//        DsNVGH ds=new DsNVGH();
//        ds.nhap();
//        System.out.println("\n=====================================================================================================================================================");
//        ds.xuat();
//        System.out.println("\n=====================================================================================================================================================");
        
        Scanner sc=new Scanner(System.in);
        DsKhachHang dskh= new DsKhachHang ();
        DSSP dssp= new DSSP();
        DsNVGH dsnvgh =new DsNVGH();
        DsNVVP dsnvvp =new DsNVVP();
        HOADON hd=new HOADON();
        int chon,n;
        do{
            System.out.println("1. Khách Hàng ");
            System.out.println("2. Sản Phẩm");
            System.out.println("3. Nhân Viên Giao Hàng");
            System.out.println("4. Nhân Viên Văn Phòng");
            System.out.println("5. Hóa Đơn");
            System.out.println("0. Thoát");
            System.out.println("*** Mời Bạn Nhập Lựa Chọn ***");
            chon=sc.nextInt();
                if(chon==1){
                    do{
//                        clearConsole();
                        System.out.println("1. Nhập Danh Sách Khách Hàng ");
                        System.out.println("2. Hiện Danh Sách Khách Hàng ");
                        System.out.println("3. Tìm Khách Hàng");
                        System.out.println("4. Sắp Xếp Khách Hàng");
                        System.out.println("5. Lưu File");
                        System.out.println("6. Đọc File");
                        System.out.println("0. Thoát");
                        n=sc.nextInt();
                        switch(n){
                            case 1: dskh.nhapDsKH();break;
                            case 2: dskh.xuatDsKH();break;
                            case 3: dskh.timkiemKH();break;
                            case 4: dskh.sapXep();break;
                            case 5: dskh.luuFile();break;
                            case 6: dskh.docFile();break;
                            case 0: break;
                            default:System.out.println("Nhập Sai");
                        }
                    }while(n!=0);}
                else if(chon==2){
                    do{
//                        clearConsole();
                        System.out.println("1. Nhập Danh Sách Sản Phẩm ");
                        System.out.println("2. Hiện Danh Sách Sản Phẩm ");
                        System.out.println("3. Tìm Sản Phẩm");
                        System.out.println("4. Tổng Tiền Sản Phẩm");
                        System.out.println("5. Lưu File");
                        System.out.println("6. Đọc File");
                        System.out.println("0. Thoát");
                        n=sc.nextInt();
                        switch(n){
                            case 1: dssp.nhap();break;
                            case 2: dssp.xuat();break;
                            case 3: dssp.timkiemSP();break;
                            case 4: dssp.tongTien();break;
                            case 5: dssp.luuFile();break;
                            case 6: dssp.docFile();break;
                            case 0: break;
                            default:System.out.println("Nhập Sai");
                        }
                    }while(n!=0);}
                else if(chon==3){
                    do{
                        System.out.println("1. Nhập Danh Sách Nhân Viên Giao Hàng");
                        System.out.println("2. Hiện Danh Sách Nhân Viên Giao Hàng");
                        System.out.println("3. Tìm Nhân Viên Giao Hàng");
                        System.out.println("4. Sắp Xếp Nhân Viên Giao Hàng ");     
                        System.out.println("5. Lưu File");
                        System.out.println("6. Đọc File");
                        System.out.println("0. Thoát");
                        n=sc.nextInt();
                        switch(n){
                            case 1: dsnvgh.nhap();break;
                            case 2: dsnvgh.xuat();break;
                            case 3: dsnvgh.timkiemNVGH();break;
                            case 4: dsnvgh.sapXep();break;
                            case 5: dsnvgh.luuFile();break;
                            case 6: dsnvgh.docFile();break;
                            case 0: break;
                            default:System.out.println("Nhập Sai");
                        }
                    }while(n!=0);}
                else if(chon==4){
                    do{
                        System.out.println("1. Nhập Danh Sách Nhân Viên Văn Phòng");
                        System.out.println("2. Hiện Danh Sách Nhân Viên Văn Phòng");
                        System.out.println("3. Tìm Nhân Viên Nhân Viên Văn Phòng");
                        System.out.println("4. Sắp Xếp Nhân Viên Văn Phòng ");   
                        System.out.println("5. Lưu File");
                        System.out.println("6. Đọc File");
                        System.out.println("0. Thoát");
                        n=sc.nextInt();
                        switch(n){
                            case 1: dsnvvp.nhap();break;
                            case 2: dsnvvp.xuat();break;
                            case 3: dsnvvp.timKiem();break;
                            case 4: dsnvvp.sapXep();break;
                            case 5: dsnvvp.luuFile();break;
                            case 6: dsnvvp.docFile();break;
                            case 0: break;
                            default:System.out.println("Nhập Sai");
                        }
                    }while(n!=0);}
                else if(chon==5){
                    do{
                        System.out.println("1. Nhập Hóa Đơn Của Khách Khàng");
                        System.out.println("2. Hiện Hóa Đơn Của Khách Hàng");                   
                        System.out.println("0. Thoát");
                        n=sc.nextInt();
                        switch(n){
                            case 1: hd.nhapHD();dskh.timkiem();break;
                            case 2: dskh.timkiemKH();hd.xuatds();break;
                            case 0: break;
                            default:System.out.println("Nhập Sai");
                        }
                    }while(n!=0);}
                else if(chon==0) System.exit(0);
                else System.out.println("Nhập Sai");
                  
            
        }while(chon!=0);
    }
}
