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
public class Chalets extends Viviendas{
    
    private boolean Piscina;
    
    /**
     * 
     * @param Identificador
     * @param MetrosCuadrados
     * @param PrecioMensual 
     * @param Piscina
     */
    public Chalets(int Identificador, float MetrosCuadrados, BigDecimal PrecioMensual,Inquilino Inquilinos,boolean Piscina){
        super(Identificador,MetrosCuadrados,PrecioMensual,Inquilinos);
        this.Piscina=Piscina;
    }
    
    
}
