/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tsiswanto.latmvc.model;

import id.tsiswanto.latmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 * NIM   : 10117065
 * Nama  : TEGUH SISWANTO
 * Kelas : IF-2
 * @author teguhsis
 */
public class PelangganModel {
    
    private String nama;
    private String email;
    private String noTelp;
    private PelangganListener listener;


    public PelangganListener getListener() {
        return listener;
    }

    public void setListener(PelangganListener listener) {
        this.listener = listener;
    }       
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fileOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fileOnChange();
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fileOnChange();
    }
    
    protected void fileOnChange(){
        if(listener!=null){
            listener.onChange(this);
        }
    }
    
    public void resetForm(){
        setNama("");
        setEmail("");
        setNoTelp("");
        
    }
    
     public void simpanForm(){
        JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        resetForm();
        
    }
}
