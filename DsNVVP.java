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
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class DsNVVP {
    private ArrayList <NVVP> ds=new ArrayList<NVVP>();
   Scanner sc=new Scanner(System.in);
   public void nhap()
   {
       int n;
       System.out.println("Nhập số nhân viên ");
       n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           NVVP x= new NVVP();
           x.nhapNVVP();
           ds.add(x);
       }
   }
   public void xuat()
   {
       System.out.println("Danh sách nhân viên đã nhập");
       NVVP x= new NVVP();
       x.xuatds();
       ds.forEach(l -> {
           l.xuatNVVP();
       });
       System.out.println("");
   }
   public void timKiem()
   {
       String input;
       System.out.println("Nhập họ tên nhân viên cần tìm");
       sc.nextLine();
       input=sc.nextLine();
       for(int i=0;i<ds.size();i++)
       {
           if(input.toUpperCase().equals(ds.get(i).getHoten().toUpperCase()))
           ds.get(i).xuatNVVP();
       }
   }
   public void sapXep()
   {
       Collections.sort(ds, (NVVP t, NVVP t1) -> (t.getHoten().compareTo(t1.getHoten())));
       xuat();
   }
   public void luuFile()
            throws FileNotFoundException, IOException
    {
        File f = new File("DanhSachKhachHang.dat");
        FileOutputStream fout = new FileOutputStream(f); 
        ObjectOutputStream out = new ObjectOutputStream(fout) ;
        out.writeObject(ds);
        out.close();
        fout.close();
        
    }
    public void docFile()
            throws FileNotFoundException, IOException, ClassNotFoundException
    {
        File f = new File("DanhSachKhachHang.dat");
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream in = new ObjectInputStream(fin);
            ds = new ArrayList<>();
            ds =(ArrayList)in.readObject();
        in.close();
        fin.close();
    }
   
}
