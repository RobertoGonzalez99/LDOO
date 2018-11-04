/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author luis_
 */
public class Persona {
    private String nom;
    private String mat;
    private String corr;
    private String tel; 
    private String pass;

    public Persona(String nom, String mat, String corr, String tel, String pass) {
        this.nom = nom;
        this.mat = mat;
        this.corr = corr;
        this.tel = tel;
    }

    public Persona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Persona(String mat, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getCorr() {
        return corr;
    }

    public void setCorr(String corr) {
        this.corr = corr;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
