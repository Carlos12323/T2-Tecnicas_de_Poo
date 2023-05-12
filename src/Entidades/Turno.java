/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author ASUS
 */
public class Turno {
    
    private String profesor;
    private int Carpetas;
    private String aulas;

    /**
     * @return the profesor
     */
    public String getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    /**
     * @return the Carpetas
     */
    public int getCarpetas() {
        return Carpetas;
    }

    /**
     * @param Carpetas the Carpetas to set
     */
    public void setCarpetas(int Carpetas) {
        this.Carpetas = Carpetas;
    }

    /**
     * @return the aulas
     */
    public String getAulas() {
        return aulas;
    }

    /**
     * @param aulas the aulas to set
     */
    public void setAulas(String aulas) {
        this.aulas = aulas;
    }
}
