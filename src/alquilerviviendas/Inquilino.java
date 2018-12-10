/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerviviendas;

/**
 *
 * @author matias
 */
public class Inquilino {
    private String Nombre;
    private long Dni;
    
    /**
     * 
     * @param Nombre
     * @param Dni 
     */
    public Inquilino(String Nombre, long Dni){
        this.Nombre=Nombre;
        this.Dni=Dni;
    }
    
    /**
     * 
     * @return Nombre 
     */
    public String getNombre(){
        return Nombre;
    }
}
