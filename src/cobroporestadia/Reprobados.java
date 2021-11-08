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
public class Reprobados implements Serializable {
     private int semestreR;
    private String nombreR;
    private int codigoR;
    private int zonaR;
    private int examenFinalR;
    private String fechaR;
    
    

    public int getSemestreR() {
        return semestreR;
    }

    public void setSemestreR(int semestreR) {
        this.semestreR = semestreR;
    }

    public String getNombreR() {
        return nombreR;
    }

    public void setNombreR(String nombreR) {
        this.nombreR = nombreR;
    }

    public int getCodigoR() {
        return codigoR;
    }

    public void setCodigoR(int codigoR) {
        this.codigoR = codigoR;
    }

    public int getZonaR() {
        return zonaR;
    }

    public void setZonaR(int zonaR) {
        this.zonaR = zonaR;
    }

    public int getExamenFinalR() {
        return examenFinalR;
    }

    public void setExamenFinalR(int examenFinalR) {
        this.examenFinalR = examenFinalR;
    }

    public String getFechaR() {
        return fechaR;
    }

    public void setFechaR(String fechaR) {
        this.fechaR = fechaR;
    }
    
    
}
