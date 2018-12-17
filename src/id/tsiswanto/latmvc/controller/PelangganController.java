package id.tsiswanto.latmvc.controller;

import id.tsiswanto.latmvc.model.PelangganModel;
import id.tsiswanto.latmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 * NIM   : 10117065
 * Nama  : TEGUH SISWANTO
 * Kelas : IF-2
 * @author teguhsis
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    public void resetForm(PelangganView view){
        
        String nama  = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();
        
        if(nama.equals("") && email.equals("") && noTelp.equals("")){
            
        }else{
            model.resetForm();
        }
                
        
    }
    
    public void simpanForm(PelangganView view){
        
        String nama  = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();
        
        if(nama.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Name masih kosong");
        } else if (email.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Email masih kosong");
        } else if(noTelp.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Masukkan nomor telepon");
        }else{
            model.simpanForm();
        }
        
    }
    
}
