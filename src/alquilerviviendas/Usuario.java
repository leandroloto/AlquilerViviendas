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
public class Usuario {
    
  private String cuenta;
  private String contraseña;
  
  public Usuario(String cuenta,String contraseña){
      this.contraseña=contraseña;
      this.cuenta=cuenta;
  }
  
  public boolean ComprobarLogueo(String cuenta, String contraseña){
      return this.contraseña.equals(contraseña) && this.cuenta.equals(cuenta);
  }

    public String getCuenta() {
        return cuenta;
    }

    public String getContraseña() {
        return contraseña;
    }
}
