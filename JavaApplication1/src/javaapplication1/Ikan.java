/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Set;

/**
 *
 * @author charles
 */
public class Ikan extends Hewan {
    public Ikan(String pNama)
    {
        setNama(pNama);
    }
    public String getNama()
    {
        return "Ikan: "+super.getNama();
        
    }
}
