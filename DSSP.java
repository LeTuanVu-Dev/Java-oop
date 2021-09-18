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
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class DSSP  {
    private ArrayList<SANPHAM> lstSP=new ArrayList<>();
    public void nhap() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong san pham: ");
        n = sc.nextInt();
        lstSP=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SANPHAM x = new SANPHAM();
            x.nhap();
            lstSP.add(x);
        }
    }

    public void xuat() {
        System.out.print("\n DSSP \n");
        lstSP.forEach((x) -> {
            x.xuat();
        });
        System.out.println("");
    }

    public void tongTien() {
        float t = 0;
        for (int i = 0; i < lstSP.size(); i++) {
            t = t + lstSP.get(i).tongTien();
        }
        System.out.println("\nTong tien; " + t);
    }
//    public void locSP() {
//        
//    }
//    public void sapXep(){
//        
//    }
    public void timkiemSP()
    {
        Scanner sc=new Scanner(System.in);
        String input;
        input=sc.nextLine();
        for(int i = 0; i < lstSP.size(); i++)
        {
            if(input.toUpperCase().equals(lstSP.get(i).getTenSP()))
            {
                lstSP.get(i).xuat();
            }
        }
    }
    public void luuFile()
            throws FileNotFoundException, IOException
    {
        File f = new File("DanhSachSP.dat");
        FileOutputStream fout = new FileOutputStream(f); 
        ObjectOutputStream out = new ObjectOutputStream(fout) ;
        out.writeObject(lstSP);
        out.close();
        fout.close();
        
    }
    public void docFile()
            throws FileNotFoundException, IOException, ClassNotFoundException
    {
        File f = new File("DanhSachSP.dat");
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream in = new ObjectInputStream(fin);
            lstSP = new ArrayList<>();
            lstSP =(ArrayList)in.readObject();
        in.close();
        fin.close();
}
    
}
