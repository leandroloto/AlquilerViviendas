/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerviviendas;
import java.math.BigDecimal;
/**
 *
 * @author Leandro
 */
public class Viviendas {
    
    protected int Identificador;
    protected float MetrosCuadrados;
    protected BigDecimal PrecioMensual;
    protected Inquilino Inquilinos;
    
    /**
     * 
     * @param Identificador
     * @param MetrosCuadrados
     * @param PrecioMensual 
     */
    public Viviendas(int Identificador, float MetrosCuadrados, BigDecimal PrecioMensual,Inquilino Inquilinos){
        this.Identificador=Identificador;
        this.MetrosCuadrados=MetrosCuadrados;
        this.PrecioMensual=PrecioMensual;
        this.Inquilinos=Inquilinos;
    }
}
