/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerviviendas;

import java.math.BigDecimal;

/**
 *
 * @author matias
 */
public class Pisos extends Viviendas{
    
    private boolean Amueblado;
    private int AnioConstruccion;
    
    /**
     * 
     * @param Identificador
     * @param MetrosCuadrados
     * @param PrecioMensual
     * @param Amueblado
     * @param AnioConstruccion 
     */
    public Pisos(int Identificador, float MetrosCuadrados, BigDecimal PrecioMensual,Inquilino Inquilinos,boolean Amueblado,int AnioConstruccion){
        super(Identificador,MetrosCuadrados,PrecioMensual,Inquilinos);
        this.Amueblado=Amueblado;
        this.AnioConstruccion=AnioConstruccion;
}
    
}
