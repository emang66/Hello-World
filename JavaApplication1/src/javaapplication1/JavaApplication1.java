/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author charles
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
      /*  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        KebonBinatang bonbin = new KebonBinatang();
        String pilihan ="";
        do{
        bonbin.TampilMenu();
        pilihan = br.readLine();
        bonbin.TampilSubMenu(pilihan);
        }while(!pilihan.equals("3"));*/
        
        BukuTulis sindun = new BukuTulis("f:\\testing.txt");
        sindun.Tulis("OK DEHhh", true);
        sindun.Baca();
            
            
            
            
            
    }
    
}
