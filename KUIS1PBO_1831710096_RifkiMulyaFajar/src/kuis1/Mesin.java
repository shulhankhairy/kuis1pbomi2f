/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author Lenovo
 */
public class Mesin {
    private String jenis;

    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    public void tampilMesin() {
        System.out.println("Mesin = " +jenis);
    }
}
