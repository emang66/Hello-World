/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author charles
 */
public class BukuTulis {
    File fl;
    public BukuTulis(String pPath)
    {
        fl = new File(pPath);
    }
    public void Tulis(String pKata, boolean pTimpa) throws IOException
    {
        FileWriter fr = new FileWriter(fl, pTimpa);
        PrintWriter pw = new PrintWriter(fr);
        pw.println(pKata);
        pw.close();
    }
    public void Baca() throws IOException
    {
        FileReader fd = new FileReader(fl);
        BufferedReader br = new BufferedReader(fd);
        
        String s= br.readLine();
        while(s != null)
        {
            System.out.println(s);
            s = br.readLine();
        }
    }
    
}
