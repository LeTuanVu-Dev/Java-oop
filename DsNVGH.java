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
public class DsNVGH  {
    private ArrayList <NVGH> ds=new ArrayList<NVGH>();
   Scanner sc=new Scanner(System.in);
   public void nhap()
   {
       int n;
       System.out.println("Nhập số nhân viên ");
       n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           NVGH x= new NVGH();
           x.nhapNVGH();
           ds.add(x);
       }
   }
   public void xuat()
   {
       System.out.println("Danh sách nhân viên giao hàng đã nhập");     
       ds.forEach(l -> {
           l.xuatNVGH();
       });
       System.out.println("");
   }
   public void sapXep()
   {
       Collections.sort(ds, (NVVP t, NVVP t1) -> (t.getHoten().compareTo(t1.getHoten())));
       xuat();
   }
   public void timkiemNVGH()
   {
       String input;
       System.out.println("\nNhập ");
       input=sc.nextLine();
       for(int i=0;i<ds.size();i++)
       {
           if(input.toUpperCase().equals(ds.get(i).getHoten()))
               ds.get(i).xuatNVGH();
       }
   }
    public void luuFile()
            throws FileNotFoundException, IOException
    {
        File f = new File("DanhSachNVGH.dat");
        FileOutputStream fout = new FileOutputStream(f); 
        ObjectOutputStream out = new ObjectOutputStream(fout) ;
        out.writeObject(ds);
        out.close();
        fout.close();
        
    }
    public void docFile()
            throws FileNotFoundException, IOException, ClassNotFoundException
    {
        File f = new File("DanhSachNVGH.dat");
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream in = new ObjectInputStream(fin);
            ds =(ArrayList)in.readObject();
        in.close();
        fin.close();
    }
    
}
