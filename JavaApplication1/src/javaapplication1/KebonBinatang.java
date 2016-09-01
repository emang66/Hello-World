/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

/**
 *
 * @author charles
 */
public class KebonBinatang {
    Burung b;
    Ikan i;
    Vector<Hewan> hw = new Vector();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public KebonBinatang()
    {
        
    }
    public void TampilMenu()
    {
        System.out.println("Selamat datang di kebon binatang: ");
        System.out.println("1. Masukkan binatang");
        System.out.println("2. Tampil binatang");
        System.out.println("3. exit");
        System.out.print("Masukkan pilihan: ");
    }
    
    public void TampilSubMenu(String pPilihan) throws IOException
    {
        switch(pPilihan)
        {
            case "1":
                System.out.println("1. Burung: ");
                System.out.println("2. Ikan");
                System.out.print("Masukkan pilihan: ");
                TampilSubMenuSatu(br.readLine());
                break;
            case "2":
                PanggilBinatang();
                break;
            case "3":
                System.out.println("Terimakasih");
            default:
             break;
        }
    }
    public void TampilSubMenuSatu(String pPilihan) throws IOException
    {
        switch(pPilihan)
        {
            case "1":
                System.out.print("Masukkan Nama: ");
                TambahBurung(br.readLine());
                break;
            case "2":
                System.out.print("Masukkan Nama: ");
                TambahIkan(br.readLine());
                break;
            default:
                break;
        }
        
    }
    public void TambahBurung(String pNama)
    {
        b = new Burung(pNama);
        hw.add(b);
    }
    public void TambahIkan(String pNama)
    {
        i = new Ikan(pNama);
        hw.add(i);
    }
    public void PanggilBinatang()
    {
        System.out.println("Jumlah Binatang("+hw.size()+")");
        if(hw.size() >0)
        {
            for(int i=0; i< hw.size(); i++)
            {
                System.out.println(hw.get(i).getNama());
            }
        }
    }
    
}
