/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class DsKhachHang {
    private ArrayList<Khachhang> lstKH=new ArrayList<>();
    private String input;
    public void nhapDsKH() {
        int n;
        System.out.println("Nhap so khach hang: ");
        Scanner sc= new Scanner(System.in);
        sc=new Scanner(System.in); 
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Khachhang x = new Khachhang();
            x.nhapKH();
            lstKH.add(x);
        }
    }
//    lstKH=new Khachhang[n];
//    for(int i=0;i<n;i++)
//    {
//        lstKH[i]=new Khachhang();
//        lstKH[i].nhapKH();
//    }
//    }
    public void xuatDsKH() {
        System.out.print("\n DSKH \n");
        lstKH.forEach((x) -> {
            System.out.println("\n=====================================================================================================================================================");
            x.xuat();
        });
    }
    public void timkiem()
    {
        System.out.println("\nNhập họ tên khach  cần tìm");
        Scanner sc= new Scanner(System.in);
        input=sc.nextLine();
    }
    public void timkiemKH(){
//       System.out.println("\nNhập họ tên khach  cần tìm");
       //sc=new Scanner(System.in);
//       Scanner sc= new Scanner(System.in);
//       input=sc.nextLine();
       for(int i=0;i<lstKH.size();i++)
       {
           if(input.toUpperCase().equals(lstKH.get(i).gethoten().toUpperCase()))
           lstKH.get(i).xuat();
       }
    } 
    
//    public void locKH() {
//
//    }
    public void sapXep()
   {
       Collections.sort(lstKH, (Khachhang t, Khachhang t1) -> (t.gethoten().compareTo(t1.gethoten())));
       xuatDsKH();
   }
   public void luuFile()
            throws FileNotFoundException, IOException
    { 
        File f = new File("DanhSachKH.dat");
        FileOutputStream fout = new FileOutputStream(f); 
        ObjectOutputStream out = new ObjectOutputStream(fout) ;
        out.writeObject(lstKH);
        out.close();
        fout.close();


         
         
        
    }
    public void docFile()
            throws FileNotFoundException, IOException, ClassNotFoundException
    {
        File f = new File("DanhSachKH.dat");
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream in = new ObjectInputStream(fin);
            lstKH = new ArrayList<>();
            lstKH =(ArrayList)in.readObject();
        in.close();
        fin.close();
}
}
