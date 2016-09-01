/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author charles
 */
public class Burung extends Hewan{
    public Burung(String pNama)
    {
        setNama(pNama);
    }
    public String getNama()
    {
        return "Burung: "+super.getNama();
    }
    
}
