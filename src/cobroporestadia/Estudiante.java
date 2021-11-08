
package cobroporestadia;

import java.io.Serializable;


public class Estudiante implements Serializable{
    private String dd;
    
    private String nombres;
    private String apellidos;
    private String carne;
    private int edad;
    private String sexo;
    private String carrera;
    private int totalCreditos;
    private int cantidadCursosAprobados;
    
    
    

    public String getDd() {
        return dd;
    }

    public void setDd(String dd) {
        this.dd = dd;
    }

    

    
    
    public String getNombres() {
        
        System.out.println("Nombres:   " + nombres);
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        System.out.println("Apellidos   " + apellidos);
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarne() {
        System.out.println("Número de carné   " + carne);
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public int getEdad() {
        System.out.println("Edad:   " + edad);
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        System.out.println("Sexo:   " + sexo);
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getTotalCreditos() {
        return totalCreditos;
    }

    public void setTotalCreditos(int totalCreditos) {
        this.totalCreditos = totalCreditos;
    }

    public int getCantidadCursosAprobados() {
        return cantidadCursosAprobados;
    }

    public void setCantidadCursosAprobados(int cantidadCursosAprobados) {
        this.cantidadCursosAprobados = cantidadCursosAprobados;
    }
    
    
  
    
}
