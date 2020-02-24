/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CertificateOfDeposit;

/**
 *
 * @author Jose Luis Perez
 */
public class CertificateOfDeposit {

    private int dinero;
    private int certificado;
    private String apellido;
    private String fencido;
    private String femision;

    
    public CertificateOfDeposit(int certificado, String apellido, int dinero, int dia, int mes, int anio ){
        
        this.certificado = certificado;
        this.apellido = apellido;
        this.dinero =  dinero;
        this.femision = dia + "/" + mes + "/" + anio;
        this.fencido = dia + "/" + mes + "/" + (anio + 1);
    }
    
    public void setCertificado(int certificado){
        this.certificado = certificado;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public void setDinero(int dinero){
        this.dinero =  dinero;
    }
    
    public void setFemision(int dia, int mes, int anio){
        this.femision = dia + "/" + mes + "/" + anio;
    }
    
    public int getCertificado(){
        return this.certificado;
    }
    
    public String getApellido(){
        return  this.apellido;
    }
    
    public int getDinero(){
        return this.dinero;
    }
    
    public String getFemision(){
        return this.femision;
    }
    
    public String getFencido(){
        return this.fencido;
    }
}