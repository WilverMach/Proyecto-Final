/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobroporestadia;

import java.io.Serializable;

/**
 *
 * @author MACH
 */
public class Aprobados implements Serializable {
    private int semestreA;
    private String nombreA;
    private int codigoA;
    private int zonaA;
    private int examenFinalA;
    private String fechaA;
    
    

    public int getSemestreA() {
        return semestreA;
    }

    public void setSemestreA(int semestreA) {
        this.semestreA = semestreA;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public int getCodigoA() {
        return codigoA;
    }

    public void setCódigoA(int codigoA) {
        this.codigoA = codigoA;
    }

    public int getZonaA() {
        return zonaA;
    }

    public void setZonaA(int zonaA) {
        this.zonaA = zonaA;
    }

    public int getExamenFinalA() {
        return examenFinalA;
    }

    public void setExamenFinalA(int examenFinalA) {
        this.examenFinalA = examenFinalA;
    }

    public String getFechaA() {
        return fechaA;
    }

    public void setFechaA(String fechaA) {
        this.fechaA = fechaA;
    }

    void setCodigoA(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
